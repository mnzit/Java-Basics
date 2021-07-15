package com.sudreeshya.daily.generic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NormalMember extends Member{

    private Double allowance;

    public NormalMember(Long id) {
        super(id);
    }
}
