package net.java.controller.sub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.java.commandinterface.CommandBase;
import net.java.concretecommands.DeleteEmployeeByIdCommand;
import net.java.exceptions.ResourceNotFoundException;
import net.java.repository.UserRepository;

@RestController
@RequestMapping(path = "/employees")
public class DeleteEmployeeByIdController {

	@Autowired
	private UserRepository userRepository;
	CommandBase deleteEmployee;

	// delete user by ID
	@DeleteMapping(path = "/{id}")
	public @ResponseBody String deleteEmployee(@PathVariable(name = "id") long userId)
			throws ResourceNotFoundException {
		DeleteEmployeeByIdCommand deleteEmployee = new DeleteEmployeeByIdCommand(userRepository, userId);

		onButtonPressed(deleteEmployee);

		return "Employee " + userId + " deleted";
	}

	public void onButtonPressed(CommandBase myCommand) {
		this.deleteEmployee = myCommand;
		this.deleteEmployee.execute();
	}

}
