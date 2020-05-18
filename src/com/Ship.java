package com;

import javax.xml.crypto.Data;

public class Ship extends MaritimeMeansOfTransport {
    public Ship() {
    }

    public Ship(String ownerShip, String GPSPosition, String price, String id, Data dataOfPurchase) {
        super(ownerShip, GPSPosition, price, id, dataOfPurchase);
    }
}
