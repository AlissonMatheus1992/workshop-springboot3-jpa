package com.alissonsilvadev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alissonsilvadev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}