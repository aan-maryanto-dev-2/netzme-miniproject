package com.netzme.netzme.dtos.models;

import lombok.Data;

@Data
public class LoginModel {
    private String uuid;
    private String username;
    private String password;
    private String salt;
    private String md5;
    private String sha1;
    private String sha256;
}
