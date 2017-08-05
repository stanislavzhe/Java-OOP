package com.stas.JavaOOP.HomeWork.Lection3.TaxiTariffCalculator;

/**
 * Created by stanislavz on 03-Jul-17.
 */
public class FamilyTariff implements TaxiTariff{

    @Override
    public long calculatePrice(TaxiRide ride) {
        return 50 + 20 * ride.getDistance()  / ride.getPassengers();
    }
}
