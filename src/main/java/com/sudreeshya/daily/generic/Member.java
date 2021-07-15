package com.sudreeshya.daily.generic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Member {

    private Long id;
    private String name;

    public Member(Long id) {
        this.id = id;
    }
}
