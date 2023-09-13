package com.netzme.netzme.dtos.models;

import lombok.Data;

@Data
public class InfoModel {
    private String seed;
    private Integer results;
    private Integer page;
    private String version;
}
