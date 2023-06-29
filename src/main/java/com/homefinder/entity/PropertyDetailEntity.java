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
import java.math.BigDecimal;
import java.sql.Date;

@Data
@Entity
@Table(name = "property_detail")
public class PropertyDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @MapsId
    private PropertyEntity propertyEntity;
    @Column(name = "bathroom", nullable = false)
    private Integer bathroom;
    @Column(name = "total_room", nullable = false)
    private Integer totalRoom;
    @Column(name = "total_sqrt_feet", nullable = false)
    private Integer totalSqrtFeet;
    @Column(name = "house_sqrt_feet", nullable = false)
    private Integer houseSqrtFeet;
    @Column(name = "price", nullable = false, columnDefinition = "money")
    private BigDecimal price;
    @Column(name = "date_created", nullable = false)
    private Date dateCreated;
}
