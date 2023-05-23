package ru.malkollm.spring_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.malkollm.spring_project.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
