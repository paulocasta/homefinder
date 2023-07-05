package com.homefinder.mapper;

import com.homefinder.domain.Property;
import com.homefinder.domain.PropertyType;
import com.homefinder.entity.PropertyEntity;

import java.sql.Date;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class PropertyMapper {

    public PropertyMapper() {}

    public Property transformPropertyEntityToProperty(PropertyEntity entity) {
        if (entity == null) {
            return null;
        }
        return Property.builder().id(entity.getId())
                .description(entity.getDescription())
                .title(entity.getTitle())
                .propertyType(entity.getPropertyTypeType().getName())
                .dateCreated(entity.getDateCreated())
                .build();
    }

    public List<Property> transformPropertyEntityToProperty(List<PropertyEntity> entities) {
        if (entities == null) {
            return Collections.emptyList();
        }
        return entities.stream().map(this::transformPropertyEntityToProperty).collect(Collectors.toList());
    }

    public PropertyEntity transformPropertyToPropertyEntity(Property property) {
        if (property == null) {
            return null;
        }
        PropertyEntity entity = new PropertyEntity();
        entity.setTitle(property.getTitle());
        entity.setDescription(property.getDescription());
        entity.setPropertyTypeType(PropertyType.valueOf(property.getPropertyType()));
        entity.setDateCreated(new Date(System.currentTimeMillis()));
        entity.setAvailable(true);
        return entity;
    }
}
