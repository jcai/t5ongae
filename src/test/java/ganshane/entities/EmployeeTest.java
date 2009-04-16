package ganshane.entities;

import ganshane.services.entity.EntityService;
import ganshane.services.entity.impl.EntityManagerFactoryImpl;
import ganshane.services.entity.impl.EntityServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Query;

public class EmployeeTest extends LocalDatastoreTestCase {
	public void testSaveEmployee(){
		EntityManagerFactory factory = new EntityManagerFactoryImpl();
		EntityManager entityManager = factory.createEntityManager();
        
        entityManager.getTransaction().begin();
		EntityService entityService = new EntityServiceImpl(entityManager);
		Employee employee = new Employee();
		entityService.persist(employee);
        entityManager.getTransaction().commit();
        
		Query query = new Query(Employee.class.getSimpleName());
        assertEquals(1, DatastoreServiceFactory.getDatastoreService().prepare(query).countEntities());
	}

}
