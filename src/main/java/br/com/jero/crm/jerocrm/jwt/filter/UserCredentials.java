package br.com.jero.crm.jerocrm.jwt.filter;

import lombok.Data;

@Data
public class UserCredentials {

    private String username;
    private String password;

}