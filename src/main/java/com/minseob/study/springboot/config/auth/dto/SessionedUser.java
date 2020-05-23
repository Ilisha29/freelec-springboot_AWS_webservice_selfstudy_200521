package com.minseob.study.springboot.config.auth.dto;

import com.minseob.study.springboot.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionedUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionedUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
