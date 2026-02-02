package com.optionalclass.scenario4;

public class DeliveryPartner {

    private String partnerName;

    public DeliveryPartner(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getPartnerName() { return partnerName; }

    @Override
    public String toString() {
        return partnerName;
    }
}
