/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinepurchaseofmedicine;

/**
 *
 * @author 2ndyrGroupB
 */
public class Medicine {
    private String brandName;
    private String genericName;
    private int price;

    public Medicine() {
    }
    
    
    public Medicine(String brandName, String genericName, int price) {
        this.brandName = brandName;
        this.genericName = genericName;
        this.price = price;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getGenericName() {
        return genericName;
    }

    public int getPrice() {
        return price;
    }
    
}


