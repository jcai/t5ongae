package ganshane.pages;

import ganshane.entities.Employee;
import ganshane.services.EMF;

import javax.persistence.EntityManager;

import org.apache.tapestry5.annotations.BeginRender;

public class TestJpa {
	
	private Employee employee;


	@BeginRender
	public void saveEmployee(){
		Employee employee = new Employee();
		employee.setFirstName("firstName");
		 EntityManager em = EMF.get().createEntityManager();  
		         try {  
		             em.persist(employee);  
		         } finally {  
		             em.close();  
		         }  

		
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
