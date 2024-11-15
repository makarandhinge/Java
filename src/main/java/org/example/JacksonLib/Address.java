package org.example.JacksonLib;

public class Address {
    private String street;
    private String city;
    private String zipCode;
    private String state;

    public Address() {
    }

    public Address(String street, String city, String zipCode, String state) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getState() {
        return state;
    }
}
