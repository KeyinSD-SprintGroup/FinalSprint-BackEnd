package com.keyin.authorities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Authorities implements Serializable {
    @Id
    private String username;
    @Id
    private String authority;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
