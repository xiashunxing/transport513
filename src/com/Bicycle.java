package com;

import javax.xml.crypto.Data;

public class Bicycle extends LandTransport {
    public Bicycle() {
    }

    public Bicycle(String ownerShip, String GPSPosition, String price, String id, Data dataOfPurchase) {
        super(ownerShip, GPSPosition, price, id, dataOfPurchase);
    }
}
