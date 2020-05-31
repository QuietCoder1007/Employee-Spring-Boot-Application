package net.java.concretecommands;

import org.springframework.beans.factory.annotation.Autowired;

import net.java.commandinterface.CommandBase;
import net.java.repository.UserRepository;

public class GetEmployeeByIdCommand implements CommandBase {

	private UserRepository userRepository;
	private long userId;

	@Autowired
	public GetEmployeeByIdCommand(UserRepository userRepository, long userId) {
		this.userRepository = userRepository;
		this.userId = userId;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		userRepository.findById(userId);
	}

}
