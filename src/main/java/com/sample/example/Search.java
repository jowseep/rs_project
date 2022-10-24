package com.sample.example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import org.apache.commons.io.input.BOMInputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionSupport;

public class Search extends ActionSupport {

    ArrayList<IndividualStock> eachStockOrWhatevah = new ArrayList<IndividualStock>();
    US_Stocks usStocksOrWhatevah;
    private String keyword;
    int count = 0;
    String individualStock = "individual";
    String noResult = "noResult";
    
    public String execute() {

        try {
            URL url = new URL("https://www.rakuten-sec.co.jp/member/html/foreignRanking.json");
            HttpURLConnection hr = (HttpURLConnection) url.openConnection();

            if(hr.getResponseCode()==200) {
                InputStream im = hr.getInputStream();
                BOMInputStream bom = new BOMInputStream(im);
                BufferedReader br = new BufferedReader(new InputStreamReader(bom, StandardCharsets.UTF_8));
                String line;

                while((line=br.readLine())!=null) {
                    ObjectMapper mapper = new ObjectMapper();
                    usStocksOrWhatevah = mapper.readValue(line, US_Stocks.class);
                }

                for(int i=0; i<usStocksOrWhatevah.getUs_ranking().size(); i++) {
                    IndividualStock theStockOrWhatevah = new IndividualStock();
                        if(usStocksOrWhatevah.getUs_ranking().get(i).get(2).toString().toUpperCase().contains(keyword.toUpperCase())) {
                            theStockOrWhatevah.setId(usStocksOrWhatevah.getUs_ranking().get(i).get(0));
                            theStockOrWhatevah.setStatus(usStocksOrWhatevah.getUs_ranking().get(i).get(1));
                            theStockOrWhatevah.setTicker(usStocksOrWhatevah.getUs_ranking().get(i).get(2));
                            theStockOrWhatevah.setCompany_name(usStocksOrWhatevah.getUs_ranking().get(i).get(3));
                            theStockOrWhatevah.setCompany_type(usStocksOrWhatevah.getUs_ranking().get(i).get(4));
                            theStockOrWhatevah.setBlank(usStocksOrWhatevah.getUs_ranking().get(i).get(5));
                            theStockOrWhatevah.setNa(usStocksOrWhatevah.getUs_ranking().get(i).get(6));
                            eachStockOrWhatevah.add(theStockOrWhatevah);
                            count+=1;
                    }
                }

                br.close();
                hr.disconnect();
                im.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        if(count==1) {
            return individualStock;
        } else if(count==0) {
            return noResult;
        } else {
            return SUCCESS;
        }
    }

    public ArrayList<IndividualStock> getEachStockOrWhatevah() {
        return eachStockOrWhatevah;
    }

    public void setEachStockOrWhatevah(ArrayList<IndividualStock> eachStockOrWhatevah) {
        this.eachStockOrWhatevah = eachStockOrWhatevah;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public US_Stocks getUsStocksOrWhatevah() {
        return usStocksOrWhatevah;
    }

    public void setUsStocksOrWhatevah(US_Stocks usStocksOrWhatevah) {
        this.usStocksOrWhatevah = usStocksOrWhatevah;
    }

}
