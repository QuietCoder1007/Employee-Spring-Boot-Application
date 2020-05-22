package net.java.commandobjects;

import net.java.model.Employee;

public class UpdateEmployeeCommand implements CommandBase {

	Employee employee;

	public UpdateEmployeeCommand(Employee employee) {
		this.employee = employee;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		employee.update();
	}

}
