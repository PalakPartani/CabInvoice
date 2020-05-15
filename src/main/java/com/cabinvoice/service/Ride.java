package com.cabinvoice.service;

import com.cabinvoice.enums.RideCategory;

public class Ride {
    public double distance;
    public double time;
    public RideCategory rideCategory;

    public Ride(double distance, int time, RideCategory rideCategory) {
        this.distance = distance;
        this.time = time;
        this.rideCategory = rideCategory;
    }
}