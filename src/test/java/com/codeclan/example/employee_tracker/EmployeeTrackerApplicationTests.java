package com.codeclan.example.employee_tracker;

import models.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import repositeries.EmployeeRepository;

@SpringBootTest
class EmployeeTrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee() {
		Employee testEmployee = new Employee("test", 30, "123456A", "test@test.com");
		employeeRepository.save(testEmployee);
	}
}
