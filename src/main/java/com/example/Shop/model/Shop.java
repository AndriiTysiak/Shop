package com.example.Shop.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Shop {
    private int shopId;
    private String address;
    private String name;
    private int employee;
    private boolean isInternetShop;

    public Shop(int shopId, String address, String name, int employee, boolean isInternetShop) {
        this.shopId = shopId;
        this.address = address;
        this.name = name;
        this.employee = employee;
        this.isInternetShop = isInternetShop;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployee() {
        return employee;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }

    public boolean isInternetShop() {
        return isInternetShop;
    }

    public void setInternetShop(boolean internetShop) {
        isInternetShop = internetShop;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", employee=" + employee +
                ", isInternetShop=" + isInternetShop +
                '}';
    }
}
