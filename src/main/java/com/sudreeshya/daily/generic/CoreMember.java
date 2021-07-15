package com.sudreeshya.daily.generic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CoreMember extends Member{

    private Integer shareCount;

    public CoreMember(Long id) {
        super(id);
    }
}
