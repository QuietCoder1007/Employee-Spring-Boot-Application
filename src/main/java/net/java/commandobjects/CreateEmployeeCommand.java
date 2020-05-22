package net.java.commandobjects;

import net.java.model.Employee;

public class CreateEmployeeCommand implements CommandBase {

	Employee employee;

	public CreateEmployeeCommand(Employee employee) {
		this.employee = employee;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		employee.create();
	}

}
