package net.java.concretecommands;

import org.springframework.beans.factory.annotation.Autowired;

import net.java.commandinterface.CommandBase;
import net.java.entity.Employee;
import net.java.repository.UserRepository;

public class CreateEmployeeCommand implements CommandBase {

	private UserRepository userRepository;
	private Employee employee;

	@Autowired
	public CreateEmployeeCommand(UserRepository userRepository, Employee employee) {
		this.userRepository = userRepository;
		this.employee = employee;
	}

	@Override
	public void execute() {
		userRepository.save(employee);
	}

}
