package com.sudreeshya.daily.facade;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Job implements Serializable {
    private Long id;
    private String title;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("job_details")
    private String jobDetails;
    private Apply apply;
    @JsonProperty("apply_button_option")
    private String applyButtonOption;
    private Company company;

    @ToString
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Apply implements Serializable {
        private Boolean status;
    }

    @ToString
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Company implements Serializable {
        private Long id;
        private String name;
        private String url;
        @JsonProperty("profile_picture")
        private String profilePicture;
        @JsonProperty("cover_picture")
        private String coverPicture;
    }
}
