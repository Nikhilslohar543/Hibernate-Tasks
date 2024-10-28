package Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long dept_id;
	private String name;
	private String location;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<Employee> employees = new HashSet<>();

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Long dept_id, String name, String location, Set<Employee> employees) {
		super();
		this.dept_id = dept_id;
		this.name = name;
		this.location = location;
		this.employees = employees;
	}

	public Department(String name, String location, Set<Employee> employees) {
		super();
		this.name = name;
		this.location = location;
		this.employees = employees;
	}

	public Long getDept_id() {
		return dept_id;
	}

	public void setDept_id(Long dept_id) {
		this.dept_id = dept_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", name=" + name + ", location=" + location + ", employees="
				+ employees + "]";
	}	
	
}
