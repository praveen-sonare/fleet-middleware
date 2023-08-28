package com.scooterson.middleware;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ObjectTenant {
    public @NotNull String first_name;
    public @NotNull String last_name;
    public @NotNull String dob;
    public Profile profile;
}
