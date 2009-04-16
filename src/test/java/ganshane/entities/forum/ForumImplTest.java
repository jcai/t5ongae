/*		
 * Copyright 2008 The Fepss Pty Ltd. 
 * site: http://www.fepss.com
 * file: $Id$
 * created at:2009-4-15
 */
package ganshane.entities.forum;

import ganshane.entities.LocalDatastoreTestCase;
import ganshane.entities.Employee;
import ganshane.services.entity.impl.EntityManagerFactoryImpl;
import ganshane.services.entity.impl.EntityServiceImpl;
import ganshane.services.entity.EntityService;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import com.google.appengine.api.datastore.Query;

import com.google.appengine.api.datastore.DatastoreServiceFactory;

/**
 * @author <a href="jun.tsai@fepss.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.0.1
 */
public class ForumImplTest extends LocalDatastoreTestCase
{
    public void testSaveForum(){

        EntityManagerFactory factory = new EntityManagerFactoryImpl();
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        EntityService entityService = new EntityServiceImpl(entityManager);
        Forum forum= new ForumImpl();
        entityService.persist(forum);
        entityManager.getTransaction().commit();

        Query query = new Query(ForumImpl.class.getSimpleName());
        assertEquals(1, DatastoreServiceFactory.getDatastoreService().prepare(query).countEntities());
    }
}
