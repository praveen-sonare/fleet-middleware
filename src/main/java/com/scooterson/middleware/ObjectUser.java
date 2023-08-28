package com.scooterson.middleware;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

public enum Department {
  SUPPORT(0),
  FINANCE(1),
};
@Getter
@Setter
public class ObjectUser {
    private @NotNull String first_name;
    private @NotNull String last_name;
    private @NotNull String dob;
    private int department; // [0. Support, 1. Finannce, etc ]
    private @NotNull String gender;
    private String user_id;
    private String user_id_type;
    private String about;
    private String driving_license;
    private String dl_issue_authority;
    private String dl_issue_place;
    private String dl_expiry;
    private Profile profile;
}
