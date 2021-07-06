package com.sudreeshya.daily.serializationdeserialization;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Builder
@ToString
public class UserData implements Serializable {
    private String username;
    private Long highScore;
    private Integer totalGamePlayed;
    private Integer level;
}
