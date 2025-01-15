package com.enviro.assessment.grad001.LehlohonoloMolapo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // Marks this class as a service, making it eligible for component scanning
public class WasteCategoryService {

    @Autowired // Automatically injects the repository instance
    private WasteCategoryRepository repository;

    // Method to create a new waste category
    public WasteCategory createCategory(WasteCategory category) {
        // Saves the category to the repository and returns the saved category
        return repository.save(category);
    }

    // Method to retrieve all waste categories
    public List<WasteCategory> getAllCategories() {
        // Fetches all categories from the repository and returns them
        return repository.findAll();
    }

    // Method to update an existing waste category by its ID
    public WasteCategory updateCategory(Long id, WasteCategory category) {
        // Finds the existing category by its ID
        return repository.findById(id)
                .map(existing -> {
                    // Updates the name and description of the existing category
                    existing.setName(category.getName());
                    existing.setDescription(category.getDescription());
                    // Saves and returns the updated category
                    return repository.save(existing);
                })
                // If the category doesn't exist, throws an exception
                .orElseThrow(() -> new RuntimeException("Category not found"));
    }

    // Method to delete a waste category by its ID
    public void deleteCategory(Long id) {
        // Deletes the category by its ID from the repository
        repository.deleteById(id);
    }
}
