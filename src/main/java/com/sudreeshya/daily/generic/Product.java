package com.sudreeshya.daily.generic;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Product<T extends Member> {
    private Long id;
    private String name;
    private String description;
    private Date createdDate;
    private T createdBy;
}
