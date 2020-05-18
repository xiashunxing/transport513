package com;

import javax.xml.crypto.Data;

public class Hovercraft extends MaritimeMeansOfTransport {
    public Hovercraft() {
    }

    public Hovercraft(String ownerShip, String GPSPosition, String price, String id, Data dataOfPurchase) {
        super(ownerShip, GPSPosition, price, id, dataOfPurchase);
    }
}
