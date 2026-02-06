package com.research.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.research.school.model.School;

@Repository
public interface SchoolRepository extends JpaRepository<School,Integer> {
}