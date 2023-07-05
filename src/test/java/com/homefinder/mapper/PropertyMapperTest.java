package com.homefinder.mapper;

import com.homefinder.domain.Property;
import com.homefinder.domain.PropertyType;
import com.homefinder.entity.PropertyEntity;
import org.junit.jupiter.api.Test;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class PropertyMapperTest {

    private PropertyMapper mapper = new PropertyMapper();

    @Test
    void returnNullWhenPropertyEntityIsNull() {
        // arrange
        PropertyEntity entity = null;

        // act
        Property property = mapper.transformPropertyEntityToProperty(entity);

        // assert
        assertNull(property);
    }

    @Test
    void returnValidPropertyWhenEntityIsValid() {
        // arrange
        Integer expectedId = 1;
        String expectedTitle = "title";
        String expectedDesc = "desc";
        String expectedType = PropertyType.HOUSE.getName();
        Date expectedSql = new Date(System.currentTimeMillis());
        boolean expectedAvailable = false;

        PropertyEntity entity = new PropertyEntity();
        entity.setId(expectedId);
        entity.setTitle(expectedTitle);
        entity.setDescription(expectedDesc);
        entity.setPropertyTypeType(PropertyType.HOUSE);
        entity.setAvailable(expectedAvailable);
        entity.setDateCreated(expectedSql);

        // action
        Property result = mapper.transformPropertyEntityToProperty(entity);

        // assert
        assertEquals(expectedId, result.getId());
        assertEquals(expectedTitle, result.getTitle());
        assertEquals(expectedDesc, result.getDescription());
        assertEquals(expectedType, result.getPropertyType());
        assertEquals(expectedSql, result.getDateCreated());
        assertEquals(expectedAvailable, result.isAvailable());
    }
}