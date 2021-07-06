package com.sudreeshya.daily.serializationdeserialization;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Staff implements Serializable {
    private Long id;
    private String name;
    private String departmentName;
}
