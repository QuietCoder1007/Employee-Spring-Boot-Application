package net.java.controller.sub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.java.commandinterface.CommandBase;
import net.java.concretecommands.GetAllEmployeesCommand;
import net.java.entity.Employee;
import net.java.exceptions.ResourceNotFoundException;
import net.java.repository.UserRepository;

@RestController
@RequestMapping(path = "/employees")
public class GetAllEmployeesController {

	@Autowired
	private UserRepository userRepository;
	CommandBase getAllEmployees;

	// Get all employees
	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Employee> GetAllEmployees() throws ResourceNotFoundException {
		GetAllEmployeesCommand getAllEmployees = new GetAllEmployeesCommand(userRepository);

		onButtonPressed(getAllEmployees);

		return userRepository.findAll();
	}

	public void onButtonPressed(CommandBase myCommand) {
		this.getAllEmployees = myCommand;
		this.getAllEmployees.execute();
	}
}
