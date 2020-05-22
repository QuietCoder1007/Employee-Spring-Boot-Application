package net.java.commandobjects;

import net.java.model.Employee;
import net.java.repository.EmployeeRepository;

public class CreateEmployeeCommand implements CommandBase {

	Employee employee;
	EmployeeRepository employeeRepository;

	public CreateEmployeeCommand(long id, String firstName, String lastName, int birthYear, String emailId,
			long phoneNumber, long socialSecurity, long accountNumber, EmployeeRepository employeeRepository) {
		this.employee.setId(id);
		this.employee.setFirstName(firstName);
		this.employee.setLastName(lastName);
		this.employee.setBirthYear(birthYear);
		this.employee.setEmailId(emailId);
		this.employee.setPhoneNumber(phoneNumber);
		this.employee.setId(socialSecurity);
		this.employee.setId(accountNumber);
		this.employeeRepository = employeeRepository;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		try {
			if (employeeRepository.existsById(employee.getId())) {
				throw new Exception("Employee already exists! Did you want to update the employee's info?");
			}
			employeeRepository.save(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
