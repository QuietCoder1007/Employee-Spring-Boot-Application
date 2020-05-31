package net.java.concretecommands;

import org.springframework.beans.factory.annotation.Autowired;

import net.java.commandinterface.CommandBase;
import net.java.repository.UserRepository;

public class GetAllEmployeesCommand implements CommandBase {
	private UserRepository userRepository;

	@Autowired
	public GetAllEmployeesCommand(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void execute() {
		System.out.println("Getting all users...");
		userRepository.findAll();
	}
}
