package com.annotationsandreflection.annotations.todoannotation;

class ProjectTasks {

    @Todo(
        task = "Implement login feature",
        assignedTo = "Aryaman",
        priority = "HIGH"
    )
    public void loginFeature() {
        System.out.println("Login feature");
    }

    @Todo(
        task = "Add payment integration",
        assignedTo = "Ravi"
    )
    public void paymentFeature() {
        System.out.println("Payment feature");
    }

    public void completedFeature() {
        System.out.println("Already completed");
    }
}
