package com.homefinder.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Entity
@Table(name = "property_amenities")
public class PropertyAmenities {

    @Id
    @GeneratedValue
    private Integer id;
    @OneToOne
    private PropertyEntity propertyEntity;
    @Column(name = "garden")
    private boolean garden;
    @Column(name = "swimming_poll")
    private boolean swimmingPoll;
    @Column(name = "grill")
    private boolean grill;
    @Column(name = "gym")
    private boolean gym;
    @Column(name = "garage")
    private boolean garage;
    @Column(name = "laundry")
    private boolean laundry;
    @Column(name = "date_created", nullable = false)
    private Date dateCreated;
}
