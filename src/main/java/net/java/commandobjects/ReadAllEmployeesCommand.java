package net.java.commandobjects;

import net.java.model.Employee;

public class ReadAllEmployeesCommand implements CommandBase {

	Employee employee;

	public ReadAllEmployeesCommand(Employee employee) {
		this.employee = employee;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		employee.readAll();
	}

}
