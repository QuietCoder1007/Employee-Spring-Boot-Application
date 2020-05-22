package net.java.commandobjects;

import net.java.model.Employee;
import net.java.repository.EmployeeRepository;

public class UpdateEmployeeCommand implements CommandBase {

	Employee employee;
	EmployeeRepository employeeRepository;

	public UpdateEmployeeCommand(EmployeeRepository employeeRepository, long employeeId, Employee employeeDetails) {
		this.employeeRepository = employeeRepository;
		this.employee.setFirstName(employeeDetails.getFirstName());
		this.employee.setLastName(employeeDetails.getLastName());
		this.employee.setAccountNumber(employeeDetails.getAccountNumber());
		this.employee.setSocialSecurity(employeeDetails.getSocialSecurity());
		this.employee.setBirthYear(employeeDetails.getBirthYear());
		this.employee.setPhoneNumber(employeeDetails.getPhoneNumber());
		this.employee.setEmailId(employeeDetails.getEmailId());
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}

}
