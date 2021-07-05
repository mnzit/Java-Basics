package com.sudreeshya.daily.facade;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@Setter
public class JobDetail {
    private String companyImageUrl;
    private String title;
    private String company;
    private String companyAddress;
    private List<String> keySkills;
}
