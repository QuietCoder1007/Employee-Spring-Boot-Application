package net.java.concretecommands;

import org.springframework.beans.factory.annotation.Autowired;

import net.java.commandinterface.CommandBase;
import net.java.repository.UserRepository;

public class DeleteEmployeeByIdCommand implements CommandBase {

	private UserRepository userRepository;
	private Long userId;

	@Autowired
	public DeleteEmployeeByIdCommand(UserRepository userRepository, Long userId) {
		this.userRepository = userRepository;
		this.userId = userId;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);
	}

}
