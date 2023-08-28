package com.scooterson.middleware;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ObjectRide {
    private int rider_id;
    private int transaction_id;
    private int vehicle_id;
    private String ride_start_time;
    private String ride_end_time;
    private int start_odo;
    private int end_odo;
    private int vehicle_check_before_ride;
    private int vehicle_check_after_ride;
    private int status; //[note: 'Initialize, Pre Verification, InProgress, Completed, Post Verification, Checkout']
}
