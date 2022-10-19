package com.sample.example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.input.BOMInputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionSupport;

public class Hello extends ActionSupport {

    US_Stocks us_stocks;
    
    public String execute() {

        try {
            URL url = new URL("https://www.rakuten-sec.co.jp/member/html/foreignRanking.json");
            HttpURLConnection hr = (HttpURLConnection) url.openConnection();

            if(hr.getResponseCode()==200) {
                InputStream im = hr.getInputStream();
                BOMInputStream bom = new BOMInputStream(im);
                // StringBuffer sb = new StringBuffer();
                BufferedReader br = new BufferedReader(new InputStreamReader(bom, StandardCharsets.UTF_8));
                String line;

                while((line=br.readLine())!=null) {
                    // System.out.println(line);
                    // line = br.readLine();
                    ObjectMapper mapper = new ObjectMapper();
                    us_stocks = mapper.readValue(line, US_Stocks.class);
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

    
}
