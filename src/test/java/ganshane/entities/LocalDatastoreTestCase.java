package ganshane.entities;

import ganshane.LocalServiceTestCase;
import ganshane.services.entity.impl.EntityManagerFactoryImpl;

import com.google.appengine.api.datastore.dev.LocalDatastoreService;
import com.google.appengine.tools.development.ApiProxyLocalImpl;
import com.google.apphosting.api.ApiProxy;

import javax.persistence.EntityManagerFactory;

public class LocalDatastoreTestCase extends LocalServiceTestCase {
    private static EntityManagerFactory entityManagerFactory;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        ApiProxyLocalImpl proxy = (ApiProxyLocalImpl) ApiProxy.getDelegate();
        proxy.setProperty(LocalDatastoreService.NO_STORAGE_PROPERTY, Boolean.TRUE.toString());
        System.out.println("start up ...........");
    }

    @Override
    public void tearDown() throws Exception {
        ApiProxyLocalImpl proxy = (ApiProxyLocalImpl) ApiProxy.getDelegate();
        LocalDatastoreService datastoreService = (LocalDatastoreService) proxy.getService("datastore_v3");
        datastoreService.clearProfiles();
        super.tearDown();
    }
    protected EntityManagerFactory getFactory(){
        if (entityManagerFactory == null) {
            entityManagerFactory = new EntityManagerFactoryImpl();
        }
        return entityManagerFactory;
    }

}