package com.optionalclass.scenario4;

import java.util.Optional;

public class Product {

    private String name;
    private Double discount;
    private String couponCode;
    private String description;
    private Seller seller;
    private DeliveryPartner deliveryPartner;

    public Product(String name, Double discount, String couponCode,
                   String description, Seller seller, DeliveryPartner deliveryPartner) {
        this.name = name;
        this.discount = discount;
        this.couponCode = couponCode;
        this.description = description;
        this.seller = seller;
        this.deliveryPartner = deliveryPartner;
    }

    public String getName() { return name; }

    public Optional<Double> getDiscount() {
        return Optional.ofNullable(discount);
    }

    public Optional<String> getCouponCode() {
        return Optional.ofNullable(couponCode);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    public Optional<Seller> getSeller() {
        return Optional.ofNullable(seller);
    }

    public Optional<DeliveryPartner> getDeliveryPartner() {
        return Optional.ofNullable(deliveryPartner);
    }
}
