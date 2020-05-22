package net.java.commandobjects;

import net.java.repository.EmployeeRepository;

public class ReadAllEmployeesCommand implements CommandBase {

	EmployeeRepository employeeRepository;

	public ReadAllEmployeesCommand(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		try {
			if (employeeRepository.count() <= 0) {
				throw new Exception("The database has 0 items!");
			}
			employeeRepository.findAll();
		} catch (Exception e) {

		}
	}

}
