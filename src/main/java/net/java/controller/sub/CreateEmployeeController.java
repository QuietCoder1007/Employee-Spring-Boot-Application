package net.java.controller.sub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.java.commandinterface.CommandBase;
import net.java.concretecommands.CreateEmployeeCommand;
import net.java.entity.Employee;
import net.java.repository.UserRepository;

@RestController
@RequestMapping(path = "/employees")
public class CreateEmployeeController {

	@Autowired
	private UserRepository userRepository;
	CommandBase createEmployee;

	// create user
	@PostMapping(path = "/add")
	public String createUser(@RequestParam String username, @RequestParam String password,
			@RequestParam int birthYear) {
		Employee employee = new Employee();

		employee.setUsername(username);
		employee.setPassword(password);
		employee.setBirthYear(birthYear);

		CreateEmployeeCommand createUser = new CreateEmployeeCommand(userRepository, employee);
		onButtonPressed(createUser);

		return "Saved: " + employee.toString();
	}

	public void onButtonPressed(CommandBase myCommand) {
		this.createEmployee = myCommand;
		this.createEmployee.execute();
	}
}
