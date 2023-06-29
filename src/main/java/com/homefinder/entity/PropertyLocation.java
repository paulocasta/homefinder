package com.homefinder.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Entity
@Table(name = "property_location")
public class PropertyLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @MapsId
    private PropertyEntity propertyEntity;
    @Column(name = "street", length = 50, nullable = false)
    private String street;
    @Column(name = "neighborhood", length = 50, nullable = false)
    private String neighborhood;
    @Column(name = "city", length = 50)
    private String city;
    @Column(name = "province", length = 50)
    private String province;
    @Column(name = "date_created", nullable = false)
    private Date dateCreated;
}
