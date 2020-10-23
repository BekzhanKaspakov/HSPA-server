package com.bekzhankaspakov.myfirstapp;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PropertyController {

    private final PropertyRepository repository;

    PropertyController(PropertyRepository repository) {
        this.repository = repository;
    }

    // Aggregate root

    @GetMapping("/properties")
    List<Property> all() {
        return repository.findAll();
    }

    @PostMapping("/property")
    Property newProperty(@RequestBody Property newProperty) {
        return repository.save(newProperty);
    }

    @GetMapping("/properties/{id}")
    Property one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new PropertyNotFoundException(id));
    }

    @DeleteMapping("/properties/{id}")
    void deleteProperty(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
