package com;

import javax.xml.crypto.Data;

public class LandTransport {
    String OwnerShip;
    String GPSPosition;
    String price;
    String id;
    Data dataOfPurchase;

    public LandTransport() {
    }

    public LandTransport(String ownerShip, String GPSPosition, String price, String id, Data dataOfPurchase) {
        OwnerShip = ownerShip;
        this.GPSPosition = GPSPosition;
        this.price = price;
        this.id = id;
        this.dataOfPurchase = dataOfPurchase;
    }

    public void drivingMethod(){};

    public String getOwnerShip() {
        return OwnerShip;
    }

    public void setOwnerShip(String ownerShip) {
        OwnerShip = ownerShip;
    }

    public String getGPSPosition() {
        return GPSPosition;
    }

    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Data getDataOfPurchase() {
        return dataOfPurchase;
    }

    public void setDataOfPurchase(Data dataOfPurchase) {
        this.dataOfPurchase = dataOfPurchase;
    }
}
