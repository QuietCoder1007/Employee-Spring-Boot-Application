package net.java.controller.sub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.java.commandinterface.CommandBase;
import net.java.concretecommands.UpdateEmployeeByIdCommand;
import net.java.entity.Employee;
import net.java.exceptions.ResourceNotFoundException;
import net.java.repository.UserRepository;

@RestController
@RequestMapping(path = "/employees")
public class UpdateEmployeeByIdController {

	@Autowired
	private UserRepository userRepository;
	CommandBase updateEmployee;

	@PutMapping(path = "/{id}")
	// update employee
	public @ResponseBody String updateEmployee(@PathVariable(name = "id") Long employeeId,
			@RequestParam String username, @RequestParam String password, @RequestParam Integer birthYear)
			throws ResourceNotFoundException {

		Employee employee = new Employee();

		employee.setId(employeeId);
		employee.setUsername(username);
		employee.setPassword(password);
		employee.setBirthYear(birthYear);

		UpdateEmployeeByIdCommand updateEmployee = new UpdateEmployeeByIdCommand(userRepository, employee);

		onButtonPressed(updateEmployee);

		return "Employee " + employeeId + " updated: " + userRepository.findById(employeeId);
	}

	public void onButtonPressed(CommandBase myCommand) {
		this.updateEmployee = myCommand;
		this.updateEmployee.execute();
	}
}
