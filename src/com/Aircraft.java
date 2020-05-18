package com;

import javax.xml.crypto.Data;

public class Aircraft extends AirTransport {
    public Aircraft() {
    }

    public Aircraft(String ownerShip, String GPSPosition, String price, String id, Data dataOfPurchase) {
        super(ownerShip, GPSPosition, price, id, dataOfPurchase);
    }
}
