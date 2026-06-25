package com.cts;

public class DataService {

    private ExternalApi api;

    public DataService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

}