package com.day_3.eventtracker;

public class UserService {

    @AuditTrail(eventName = "User Login")
    public void login() {}

    @AuditTrail(eventName = "File Upload")
    public void uploadFile() {}

    public void viewDashboard() {}  // Not audited

    @AuditTrail(eventName = "Delete File")
    public void deleteFile() {}
}
