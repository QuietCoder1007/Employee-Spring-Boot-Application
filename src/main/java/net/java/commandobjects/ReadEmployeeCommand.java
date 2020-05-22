package net.java.commandobjects;

import net.java.exceptions.ResourceNotFoundException;
import net.java.repository.EmployeeRepository;

public class ReadEmployeeCommand implements CommandBase {

	Long employeeId;
	EmployeeRepository employeeRepository;

	public ReadEmployeeCommand(EmployeeRepository employeeRepository, Long employeeId) {
		this.employeeRepository = employeeRepository;
		this.employeeId = employeeId;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		try {
			employeeRepository.findById(employeeId).orElseThrow(
					() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
		} catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
