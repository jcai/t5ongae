/* 
 * Copyright 2008 The Corner Team.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ganshane.services.entity.impl;

import ganshane.services.entity.EntityService;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.apache.tapestry5.ioc.annotations.Inject;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.jpa.JpaCallback;
import org.springframework.orm.jpa.JpaDialect;
import org.springframework.orm.jpa.JpaTemplate;

/**
 * 实现对JPA的操作
 * @author <a href="mailto:jun.tsai@gmail.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.1
 */
public class EntityServiceImpl implements EntityService {
	/** jpa template **/
	private JpaTemplate jpaTemplate;
	public EntityServiceImpl(@Inject EntityManager entityManager){
		this.jpaTemplate = new JpaTemplate();
		this.jpaTemplate.setEntityManager(entityManager);
	}
	public boolean contains(Object entity) throws DataAccessException {
		return jpaTemplate.contains(entity);
	}
	/**
	 * @see ganshane.services.entity.EntityService#execute(org.springframework.orm.jpa.JpaCallback, boolean)
	 */
	public Object execute(JpaCallback action, boolean exposeNativeEntityManager)
			throws DataAccessException {
		return jpaTemplate.execute(action, exposeNativeEntityManager);
	}
	/**
	 * @see ganshane.services.entity.EntityService#execute(org.springframework.orm.jpa.JpaCallback)
	 */
	public Object execute(JpaCallback action) throws DataAccessException {
		return jpaTemplate.execute(action);
	}
	/**
	 * @see ganshane.services.entity.EntityService#executeFind(org.springframework.orm.jpa.JpaCallback)
	 */
	@SuppressWarnings("unchecked")
	public List executeFind(JpaCallback action) throws DataAccessException {
		return jpaTemplate.executeFind(action);
	}
	/**
	 * @see ganshane.services.entity.EntityService#find(java.lang.Class, java.lang.Object)
	 */
	public <T> T find(Class<T> entityClass, Object id)
			throws DataAccessException {
		return jpaTemplate.find(entityClass, id);
	}
	/**
	 * @see ganshane.services.entity.EntityService#find(java.lang.String, java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	public List find(String queryString, Object... values)
			throws DataAccessException {
		return jpaTemplate.find(queryString, values);
	}
	/**
	 * @see ganshane.services.entity.EntityService#find(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List find(String queryString) throws DataAccessException {
		return jpaTemplate.find(queryString);
	}
	/**
	 * @see ganshane.services.entity.EntityService#findByNamedParams(java.lang.String, java.util.Map)
	 */
	@SuppressWarnings("unchecked")
	public List findByNamedParams(String queryString, Map<String, ?> params)
			throws DataAccessException {
		return jpaTemplate.findByNamedParams(queryString, params);
	}
	/**
	 * @see ganshane.services.entity.EntityService#findByNamedQuery(java.lang.String, java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	public List findByNamedQuery(String queryName, Object... values)
			throws DataAccessException {
		return jpaTemplate.findByNamedQuery(queryName, values);
	}
	/**
	 * @see ganshane.services.entity.EntityService#findByNamedQuery(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List findByNamedQuery(String queryName) throws DataAccessException {
		return jpaTemplate.findByNamedQuery(queryName);
	}
	/**
	 * @see ganshane.services.entity.EntityService#findByNamedQueryAndNamedParams(java.lang.String, java.util.Map)
	 */
	@SuppressWarnings("unchecked")
	public List findByNamedQueryAndNamedParams(String queryName,
			Map<String, ?> params) throws DataAccessException {
		return jpaTemplate.findByNamedQueryAndNamedParams(queryName, params);
	}
	/**
	 * @see ganshane.services.entity.EntityService#flush()
	 */
	public void flush() throws DataAccessException {
		jpaTemplate.flush();
	}
	/**
	 * @see ganshane.services.entity.EntityService#getEntityManager()
	 */
	public EntityManager getEntityManager() {
		return jpaTemplate.getEntityManager();
	}
	/**
	 * @see ganshane.services.entity.EntityService#getEntityManagerFactory()
	 */
	public EntityManagerFactory getEntityManagerFactory() {
		return jpaTemplate.getEntityManagerFactory();
	}
	/**
	 * @see ganshane.services.entity.EntityService#getJpaDialect()
	 */
	public JpaDialect getJpaDialect() {
		return jpaTemplate.getJpaDialect();
	}
	/**
	 * @see ganshane.services.entity.EntityService#getJpaPropertyMap()
	 */
	@SuppressWarnings("unchecked")
	public Map getJpaPropertyMap() {
		return jpaTemplate.getJpaPropertyMap();
	}
	/**
	 * @see ganshane.services.entity.EntityService#getReference(java.lang.Class, java.lang.Object)
	 */
	public <T> T getReference(Class<T> entityClass, Object id)
			throws DataAccessException {
		return jpaTemplate.getReference(entityClass, id);
	}
	public boolean isExposeNativeEntityManager() {
		return jpaTemplate.isExposeNativeEntityManager();
	}
	public boolean isFlushEager() {
		return jpaTemplate.isFlushEager();
	}
	/**
	 * @see ganshane.services.entity.EntityService#merge(T)
	 */
	public <T> T merge(T entity) throws DataAccessException {
		return jpaTemplate.merge(entity);
	}
	/**
	 * @see ganshane.services.entity.EntityService#persist(java.lang.Object)
	 */
	public void persist(Object entity) throws DataAccessException {
		jpaTemplate.persist(entity);
	}
	/**
	 * @see ganshane.services.entity.EntityService#refresh(java.lang.Object)
	 */
	public void refresh(Object entity) throws DataAccessException {
		jpaTemplate.refresh(entity);
	}
	/**
	 * @see ganshane.services.entity.EntityService#remove(java.lang.Object)
	 */
	public void remove(Object entity) throws DataAccessException {
		jpaTemplate.remove(entity);
	}
	public RuntimeException translateIfNecessary(RuntimeException ex) {
		return jpaTemplate.translateIfNecessary(ex);
	}
}
