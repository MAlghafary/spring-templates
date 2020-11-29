package com.mutaz.springtemplates.domain;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
public class UserAuthority implements GrantedAuthority {
    @Id
    private long id;
    private String username;
    private String authority;

    @Override
    public String getAuthority() {
        return authority;
    }
}
