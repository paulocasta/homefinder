package com.homefinder.entity;

import com.homefinder.domain.PropertyType;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "property")
public class PropertyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "title", length = 100, nullable = false)
    private String title;
    @Column(name = "description", columnDefinition = "TEXT", nullable = false)
    private String description;
    @Column(name = "property_type", length = 25, nullable = false)
    @Enumerated(EnumType.STRING)
    private PropertyType propertyTypeType;
    @Column(name = "is_available")
    private boolean isAvailable;
    @Column(name = "date_created", nullable = false)
    private Date dateCreated;
}
