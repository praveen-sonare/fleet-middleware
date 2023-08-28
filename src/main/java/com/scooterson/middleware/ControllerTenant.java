package com.scooterson.middleware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
public class ControllerTenant {

    private final Auth0Service auth0Service;
    @Autowired
    ControllerTenant(Auth0Service auth0Service){
        this.auth0Service = auth0Service;
    }

    @PostMapping({"/tenant/addTenant"})
    public void createUser(@RequestBody @Valid ObjectTenant request){
        //auth0Service.createUser(request.getEmail(), request.getPassword());
    }

    @PostMapping({"/tenant/addCustomer"})
    public void createUser(@RequestBody @Valid ObjectCustomer request){
        //auth0Service.createUser(request.getEmail(), request.getPassword());
    }

    @PostMapping({"/tenant/addVehicle"})
    public void AddVehicle(@RequestBody @Valid ObjectVehicle vehicle){
        //auth0Service.createUser(request.getEmail(), request.getPassword());
    }

    @PostMapping({"/tenant/removeVehicle"})
    public void RemoveVehicle(@RequestBody @Valid ObjectVehicle vehicle){
        //auth0Service.createUser(request.getEmail(), request.getPassword());
    }

    @PostMapping({"/tenant/mapVehicleOwner"})
    public void MapVehicleToOwner(@RequestBody @Valid ObjectVehicleOwnerMapper mapper){
        //auth0Service.createUser(request.getEmail(), request.getPassword());
    }


}
