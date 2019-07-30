package com.ridezum;

public class User {


    private String firstName;
    private String lastName;
    private String emale;
    private  String phoneNumber;
    private String area;
    private String zipCode;

    public User(String firstName,String lastName,String email,String phoneNumber,String area,String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emale = email;
        this.phoneNumber = phoneNumber;
        this.area = area;
        this.zipCode = zipCode;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmale() {
        return emale;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getArea() {
        return area;
    }
    public String getZipCode() {
        return zipCode;
    }





}
