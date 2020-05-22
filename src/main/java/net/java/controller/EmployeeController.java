package net.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.java.exceptions.ResourceNotFoundException;
import net.java.model.Employee;
import net.java.repository.EmployeeRepository;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@RequestMapping(value = "/employees", method = RequestMethod.POST)
	// create employee
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	// Read all employees api
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	// get employee by ID
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getEmployeeId(@PathVariable(name = "id") long employeeId)
			throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
		return ResponseEntity.ok().body(employee);
	}

	@RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE)
	// update employee
	public ResponseEntity<Employee> updateEmployee(@PathVariable(name = "id") long employeeId,
			@RequestBody Employee employeeDetails) throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmailId(employeeDetails.getEmailId());
		employee.setBirthYear(employeeDetails.getBirthYear());

		employeeRepository.save(employee);

		return ResponseEntity.ok().body(employee);
	}

	// delete employee by ID
	@RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Employee> deleteEmployee(@PathVariable(name = "id") long employeeId)
			throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

		employeeRepository.deleteById(employeeId);

		return ResponseEntity.ok().body(employee);
	}

	// delete employee by ID
	@RequestMapping(value = "/employees", method = RequestMethod.DELETE)
	public ResponseEntity<Employee> deleteAllEmployees() {
		try {
			if (employeeRepository.count() <= 0) {
				throw new NullPointerException();
			}
			employeeRepository.deleteAll();
		} catch (NullPointerException e) {
			System.out.println("Database is already empty!");
		}
		return ResponseEntity.ok().build();
	}

}
