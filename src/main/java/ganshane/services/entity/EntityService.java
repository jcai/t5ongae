package ganshane.services.entity;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.jpa.JpaCallback;
import org.springframework.orm.jpa.JpaDialect;

public interface EntityService {

	public abstract Object execute(JpaCallback action,
			boolean exposeNativeEntityManager) throws DataAccessException;

	public abstract Object execute(JpaCallback action)
			throws DataAccessException;

	@SuppressWarnings("unchecked")
	public abstract List executeFind(JpaCallback action)
			throws DataAccessException;

	public abstract <T> T find(Class<T> entityClass, Object id)
			throws DataAccessException;

	@SuppressWarnings("unchecked")
	public abstract List find(String queryString, Object... values)
			throws DataAccessException;

	@SuppressWarnings("unchecked")
	public abstract List find(String queryString) throws DataAccessException;

	@SuppressWarnings("unchecked")
	public abstract List findByNamedParams(String queryString,
			Map<String, ?> params) throws DataAccessException;

	@SuppressWarnings("unchecked")
	public abstract List findByNamedQuery(String queryName, Object... values)
			throws DataAccessException;

	@SuppressWarnings("unchecked")
	public abstract List findByNamedQuery(String queryName)
			throws DataAccessException;

	@SuppressWarnings("unchecked")
	public abstract List findByNamedQueryAndNamedParams(String queryName,
			Map<String, ?> params) throws DataAccessException;

	public abstract void flush() throws DataAccessException;

	public abstract EntityManager getEntityManager();

	public abstract EntityManagerFactory getEntityManagerFactory();

	public abstract JpaDialect getJpaDialect();

	@SuppressWarnings("unchecked")
	public abstract Map getJpaPropertyMap();

	public abstract <T> T getReference(Class<T> entityClass, Object id)
			throws DataAccessException;

	public abstract <T> T merge(T entity) throws DataAccessException;

	public abstract void persist(Object entity) throws DataAccessException;

	public abstract void refresh(Object entity) throws DataAccessException;

	public abstract void remove(Object entity) throws DataAccessException;

}