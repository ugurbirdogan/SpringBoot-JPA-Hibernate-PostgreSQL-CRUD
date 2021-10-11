package com.example.demo.dao;

import com.example.demo.model.Hierarchy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HierarchyRepository extends JpaRepository<Hierarchy, Long> {
}
