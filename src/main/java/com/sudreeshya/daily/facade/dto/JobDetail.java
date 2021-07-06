package com.sudreeshya.daily.facade.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@ToString
@Setter
public class JobDetail implements Serializable {
    private String companyImageUrl;
    private String title;
    private String company;
    private String companyAddress;
    private List<String> keySkills;
}
