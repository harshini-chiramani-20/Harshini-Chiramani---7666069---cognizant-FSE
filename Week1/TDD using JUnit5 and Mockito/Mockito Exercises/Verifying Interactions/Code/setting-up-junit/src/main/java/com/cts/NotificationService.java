package com.cts;

public class NotificationService {

    private ExternalApi api;

    public NotificationService(ExternalApi api) {
        this.api = api;
    }

    public void notifyUser(String message) {
        api.sendData(message);
    }
}