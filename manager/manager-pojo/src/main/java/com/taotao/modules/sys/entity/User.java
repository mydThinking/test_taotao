package com.taotao.modules.sys.entity;

import java.io.Serializable;

/**
 * @author myd
 */
public class User implements Serializable {

    private static final long serialVersionUID = -5639924782841705482L;
    private Long id;
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
