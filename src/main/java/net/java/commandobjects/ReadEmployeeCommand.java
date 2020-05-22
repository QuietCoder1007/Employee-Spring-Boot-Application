package net.java.commandobjects;

import net.java.model.Employee;

public class ReadEmployeeCommand implements CommandBase {

	Employee employee;

	public ReadEmployeeCommand(Employee employee) {
		this.employee = employee;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		employee.read();
	}

}
