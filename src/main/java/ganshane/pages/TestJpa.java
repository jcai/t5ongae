package ganshane.pages;

import ganshane.entities.Employee;
import ganshane.services.entity.EntityService;

import org.apache.tapestry5.annotations.BeginRender;
import org.apache.tapestry5.ioc.annotations.Inject;

public class TestJpa {
	
	private Employee employee;
	
	@Inject
	private EntityService entityService;


	@BeginRender
	public void saveEmployee(){
		Employee employee = new Employee();
		employee.setFirstName("firstName");
		entityService.persist(employee);
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
