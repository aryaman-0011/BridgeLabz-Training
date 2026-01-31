package com.functionalinterfaces.datatagging;

public class TaggingMain {

    public static void main(String[] args) {

        EncryptionService service = new EncryptionService();

        CustomerDetails customer = new CustomerDetails("Aryaman", "1234-5678-9012");
        ProductInfo product = new ProductInfo("Insurance Plan");

        service.process(customer); // encrypted
        service.process(product);  // not encrypted
    }
}
