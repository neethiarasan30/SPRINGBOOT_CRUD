package DemoCRUD.DemoCrudOperation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import DemoCRUD.DemoCrudOperation.Entity.Employee;
import DemoCRUD.DemoCrudOperation.Service.EmployeeService;

@Controller
@RequestMapping("/api")
public class EmployeeController {
		
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
	@ResponseBody
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		Employee savedEmployee = employeeService.saveEmployee(employee);
		
		return savedEmployee;
	}
	
	
	
	
	@GetMapping("/getById")
	@ResponseBody
	public Employee getById(@PathVariable("id") int id)
	{
		Employee employee = employeeService.getById(id);
		
		return employee;
	}
	
	
	
	
	
	@GetMapping("/getAllEmployee")
	@ResponseBody
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
	
	
	
	
	
	@PutMapping("/updateEmployee/{id}")
	@ResponseBody
	public Employee update(@RequestBody Employee employee,@PathVariable("id") int id)
	{
		return employeeService.updateEmployee(employee, id);
	}

	
	
	
	
	@DeleteMapping("deleteEmployee/{id}")
	@ResponseBody
	public String DeleteEmployee(@PathVariable("id") int id)
	{
		return employeeService.DeleteEmployee(id);
	}

}
