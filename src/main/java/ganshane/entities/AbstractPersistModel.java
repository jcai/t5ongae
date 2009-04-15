// Copyright 2007 the original author or authors.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package ganshane.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 抽象模型类
 * 
 * @author jcai
 * @version $Revision$
 * @since 0.0.1
 */
@MappedSuperclass
public class AbstractPersistModel implements Serializable, PersistModel {
	private static final long serialVersionUID = -3238804638512905059L;

	private String id;

	/**
	 * @see ganshane.entities.PersistModel#getId()
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public String getId() {
		return id;
	}

	/**
	 * @see ganshane.entities.PersistModel#setId(java.lang.String)
	 */
	public void setId(String id) {
		this.id = id;
	}
    /* bean properties begin */
    public static final String ID_PRO_NAME="id";
    /* bean properties end */
}
