package com.netzme.netzme.dtos.models;

import lombok.Data;

@Data
public class Result {
    private String gender;
    private NameModel name;
    private LocationModel location;
    private String email;
    private LoginModel login;
    private DateOfBirthModel dob;
    private RegisteredModel registered;
    private String phone;
    private String cell;
    private IdModel id;
    private PictureModel picture;
    private String nat;
}
