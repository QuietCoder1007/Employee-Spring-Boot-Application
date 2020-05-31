package net.java.concretecommands;

import org.springframework.beans.factory.annotation.Autowired;

import net.java.commandinterface.CommandBase;
import net.java.entity.Employee;
import net.java.repository.UserRepository;

public class UpdateEmployeeByIdCommand implements CommandBase {

	private UserRepository userRepository;
	private Employee employee;

	@Autowired
	public UpdateEmployeeByIdCommand(UserRepository userRepository, Employee employee) {
		this.userRepository = userRepository;
		this.employee = employee;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		userRepository.save(employee);
	}
}
