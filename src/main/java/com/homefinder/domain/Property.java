package com.homefinder.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Builder
public class Property {

    private Integer id;
    private String description;
    private String title;
    private String propertyType;
    private Date dateCreated;
    private boolean isAvailable;
}
