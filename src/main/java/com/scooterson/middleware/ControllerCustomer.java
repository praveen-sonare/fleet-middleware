package com.scooterson.middleware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
public class ControllerCustomer {

    private final Auth0Service auth0Service;
    @Autowired
    ControllerCustomer(Auth0Service auth0Service){
        this.auth0Service = auth0Service;
    }

    @PostMapping({"/customer/addUser"})
    public void createUser(@RequestBody @Valid ObjectUser user){
        //auth0Service.createUser(request.getEmail(), request.getPassword());
    }

}
