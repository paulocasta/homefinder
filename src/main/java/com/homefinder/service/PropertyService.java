package com.homefinder.service;

import com.homefinder.domain.Property;
import com.homefinder.entity.PropertyEntity;
import com.homefinder.mapper.PropertyMapper;
import com.homefinder.repository.PropertyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PropertyService {

    private final PropertyRepository propertyRepository;
    private static final PropertyMapper PROPERTY_MAPPER = new PropertyMapper();

    public PropertyService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    public List<Property> getAllAvailableProperties() {
        List<PropertyEntity> entities = propertyRepository.getAllByAvailable(true);
        return PROPERTY_MAPPER.transformPropertyEntityToProperty(entities);
    }

    public Property getPropertyById(Integer id) {
        PropertyEntity entity = propertyRepository.getReferenceById(id);
        return PROPERTY_MAPPER.transformPropertyEntityToProperty(entity);
    }

    public Property saveProperty(Property property) {
        PropertyEntity entity = propertyRepository.save(PROPERTY_MAPPER.transformPropertyToPropertyEntity(property));
        return PROPERTY_MAPPER.transformPropertyEntityToProperty(entity);
    }
}
