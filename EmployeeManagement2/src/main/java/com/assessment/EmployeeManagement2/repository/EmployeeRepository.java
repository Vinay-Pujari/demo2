package com.assessment.EmployeeManagement2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment.EmployeeManagement2.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	List<Employee> findByOrderBySalaryDesc();

}
