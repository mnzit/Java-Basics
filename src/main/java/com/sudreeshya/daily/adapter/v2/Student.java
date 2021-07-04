package com.sudreeshya.daily.adapter.v2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Student {
    private Long id;
    private String fname;
    private String lname;
    private String gender;
    private Integer age;
}
