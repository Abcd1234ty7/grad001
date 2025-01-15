package com.enviro.assessment.grad001.LehlohonoloMolapo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController // Marks this class as a REST controller, making it a Spring MVC controller for handling HTTP requests
@RequestMapping("/api/categories") // Defines the base URL for all requests in this controller
public class WasteCategoryController {

    @Autowired // Automatically injects the WasteCategoryService instance
    private WasteCategoryService service;

    // Handles POST requests to create a new waste category
    @PostMapping
    public ResponseEntity<WasteCategory> createCategory(@Valid @RequestBody WasteCategory category) {
        // Validates the category and creates it using the service, then returns the created category with HTTP status 201 (Created)
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createCategory(category));
    }

    // Handles GET requests to fetch all waste categories
    @GetMapping
    public List<WasteCategory> getAllCategories() {
        // Retrieves all categories from the service and returns them
        return service.getAllCategories();
    }

    // Handles PUT requests to update an existing waste category
    @PutMapping("/{id}")
    public WasteCategory updateCategory(@PathVariable Long id, @Valid @RequestBody WasteCategory category) {
        // Validates the category and updates it by its ID using the service, then returns the updated category
        return service.updateCategory(id, category);
    }

    // Handles DELETE requests to delete a waste category by its ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        // Deletes the category by its ID using the service and returns an HTTP 204 (No Content) response
        service.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }
}
