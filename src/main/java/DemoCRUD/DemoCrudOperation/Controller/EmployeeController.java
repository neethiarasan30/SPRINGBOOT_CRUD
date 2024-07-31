package DemoCRUD.DemoCrudOperation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import DemoCRUD.DemoCrudOperation.Entity.Employee;
import DemoCRUD.DemoCrudOperation.Service.EmployeeService;

@Controller
public class EmployeeController {
		
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/saveEmployee", method=RequestMethod.POST)
	@ResponseBody
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		Employee savedEmployee = employeeService.saveEmployee(employee);
		
		return savedEmployee;
	}
	
	
	
	
	@RequestMapping(value = "/getById/{id}")
	@ResponseBody
	public Employee getById(@PathVariable("id") int id)
	{
		Employee employee = employeeService.getById(id);
		
		return employee;
	}
}
