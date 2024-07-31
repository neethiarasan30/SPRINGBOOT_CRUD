package DemoCRUD.DemoCrudOperation.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="fullname", length=155)
	private String name;
	private int EmpId;
	private  String location;
	
	
	
	public Employee() {
		
	}
	
	
	
	public Employee(int id, String name, int empId, String location) {
		super();
		this.id = id;
		this.name = name;
		EmpId = empId;
		this.location = location;
	}



	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getEmpId() {
		return EmpId;
	}
	
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
