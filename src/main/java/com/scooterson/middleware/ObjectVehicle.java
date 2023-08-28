package com.scooterson.middleware;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ObjectVehicle {
    private String uuid;
    private String public_key;
    private String vehicle_name;
    private String iot_device_id;
    private int iot_device_type_id;
    private int qa_details_id;
    private int vehicle_type_id;
    private int vehicle_model_id;
    private int vehicle_color_id;
    private int manufac_state_id;
    private int manufac_state_user_id; //[note: 'Who is handling the manufac stage']
    private int battery_cycle;
    private String battery_serial_number;
    private String battery_firmware_version;
    private String controller_serial_number;
    private String controller_software_version;
    private String motor_serial;
    private String particle_id;
    private String particle_firmware;
    private String particle_firmware_version;
    private int odo;
    private int height;
    private int length;
    private int width;
    private int weight;
    private String is_available;	// [default: true, note: 'true = available for Rent, false = unavailable']
    private boolean status;		//[default: true, note: 'By default set to true. If deleted, set to false.']
    private String created_at;
    private String updated_at;

    // dependency
}
