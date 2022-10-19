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

public class Hello extends ActionSupport {

    ArrayList<IndividualStock> eachStock = new ArrayList<IndividualStock>();
    US_Stocks us_stocks;
    
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
                    us_stocks = mapper.readValue(line, US_Stocks.class);
                }

                for(int i=0; i<us_stocks.getUs_ranking().size(); i++) {
                    IndividualStock theStock = new IndividualStock();
                    theStock.setId(us_stocks.getUs_ranking().get(i).get(0));
                    theStock.setStatus(us_stocks.getUs_ranking().get(i).get(1));
                    theStock.setTicker(us_stocks.getUs_ranking().get(i).get(2));
                    theStock.setCompany_name(us_stocks.getUs_ranking().get(i).get(3));
                    theStock.setCompany_type(us_stocks.getUs_ranking().get(i).get(4));
                    theStock.setBlank(us_stocks.getUs_ranking().get(i).get(5));
                    theStock.setNa(us_stocks.getUs_ranking().get(i).get(5));
                    eachStock.add(theStock);
                }

                br.close();
                hr.disconnect();
                im.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return SUCCESS;
    }

    public US_Stocks getUs_stocks() {
        return us_stocks;
    }

    public void setUs_stocks(US_Stocks us_stocks) {
        this.us_stocks = us_stocks;
    }

    public ArrayList<IndividualStock> getEachStock() {
        return eachStock;
    }

    public void setEachStock(ArrayList<IndividualStock> eachStock) {
        this.eachStock = eachStock;
    }

}
