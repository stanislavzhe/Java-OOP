package com.stas.JavaOOP.HomeWork.Lection3.TaxiTariffCalculator;

/**
 * Created by stanislavz on 04-Jul-17.
 */
public class Main {
    public static void main(String[] args) {

        TaxiRides rides = new TaxiRides();
        TaxiRide ride1 = new TaxiRide(1, 3, 10);
        TaxiRide ride2 = new TaxiRide(1, 3, 10);
        rides.addRide(ride1);
        rides.addRide(ride2);
        System.out.println("All rides price for first tariff: " + rides.getPrice(new StandardTariff()));
        System.out.println("All rides price for second tariff: " + rides.getPrice(new FamilyTariff()));

    }
}
