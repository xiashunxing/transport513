package com;

import javax.xml.crypto.Data;

public class Automobile extends LandTransport {
    public Automobile() {
    }

    public Automobile(String ownerShip, String GPSPosition, String price, String id, Data dataOfPurchase) {
        super(ownerShip, GPSPosition, price, id, dataOfPurchase);
    }
}
