package com.example.demo.dao;

import com.example.demo.model.Hierarchy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HierarchyRepository extends JpaRepository<Hierarchy, Long> {
}
