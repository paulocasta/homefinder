package com.homefinder.entity;

import com.homefinder.domain.PropertyType;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Entity(name = "property_id")
@Table(name = "property")
public class PropertyEntity {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "title", length = 100, nullable = false)
    private String title;
    @Column(name = "description", columnDefinition = "TEXT", nullable = false)
    private String description;
    @Column(name = "property_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private PropertyType propertyTypeType;
    @Column(name = "is_available")
    private boolean isAvailable;
    @Column(name = "date_created", nullable = false)
    private Date dateCreated;
}
