package DemoCRUD.DemoCrudOperation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import DemoCRUD.DemoCrudOperation.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}