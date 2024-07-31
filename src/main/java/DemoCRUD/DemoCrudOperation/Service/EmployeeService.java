package DemoCRUD.DemoCrudOperation.Service;

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
}
