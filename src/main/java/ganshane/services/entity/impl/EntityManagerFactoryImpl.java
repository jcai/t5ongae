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

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 * 针对google的实体管理的实现类
 * @author <a href="mailto:jun.tsai@gmail.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.1
 */
public class EntityManagerFactoryImpl implements EntityManagerFactory {
	private static final String PERSISTENCE_UNIT = "ganshane";
	private static EntityManagerFactory emfInstance;

	public EntityManagerFactoryImpl() {
		emfInstance = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
	}

	public void close() {
		emfInstance.close();
	}

	public EntityManager createEntityManager() {
		return emfInstance.createEntityManager();
	}

	@SuppressWarnings("unchecked")
	public EntityManager createEntityManager(Map arg0) {
		return emfInstance.createEntityManager(arg0);
	}

	public boolean isOpen() {
		return emfInstance.isOpen();
	}
}
