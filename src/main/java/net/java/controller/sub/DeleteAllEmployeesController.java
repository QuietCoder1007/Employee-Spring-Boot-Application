package net.java.controller.sub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.java.commandinterface.CommandBase;
import net.java.concretecommands.DeleteAllEmployeesCommand;
import net.java.repository.UserRepository;

@RestController
@RequestMapping(path = "/employees")
public class DeleteAllEmployeesController {

	@Autowired
	private UserRepository userRepository;
	CommandBase deleteAllEmployees;

	// delete all employees
	@DeleteMapping(path = "/delete")
	public @ResponseBody String deleteAllEmployees() {
		DeleteAllEmployeesCommand deleteAllEmployees = new DeleteAllEmployeesCommand(userRepository);

		onButtonPressed(deleteAllEmployees);

		return "Database deleted";
	}

	public void onButtonPressed(CommandBase myCommand) {
		this.deleteAllEmployees = myCommand;
		this.deleteAllEmployees.execute();
	}
}
