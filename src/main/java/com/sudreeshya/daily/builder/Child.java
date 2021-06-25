package com.sudreeshya.daily.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Child {

    private Long id;
    private String fname;
    private String lname;


}
