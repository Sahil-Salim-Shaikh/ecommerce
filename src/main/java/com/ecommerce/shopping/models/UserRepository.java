package com.ecommerce.shopping.models;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.shopping.models.data.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
