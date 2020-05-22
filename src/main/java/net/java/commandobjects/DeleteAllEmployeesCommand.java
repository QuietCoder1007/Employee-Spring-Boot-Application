package net.java.commandobjects;

import net.java.model.Employee;

public class DeleteAllEmployeesCommand implements CommandBase {

	Employee employee;

	public DeleteAllEmployeesCommand(Employee employee) {
		this.employee = employee;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		employee.deleteAll();
	}

}
