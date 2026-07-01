package com.cts;

public class Customer {

    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display() {
        System.out.println("Customer Address: " + address.getCity());
    }
}