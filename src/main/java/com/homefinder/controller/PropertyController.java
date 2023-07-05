package com.homefinder.controller;

import com.homefinder.domain.Property;
import com.homefinder.service.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/property")
@RequiredArgsConstructor
public class PropertyController {

    private final PropertyService propertyService;

    @GetMapping("/all")
    @ResponseBody
    public ResponseEntity<List<Property>> getAllProperties()  {
        return ResponseEntity.ok().body(propertyService.getAllAvailableProperties());
    }

    @GetMapping("/id/{id}")
    @ResponseBody
    public ResponseEntity<Property> getById(@PathVariable Integer id)  {
        return ResponseEntity.ok().body(propertyService.getPropertyById(id));
    }

    @PostMapping("/addProperty")
    @ResponseBody
    public ResponseEntity<Property> saveProperty(@RequestBody Property property) {
        if (property == null) {
            throw new IllegalArgumentException("No body request found");
        }
        return ResponseEntity.ok().body(propertyService.saveProperty(property));
    }
}
