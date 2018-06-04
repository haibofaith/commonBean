package com.haibo.common.request;

import java.io.Serializable;

public class UserRequest implements Serializable{
    private String name;
    private String password;

    public UserRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
