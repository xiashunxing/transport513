package com;

import javax.xml.crypto.Data;

public class Airship extends AirTransport {
    public Airship() {
    }

    public Airship(String ownerShip, String GPSPosition, String price, String id, Data dataOfPurchase) {
        super(ownerShip, GPSPosition, price, id, dataOfPurchase);
    }
}
