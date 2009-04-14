package ganshane.services.entity;

import javax.persistence.EntityManager;

/**
 * 针对EntityManager的管理类
 * @author <a href="mailto:jun.tsai@gmail.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.1
 */
public interface EntityManagerManager {

	public abstract EntityManager getEntityManager();

}