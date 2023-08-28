package com.scooterson.middleware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
public class ControllerRide {

    private final Auth0Service auth0Service;
    @Autowired
    ControllerRide(Auth0Service auth0Service){
        this.auth0Service = auth0Service;
    }

    @PostMapping({"/ride/start"})
    public void StartRide(@RequestBody @Valid ObjectRide ride){
        //auth0Service.createUser(request.getEmail(), request.getPassword());
    }

    @GetMapping({"/ride/stop"})
    public void StopRide(@RequestBody @Valid ObjectRide ride){
        //auth0Service.createUser(request.getEmail(), request.getPassword());
    }

}
