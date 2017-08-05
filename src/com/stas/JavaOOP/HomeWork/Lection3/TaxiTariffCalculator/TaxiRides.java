package com.stas.JavaOOP.HomeWork.Lection3.TaxiTariffCalculator;

import java.util.*;

/**
 * Created by stanislavz on 03-Jul-17.
 */
public class TaxiRides {
    private ArrayList<TaxiRide> rides = new ArrayList<TaxiRide>();

    public void addRide(TaxiRide ride) {
        rides.add(ride);
    }

    public long getPrice(TaxiTariff tariff) {
        long sumOfRides = 0;
        for (TaxiRide ride: rides) {
            sumOfRides += tariff.calculatePrice(ride);
        }
        return sumOfRides;
    }


}
