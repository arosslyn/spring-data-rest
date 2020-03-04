package com.springboot.jpadatarest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jpadatarest.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
