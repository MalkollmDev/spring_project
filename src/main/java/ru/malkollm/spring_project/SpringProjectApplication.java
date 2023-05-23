package ru.malkollm.spring_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.malkollm.spring_project.entity.Employee;
import ru.malkollm.spring_project.repository.EmployeeRepository;

@SpringBootApplication
public class SpringProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = Employee.builder()
				.firstName("Иван")
				.lastName("Иванов")
				.email("asd@dw.ru")
				.build();

		Employee employee2 = Employee.builder()
				.firstName("Петр")
				.lastName("Петров")
				.email("asd22@dw.ru")
				.build();

		Employee employee3 = Employee.builder()
				.firstName("Максим")
				.lastName("Копотилов")
				.email("asdqwe@dwqq.ru")
				.build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}
}
