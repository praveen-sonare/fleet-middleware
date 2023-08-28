package com.scooterson.middleware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
public class ControllerUser {

    private final Auth0Service auth0Service;
    @Autowired
    ControllerUser(Auth0Service auth0Service){
        this.auth0Service = auth0Service;
    }

    @PostMapping({"/addUser"})
    public void createUser(@RequestBody @Valid ObjectUser request){
        auth0Service.createUser(request.getProfile().email, request.getProfile().password);
    }

}
