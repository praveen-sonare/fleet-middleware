package com.scooterson.middleware;

import javax.validation.constraints.NotNull;

public class Profile {
    public @NotNull String username;
    public @NotNull String password;
    public @NotNull String email;
    public byte[] profile_pic;
    public @NotNull String address_street;
    public @NotNull String address_country_id;
    public @NotNull String address_zip;
    public @NotNull String phone_number;
    public int country_code;
    public int phone_type_id;
    public @NotNull String created_at;
    public @NotNull String updated_at;
    public boolean is_active;
}
