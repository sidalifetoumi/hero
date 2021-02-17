package com.example.demo.repository;

import com.example.demo.entity.CourEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourRepository extends JpaRepository<CourEntity,Long> {
}
