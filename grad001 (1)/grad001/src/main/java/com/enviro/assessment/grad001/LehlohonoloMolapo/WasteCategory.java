// WasteCategory Model
package com.enviro.assessment.grad001.LehlohonoloMolapo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity // Marks this class as a JPA entity, meaning it will be mapped to a database table
public class WasteCategory {

    @Id // Marks this field as the primary key for the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatically generates the ID with an auto-increment strategy
    private Long id;

    @NotBlank(message = "Name is mandatory") // Ensures that the name field is not blank when the entity is saved
    private String name;

    @NotBlank(message = "Description is mandatory") // Ensures that the description field is not blank when the entity is saved
    private String description;

    // Getters and Setters for the fields

    // Gets the ID of the category
    public Long getId() {
        return id;
    }

    // Sets the ID of the category
    public void setId(Long id) {
        this.id = id;
    }

    // Gets the name of the category
    public String getName() {
        return name;
    }

    // Sets the name of the category
    public void setName(String name) {
        this.name = name;
    }

    // Gets the description of the category
    public String getDescription() {
        return description;
    }

    // Sets the description of the category
    public void setDescription(String description) {
        this.description = description;
    }
}
