package com.day_3.healthcheckpro;

public class Controller {

    @PublicAPI(description = "Get list of all available lab tests")
    public void getAllTests() {}

    @PublicAPI(description = "Book a lab test for a patient")
    @RequiresAuth(role = "PATIENT")
    public void bookTest() {}

    @RequiresAuth(role = "ADMIN")
    public void addNewTest() {}

    // Missing annotations (should be flagged)
    public void internalMethod() {}
}
