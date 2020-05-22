package net.java.commandobjects;

import net.java.repository.EmployeeRepository;

public class DeleteAllEmployeesCommand implements CommandBase {

	EmployeeRepository employeeRepository;

	public DeleteAllEmployeesCommand(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		try {
			if (employeeRepository.count() <= 0) {
				throw new Exception("The database has 0 employees");
			}
			employeeRepository.deleteAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
