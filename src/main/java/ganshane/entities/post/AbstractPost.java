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

import ganshane.entities.AbstractPersistModel;
import ganshane.entities.forum.Forum;
import ganshane.entities.forum.ForumImpl;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 抽象的Post接口.
 * @author jcai
 * @version $Revision$
 * @since 0.0.1
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING, length = 2)
@Table(name = "posts")
public class AbstractPost extends AbstractPersistModel implements Post {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7646427661718289971L;

	private Forum forum;

	private String title;

	private String content;

	private Topic parentTopic;

	private Post parentNode; 
	
	private String thread;
	
	//创建时间
	private long createDate;
	

	/**
	 * @see ganshane.entities.post.Post#getThread()
	 */
	public String getThread() {
		return thread;
	}

	/**
	 * @see ganshane.entities.post.Post#setThread(java.lang.String)
	 */
	public void setThread(String thread) {
		this.thread = thread;
	}



	/**
	 * @see ganshane.entities.post.Post#getContent()
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @see ganshane.entities.post.Post#setContent(java.lang.String)
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @see ganshane.entities.post.Post#getForum()
	 */
	@ManyToOne(targetEntity=ForumImpl.class)
	public Forum getForum() {
		return forum;
	}

	/**
	 * 
	 * @see ganshane.entities.post.Post#setForum(ganshane.entities.forum.Forum)
	 */
	public void setForum(Forum forumImpl) {
		this.forum = forumImpl;
	}

	/**
	 * @see ganshane.entities.post.Post#getTitle()
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @see ganshane.entities.post.Post#setTitle(java.lang.String)
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	
	/**
	 * @see ganshane.entities.post.Post#getParentNode()
	 */
	@ManyToOne(targetEntity=AbstractPost.class)
	public Post getParentNode() {
		return parentNode;
	}

	/**
	 * @see ganshane.entities.post.Post#setParentNode(ganshane.entities.post.Post)
	 */
	public void setParentNode(Post parentNode) {
		this.parentNode = parentNode;
	}

	/**
	 * @see ganshane.entities.post.Post#getParentTopic()
	 */
	@ManyToOne
	public Topic getParentTopic() {
		return parentTopic;
	}

	/**
	 * @see ganshane.entities.post.Post#setParentTopic(ganshane.entities.post.Topic)
	 */
	public void setParentTopic(Topic parentTopic) {
		this.parentTopic = parentTopic;
	}



	/**
	 * @see ganshane.entities.post.Post#getThreadRtimed()
	 */
	@Transient
	public String getThreadRtimed() {
		return this.getThread().substring(0,this.getThread().length()-1);
	}

	/**
	 * @return Returns the createDate.
	 */
	
	public long getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate The createDate to set.
	 */
	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}

	@Transient
	public boolean isTopic() {
		return false;
	}
    /* bean properties begin */
    public static final String FORUM_PRO_NAME="forum";
    public static final String TITLE_PRO_NAME="title";
    public static final String CONTENT_PRO_NAME="content";
    public static final String PARENT_TOPIC_PRO_NAME="parentTopic";
    public static final String PARENT_NODE_PRO_NAME="parentNode";
    public static final String THREAD_PRO_NAME="thread";
    public static final String CREATE_DATE_PRO_NAME="createDate";
    /* bean properties end */
}