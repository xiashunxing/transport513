package com;

import javax.xml.crypto.Data;

public class Submarine extends MaritimeMeansOfTransport {
    public Submarine() {
    }

    public Submarine(String ownerShip, String GPSPosition, String price, String id, Data dataOfPurchase) {
        super(ownerShip, GPSPosition, price, id, dataOfPurchase);
    }
}
