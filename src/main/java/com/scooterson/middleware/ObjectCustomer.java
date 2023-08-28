package com.scooterson.middleware;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ObjectCustomer {
    private @NotNull String first_name;
    private @NotNull String last_name;
    private @NotNull String dob;
    private @NotNull String D_U_N_S;
    private @NotNull String tax_id;
    private @NotNull String entity_id;
    private Profile profile;
}
