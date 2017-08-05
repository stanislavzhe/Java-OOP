package com.stas.JavaOOP.HomeWork.Lection3.TaxiTariffCalculator;

/**
 * Created by stanislavz on 03-Jul-17.
 */
public class TaxiRide {
    private int passengers;
    private long distance;
    private long duration;

    TaxiRide(int passengers, long distance, long duration) {
        if (passengers <= 0) {
            throw new IllegalArgumentException("passengers <= 0: " + passengers);
        }
        if (distance <= 0) {
            throw new IllegalArgumentException("distance <= 0: " + distance);
        }
        if (duration <= 0) {
            throw new IllegalArgumentException("duration <= 0: " + duration);
        }
        this.passengers = passengers;
        this.distance = distance;
        this.duration = duration;
    }

    public int getPassengers() {
        return passengers;
    }

    public long getDistance() {
        return distance;
    }

    public long getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "TaxiRide{" +
                "passengers=" + passengers +
                ", distance=" + distance +
                ", duration=" + duration +
                '}';
    }
}