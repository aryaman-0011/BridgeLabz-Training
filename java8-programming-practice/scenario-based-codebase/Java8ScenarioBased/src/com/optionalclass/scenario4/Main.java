package com.optionalclass.scenario4;

public class Main {

    public static void main(String[] args) {

        Seller seller = new Seller("TechStore", "9999999999");
        DeliveryPartner dp = new DeliveryPartner("FastExpress");

        Product product = new Product(
                "Laptop",
                null,          // no discount
                null,          // no coupon
                null,          // no description
                seller,
                dp
        );

        // Apply discount or default
        System.out.println("Discount: " +
                product.getDiscount().orElse(5.0) + "%");

        // Coupon code logic
        product.getCouponCode()
                .ifPresent(c -> System.out.println("Coupon Applied: " + c));

        // Seller details safely
        System.out.println("Seller: " +
                product.getSeller()
                        .map(Seller::toString)
                        .orElse("Seller not available"));

        // Description fallback
        System.out.println("Description: " +
                product.getDescription().orElse("No description available"));

        // Delivery partner info
        System.out.println("Delivery Partner: " +
                product.getDeliveryPartner()
                        .map(DeliveryPartner::getPartnerName)
                        .orElse("No Delivery Partner"));
    }
}
