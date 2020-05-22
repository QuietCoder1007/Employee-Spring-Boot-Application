package net.java.commandobjects;

import net.java.model.Employee;

public class DeleteEmployeeCommand implements CommandBase {

	Employee employee;

	public DeleteEmployeeCommand(Employee employee) {
		this.employee = employee;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		employee.delete();
	}

}
