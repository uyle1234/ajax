package com.example.demo.repository;

import com.example.demo.model.Clazz;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<Clazz, Long> {
}
