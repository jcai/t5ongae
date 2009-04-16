/*		
 * Copyright 2008 The Fepss Pty Ltd. 
 * site: http://www.fepss.com
 * file: $Id$
 * created at:2009-4-16
 */
package ganshane.entities.impl;

import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Query;
import ganshane.services.entity.EntityService;
import ganshane.services.entity.impl.EntityManagerFactoryImpl;
import ganshane.services.entity.impl.EntityServiceImpl;
import ganshane.entities.impl.Classify;
import ganshane.entities.LocalDatastoreTestCase;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * @author <a href="jun.tsai@fepss.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.0.1
 */
public class ClassifyTest extends LocalDatastoreTestCase {
    public void testSaveClassify(){
        EntityManagerFactory factory = this.getFactory();
		EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
		EntityService entityService = new EntityServiceImpl(entityManager);
		Classify classify= new Classify();
		entityService.persist(classify);
        entityManager.getTransaction().commit();

		Query query = new Query(Classify.class.getSimpleName());
        assertEquals(1, DatastoreServiceFactory.getDatastoreService().prepare(query).countEntities());
	}
}
