package com;

import javax.xml.crypto.Data;

public class Motorcycle extends LandTransport {
    public Motorcycle() {
    }

    public Motorcycle(String ownerShip, String GPSPosition, String price, String id, Data dataOfPurchase) {
        super(ownerShip, GPSPosition, price, id, dataOfPurchase);
    }
}
