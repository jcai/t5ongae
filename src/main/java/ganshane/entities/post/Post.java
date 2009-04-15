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

import javax.persistence.Transient;

import ganshane.entities.PersistModel;
import ganshane.entities.forum.Forum;

/**
 * 论坛所有内容的接口.
 * 
 * @author <a href="mailto:jun.tsai@gmail.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.0.1
 */
public interface Post extends PersistModel{

	/**
	 * @return Returns the thread.
	 */
	public abstract String getThread();

	/**
	 * @param thread The thread to set.
	 */
	public abstract void setThread(String thread);

	/**
	 * @return Returns the content.
	 */
	public abstract String getContent();

	/**
	 * @param content
	 *            The content to set.
	 */
	public abstract void setContent(String content);

	/**
	 * @return Returns the forum.
	 */
	public abstract Forum getForum();

	/**
	 * @param forumImpl
	 *            The forum to set.
	 */
	public abstract void setForum(Forum forumImpl);

	/**
	 * @return Returns the title.
	 */
	public abstract String getTitle();

	/**
	 * @param title
	 *            The title to set.
	 */
	public abstract void setTitle(String title);

	/**
	 * @return Returns the parentNode.
	 */
	public abstract Post getParentNode();

	/**
	 * @param parentNode The parentNode to set.
	 */
	public abstract void setParentNode(Post parentNode);

	/**
	 * @return Returns the parentTopic.
	 */
	public abstract Topic getParentTopic();

	/**
	 * @param parentTopic The parentTopic to set.
	 */
	public abstract void setParentTopic(Topic parentTopic);



	@Transient
	public abstract String getThreadRtimed();
	@Transient
	public abstract boolean  isTopic();

	/**
	 * @return Returns the createDate.
	 */
	public long getCreateDate();

	/**
	 * @param createDate The createDate to set.
	 */
	public void setCreateDate(long createDate);

}