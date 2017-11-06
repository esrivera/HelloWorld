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
public class Record {

    private String symbol;
    private Share quantityOfShare;
    private PurchaseSale purchaseSaleDataTime;
    private PurchaseSale purchaseSalePrice;
    private Company[] companies;
    
    public Record(String symbol, Share quantityOfShare, PurchaseSale purchaseSaleDataTime, PurchaseSale purchaseSalePrice, Company[] companies) {
        this.symbol = symbol;
        this.quantityOfShare = quantityOfShare;
        this.purchaseSaleDataTime = purchaseSaleDataTime;
        this.purchaseSalePrice = purchaseSalePrice;
        this.companies = companies;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Share getQuantityOfShare() {
        return quantityOfShare;
    }

    public void setQuantityOfShare(Share quantityOfShare) {
        this.quantityOfShare = quantityOfShare;
    }

    public PurchaseSale getPurchaseSaleDataTime() {
        return purchaseSaleDataTime;
    }

    public void setPurchaseSaleDataTime(PurchaseSale purchaseSaleDataTime) {
        this.purchaseSaleDataTime = purchaseSaleDataTime;
    }

    public PurchaseSale getPurchaseSalePrice() {
        return purchaseSalePrice;
    }

    public void setPurchaseSalePrice(PurchaseSale purchaseSalePrice) {
        this.purchaseSalePrice = purchaseSalePrice;
    }

    public Company[] getCompanies() {
        return companies;
    }

    public void setCompanies(Company[] companies) {
        this.companies = companies;
    }
}
