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

package ganshane.entities.post;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * 回复的贴子
 * @author <a href="mailto:jun.tsai@gmail.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.0.1
 */
@Entity
@DiscriminatorValue("c")
public class Comment extends AbstractPost{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7348291855033632672L;

}
