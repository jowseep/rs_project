package com.sample.example;

import com.opensymphony.xwork2.ActionSupport;

public class TickerChosen extends ActionSupport {
    
    private String keyword;

    public String execute() {
        return SUCCESS;
    }
    public String getKeyword() {
        return keyword;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    
}
