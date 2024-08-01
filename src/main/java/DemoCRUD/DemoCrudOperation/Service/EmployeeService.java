package DemoCRUD.DemoCrudOperation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoCRUD.DemoCrudOperation.Entity.Employee;
import DemoCRUD.DemoCrudOperation.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee) {
		
		Employee savedEmployee = employeeRepository.save(employee);
		
		return savedEmployee;
	}
	
	
	
	
	public Employee getById(int id)
	{
		Employee employee = employeeRepository.findById(id).get();
		
		return employee;
	}
	
	
	public List<Employee> getAllEmployee()
	{
		List<Employee> allEmployee = employeeRepository.findAll();
		return allEmployee;
		
	}
	
	
	
	public Employee updateEmployee(Employee employee, int id)
	{
		Employee SavedEmployee = employeeRepository.findById(id).get();

				 SavedEmployee.setName(employee.getName());
				 SavedEmployee.setLocation(employee.getLocation());
				 SavedEmployee.setEmpId(employee.getEmpId());

				 
			return employeeRepository.save(SavedEmployee);
		
	}
	
	
	
	public String DeleteEmployee(int id)
	{
		Employee SavedEmployee = employeeRepository.findById(id).get();
		 
		employeeRepository.delete(SavedEmployee);
		
		return "deleted successfully";
	}
}
