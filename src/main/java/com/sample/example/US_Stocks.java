package com.sample.example;

import java.util.ArrayList;
import java.util.List;

public class US_Stocks {
    private String update;
    private String term;
    private List<List<String>> us_ranking = new ArrayList<>();

    private List<List<String>> us_etf_ranking = new ArrayList<>();
    private List<List<String>> us_adr_ranking = new ArrayList<>();
    private List<List<String>> ch_ranking = new ArrayList<>();
    private List<List<String>> ch_etf_ranking = new ArrayList<>();
    private List<List<String>> as_ranking = new ArrayList<>();

    public US_Stocks() {};

    public US_Stocks(String update, String term, List<List<String>> us_ranking) {
        this.update = update;
        this.term = term;
        this.us_ranking = us_ranking;
    }

    public US_Stocks(String update, String term, List<List<String>> us_ranking, List<List<String>> us_etf_ranking, List<List<String>> us_adr_ranking, List<List<String>> ch_ranking, List<List<String>> ch_etf_ranking, List<List<String>> as_ranking) {
        this.update = update;
        this.term = term;
        this.us_ranking = us_ranking;
        this.us_etf_ranking = us_etf_ranking;
        this.us_adr_ranking = us_adr_ranking;
        this.ch_ranking = ch_ranking;
        this.ch_etf_ranking = ch_etf_ranking;
        this.as_ranking = as_ranking;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public List<List<String>> getUs_ranking() {
        return us_ranking;
    }

    public void setUs_ranking(List<List<String>> us_ranking) {
        this.us_ranking = us_ranking;
    }

    // kanang additional lang gudst

    public List<List<String>> getUs_etf_ranking() {
        return us_etf_ranking;
    }

    public void setUs_etf_ranking(List<List<String>> us_etf_ranking) {
        this.us_etf_ranking = us_etf_ranking;
    }

    public List<List<String>> getUs_adr_ranking() {
        return us_adr_ranking;
    }

    public void setUs_adr_ranking(List<List<String>> us_adr_ranking) {
        this.us_adr_ranking = us_adr_ranking;
    }

    public List<List<String>> getCh_ranking() {
        return ch_ranking;
    }

    public void setCh_ranking(List<List<String>> ch_ranking) {
        this.ch_ranking = ch_ranking;
    }

    public List<List<String>> getCh_etf_ranking() {
        return ch_etf_ranking;
    }

    public void setCh_etf_ranking(List<List<String>> ch_etf_ranking) {
        this.ch_etf_ranking = ch_etf_ranking;
    }

    public List<List<String>> getAs_ranking() {
        return as_ranking;
    }

    public void setAs_ranking(List<List<String>> as_ranking) {
        this.as_ranking = as_ranking;
    }
}
