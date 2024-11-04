package com.alissonsilvadev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alissonsilvadev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}