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
public class PurchaseSale {

    private Share[] shares;
    private float pricePurchaseSale;
    private float dataPurchaseSale;
    
    public PurchaseSale(Share[] shares, float pricePurchaseSale, float dataPurchaseSale) {
        this.shares = shares;
        this.pricePurchaseSale = pricePurchaseSale;
        this.dataPurchaseSale = dataPurchaseSale;
    }

    public Share[] getShares() {
        return shares;
    }

    public void setShares(Share[] shares) {
        this.shares = shares;
    }

    public float getPricePurchaseSale() {
        return pricePurchaseSale;
    }

    public void setPricePurchaseSale(float pricePurchaseSale) {
        this.pricePurchaseSale = pricePurchaseSale;
    }

    public float getDataPurchaseSale() {
        return dataPurchaseSale;
    }

    public void setDataPurchaseSale(float dataPurchaseSale) {
        this.dataPurchaseSale = dataPurchaseSale;
    }    
}
