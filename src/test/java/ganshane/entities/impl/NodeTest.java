/*		
 * Copyright 2008 The Fepss Pty Ltd. 
 * site: http://www.fepss.com
 * file: $Id$
 * created at:2009-4-16
 */
package ganshane.entities.impl;

import ganshane.entities.LocalDatastoreTestCase;
import ganshane.entities.Employee;
import ganshane.services.entity.impl.EntityManagerFactoryImpl;
import ganshane.services.entity.impl.EntityServiceImpl;
import ganshane.services.entity.EntityService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Query;

/**
 * 针对节点的测试
 * @author <a href="jun.tsai@fepss.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.0.1
 */
public class NodeTest extends LocalDatastoreTestCase {

    public void testSaveNode(){
		EntityManagerFactory factory = new EntityManagerFactoryImpl();
		EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
		EntityService entityService = new EntityServiceImpl(entityManager);
		Node node= new Node();
		entityService.persist(node);
        entityManager.getTransaction().commit();

		Query query = new Query(Node.class.getSimpleName());
        assertEquals(1, DatastoreServiceFactory.getDatastoreService().prepare(query).countEntities());
	}

}
