package com.enviro.assessment.grad001.LehlohonoloMolapo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Marks this interface as a repository for Spring Data JPA to manage the data layer
public interface WasteCategoryRepository extends JpaRepository<WasteCategory, Long> {
    // JpaRepository provides methods for CRUD operations on the WasteCategory entity
    // The WasteCategory entity is mapped to the database, and the ID type is Long
}
