package com.works.prototype;

import java.util.*;

public class Address implements IAddress{

    private String city;
    private int no;
    private String street;
    private String zipcode;

    @Override
    public Address addressClone() {
        Map<String, String> hm1 = new HashMap<>();
        Map<String, String> hm = new LinkedHashMap<>();
        Set<String> sets = new HashSet<>();
        Set<String> linkedSet = new LinkedHashSet<>();
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", no=" + no +
                ", street='" + street + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
