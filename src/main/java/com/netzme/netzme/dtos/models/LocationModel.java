package com.netzme.netzme.dtos.models;

import lombok.Data;

@Data
public class LocationModel {
    private StreetModel street;
    private String city;
    private String state;
    private String country;
    private Integer postcode;
    private CoordinatesModel coordinates;
    private TimezoneModel timezone;
}
