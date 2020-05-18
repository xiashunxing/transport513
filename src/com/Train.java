package com;

import javax.xml.crypto.Data;

public class Train extends LandTransport {
    public Train() {
    }

    public Train(String ownerShip, String GPSPosition, String price, String id, Data dataOfPurchase) {
        super(ownerShip, GPSPosition, price, id, dataOfPurchase);
    }
}
