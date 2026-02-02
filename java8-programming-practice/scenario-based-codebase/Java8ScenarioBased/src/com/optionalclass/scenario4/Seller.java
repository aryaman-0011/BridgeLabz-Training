package com.optionalclass.scenario4;

public class Seller {

    private String sellerName;
    private String contact;

    public Seller(String sellerName, String contact) {
        this.sellerName = sellerName;
        this.contact = contact;
    }

    public String getSellerName() { return sellerName; }
    public String getContact() { return contact; }

    @Override
    public String toString() {
        return sellerName + " (" + contact + ")";
    }
}
