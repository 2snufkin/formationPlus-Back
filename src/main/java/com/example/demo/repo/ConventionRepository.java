package com.example.demo.repo;

import com.example.demo.entity.Convention;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConventionRepository extends JpaRepository<Convention, Integer> {

}
