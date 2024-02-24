package com.ecommerce.shopping.models;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.shopping.models.data.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findByUsername(String username);    
}
