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
package ganshane.pages;

import ganshane.services.entity.EntityService;
import ganshane.entities.Employee;
import ganshane.entities.forum.ForumImpl;
import ganshane.entities.forum.Forum;

import org.apache.tapestry5.ioc.annotations.Inject;
import org.slf4j.Logger;

import javax.cache.CacheManager;
import javax.cache.CacheFactory;
import javax.cache.CacheException;
import javax.cache.Cache;
import java.util.Collections;

/**
 * 针对model的测试
 * @author <a href="mailto:jun.tsai@gmail.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.1
 */
public class ModelTest {
	@Inject
	private EntityService entityService;
    @Inject
    private Logger logger;
	
	public void onActionFromEmployee() throws CacheException {
        CacheFactory cacheFactory = null;
        cacheFactory = CacheManager.getInstance().getCacheFactory();
        Cache cache = cacheFactory.createCache(Collections.emptyMap());
        Employee employee = new Employee();
        entityService.persist(employee);
        cache.put(employee.getId(),employee);
	}

	public void onActionFromForum(){
        Forum forum = new ForumImpl();
        entityService.persist(forum);
        logger.debug("forum id:"+forum.getId());
        
	}
}
