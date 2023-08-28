package com.scooterson.middleware;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ObjectVehicleOwnerMapper {
    private @NotNull String vehicle_id;
    private @NotNull String customer_id;
}
