package redoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import redoc.entity.Employee;
import redoc.service.EmployeeService;

@Controller
public class AppController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/addEmployee")
	@ResponseBody
	public String addStudent(@RequestBody Employee employee) {
		employeeService.save(employee);
		return "details saved succesfully";

	}

	
	
//	1st api ===>localhost:9000/login
	@GetMapping("/login")
	public String getForm() {
		return "employeeRegistrationForm";
	}

	@PostMapping("/register")
	// @ResponseBody
	public String register(Employee employee) {
		employeeService.save(employee);

		return "redirect:/employeeDetails";

	}

	@GetMapping("/employeeDetails")
	public String getEmployeeDetails(Model model) {
		model.addAttribute("EMPLOYEEDETAILS", employeeService.findAll());
		return "employeeDetailsDisplayForm";
	}

}
