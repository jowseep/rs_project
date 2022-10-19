package com.sample.example;

public class IndividualStock {
    private String id;
    private String status;
    private String ticker;
    private String company_name;
    private String company_type;
    private String blank;
    private String na;

    public IndividualStock() {}

    public IndividualStock(String id, String status, String ticker, String company_name, String company_type, String blank, String na) {
        this.id = id;
        this.status = status;
        this.ticker = ticker;
        this.company_name = company_name;
        this.company_type = company_type;
        this.blank = blank;
        this.na = na;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_type() {
        return company_type;
    }

    public void setCompany_type(String company_type) {
        this.company_type = company_type;
    }

    public String getBlank() {
        return blank;
    }

    public void setBlank(String blank) {
        this.blank = blank;
    }

    public String getNa() {
        return na;
    }

    public void setNa(String na) {
        this.na = na;
    }

}
