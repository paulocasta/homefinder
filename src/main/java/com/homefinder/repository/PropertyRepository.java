package com.homefinder.repository;

import com.homefinder.entity.PropertyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropertyRepository extends JpaRepository<PropertyEntity, Integer> {

    List<PropertyEntity> getAllByAvailable(boolean available);

    PropertyEntity getReferenceById(Integer id);
}
