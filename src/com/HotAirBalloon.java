package com;

import javax.xml.crypto.Data;

public class HotAirBalloon extends AirTransport {
    public HotAirBalloon() {
    }

    public HotAirBalloon(String ownerShip, String GPSPosition, String price, String id, Data dataOfPurchase) {
        super(ownerShip, GPSPosition, price, id, dataOfPurchase);
    }
}
