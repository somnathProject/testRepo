package com.ayantsoft.crud1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayantsoft.crud1.pojo.*;
public interface EmployeeRepository extends JpaRepository<Emp, Integer>{

}
