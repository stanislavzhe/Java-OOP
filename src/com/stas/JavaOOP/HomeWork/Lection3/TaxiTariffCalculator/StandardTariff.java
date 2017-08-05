package com.stas.JavaOOP.HomeWork.Lection3.TaxiTariffCalculator;

/**
 * Created by stanislavz on 03-Jul-17.
 */
public class StandardTariff implements TaxiTariff{

    @Override
    public long calculatePrice(TaxiRide ride) {
        return 30 + 5 * ride.getDistance() + 2 * ride.getDuration();
    }
}
