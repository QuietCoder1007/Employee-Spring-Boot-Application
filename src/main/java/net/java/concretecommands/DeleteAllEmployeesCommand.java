/**
 * 
 */
package net.java.concretecommands;

import org.springframework.beans.factory.annotation.Autowired;

import net.java.commandinterface.CommandBase;
import net.java.repository.UserRepository;

public class DeleteAllEmployeesCommand implements CommandBase {

	private UserRepository userRepository;

	@Autowired
	public DeleteAllEmployeesCommand(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		userRepository.deleteAll();
	}

}
