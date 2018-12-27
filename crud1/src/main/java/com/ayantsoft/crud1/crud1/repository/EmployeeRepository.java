package com.ayantsoft.crud1.crud1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayantsoft.crud1.crud1.pojo.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Emp, Integer>{

}
