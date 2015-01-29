package com.zenika.resanet.gwt.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LoginDto implements Serializable {

    private String user;

    private String password;

    public LoginDto(String user, String password) {
        super();
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginDto() {
    }

}
