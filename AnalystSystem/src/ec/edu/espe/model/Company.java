/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Santiago
 */
class Company {

    private String name;
    private String symbol;
    private Investor[] investors;
    private Share[] shares;
    private Analyst[] analysts;
    private Record record;
    
    public Company(String name, String symbol, Investor[] investors, Share[] shares, Analyst[] analysts, Record record) {
        this.name = name;
        this.symbol = symbol;
        this.investors = investors;
        this.shares = shares;
        this.analysts = analysts;
        this.record = record;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Investor[] getInvestors() {
        return investors;
    }

    public void setInvestors(Investor[] investors) {
        this.investors = investors;
    }

    public Share[] getShares() {
        return shares;
    }

    public void setShares(Share[] shares) {
        this.shares = shares;
    }

    public Analyst[] getAnalysts() {
        return analysts;
    }

    public void setAnalysts(Analyst[] analysts) {
        this.analysts = analysts;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }   
}
