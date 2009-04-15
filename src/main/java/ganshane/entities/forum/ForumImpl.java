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

package ganshane.entities.forum;

import ganshane.entities.AbstractPersistModel;
import ganshane.entities.post.AbstractPost;

import java.util.List;

import javax.jdo.annotations.Index;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 论坛类别的实体类
 * 
 * @author <a href="mailto:jun.tsai@gmail.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.0.1
 */
@Entity
@Table(name="forums")
public class ForumImpl extends AbstractPersistModel implements Forum {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8382356157445002112L;
	// 论坛的主题数
	private int topicNum;
	// 论坛的回复数
	private int commentNum;

	// 论坛的斑竹
	private String admins;

	private List<AbstractPost> topics;
//	 论坛的名字
	private String name;
	//论坛的描述
	private String description;
	
	// ---  以下用来显示树形结构的
	
	private int left;
	private int right;
	private int depth;

	//左右列的名称
	private static final String LEFT_COLMN_NAME="LEFT_COL";
	private static final String RIGHT_COLMN_NAME="RIGHT_COL";
	
	//左边列的索引值
	private static final String LEFT_COLUMN_INDEX_NAME="FORUM_CLASS_LEFT_INDEX";

	/**
	 * @see ganshane.entities.forum.Forum#getName()
	 */
	@Column(length = 50)
	public String getName() {
		return name;
	}

	/**
	 * @see ganshane.entities.forum.Forum#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @see ganshane.entities.forum.Forum#getLeft()
	 */
	@Index(name=LEFT_COLUMN_INDEX_NAME)
	@Column(name=LEFT_COLMN_NAME)
	public int getLeft() {
		return left;
	}

	/**
	 * @see ganshane.entities.forum.Forum#setLeft(int)
	 */
	public void setLeft(int left) {
		this.left = left;
	}

	

	/**
	 * @see ganshane.entities.forum.Forum#getDepth()
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * @see ganshane.entities.forum.Forum#setDepth(int)
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}

	/**
	 * @see ganshane.entities.forum.Forum#getRight()
	 */
	@Column(name=RIGHT_COLMN_NAME)
	public int getRight() {
		return right;
	}

	/**
	 * @see ganshane.entities.forum.Forum#setRight(int)
	 */
	public void setRight(int right) {
		this.right = right;
	}

	
	/**
	 * @return Returns the admins.
	 */
	public String getAdmins() {
		return admins;
	}

	/**
	 * @param admins
	 *            The admins to set.
	 */
	public void setAdmins(String admins) {
		this.admins = admins;
	}

	/**
	 * @return Returns the commentNum.
	 */
	public int getCommentNum() {
		return commentNum;
	}

	/**
	 * @param commentNum
	 *            The commentNum to set.
	 */
	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}

	/**
	 * @return Returns the topicNum.
	 */
	public int getTopicNum() {
		return topicNum;
	}

	/**
	 * @param topicNum
	 *            The topicNum to set.
	 */
	public void setTopicNum(int topicNum) {
		this.topicNum = topicNum;
	}

	/**
	 * @return Returns the topics.
	 */
	@OneToMany(mappedBy="forum")
	public List<AbstractPost> getPosts() {
		return topics;
	}

	/**
	 * @param topics
	 *            The topics to set.
	 */
	public void setPosts(List<AbstractPost> topics) {
		this.topics = topics;
	}

	public static Forum newInstance(String forumId) {
		Forum forumImpl = new ForumImpl();
		forumImpl.setId(forumId);
		return forumImpl;
	}
	
	/**
	 * @return Returns the description.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description The description to set.
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @see ganshane.entities.forum.Treeable#getIndent()
	 */
	@Transient
	public String getIndent() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < this.getDepth(); i++) {
			sb.append("&nbsp;&nbsp;");
		}
		return sb.toString();
		
	}

    /* bean properties begin */
    public static final String TOPIC_NUM_PRO_NAME="topicNum";
    public static final String COMMENT_NUM_PRO_NAME="commentNum";
    public static final String ADMINS_PRO_NAME="admins";
    public static final String TOPICS_PRO_NAME="topics";
    public static final String NAME_PRO_NAME="name";
    public static final String DESCRIPTION_PRO_NAME="description";
    public static final String LEFT_PRO_NAME="left";
    public static final String RIGHT_PRO_NAME="right";
    public static final String DEPTH_PRO_NAME="depth";
    /* bean properties end */
}
