package net.java.controller.sub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.java.commandinterface.CommandBase;
import net.java.concretecommands.GetEmployeeByIdCommand;
import net.java.exceptions.ResourceNotFoundException;
import net.java.repository.UserRepository;

@RestController
@RequestMapping(path = "/employees")
public class GetEmployeeByIdController {

	@Autowired
	private UserRepository userRepository;
	CommandBase getEmployee;

	// get employee by ID
	@GetMapping(path = "/{id}")
	public @ResponseBody String getEmployeeId(@PathVariable(name = "id") long employeeId)
			throws ResourceNotFoundException {
		GetEmployeeByIdCommand getEmployee = new GetEmployeeByIdCommand(userRepository, employeeId);

		onButtonPressed(getEmployee);

		return employeeId + " retrieved: " + userRepository.findById(employeeId);
	}

	public void onButtonPressed(CommandBase myCommand) {
		this.getEmployee = myCommand;
		this.getEmployee.execute();
	}
}
