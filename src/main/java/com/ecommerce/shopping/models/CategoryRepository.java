package com.ecommerce.shopping.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.shopping.models.data.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Category findByName(String name);
    List<Category> findAllByOrderBySortingAsc();
	Category findBySlug(String slug);
}
