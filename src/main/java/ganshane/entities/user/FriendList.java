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

package ganshane.entities.user;

import ganshane.entities.AbstractPersistModel;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

/**
 * 朋友列表
 * @author <a href=mailto:xiafei114@gmail.com>xiafei114</a>
 * @version $Revision$
 * @since 0.0.3
 */
@Entity
@javax.persistence.Table(name="friend_List")
public class FriendList extends AbstractPersistModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -610044147286296482L;

	/**
	 * 好友mail
	 */
	private String friendEmail;
	
	/**
	 * 好友别名
	 */
	private String nickName;
	
	/**
	 * 好友别名
	 */
	private String remark;
	
	/** 当前用户 **/
	private User user;
	
	/**
	 * domain Object method
	 * @param userId
	 * @return new instance of User
	 */
	@Transient
	public static FriendList newInstance(String id) {
		FriendList friendList =new FriendList();
		friendList.setId(id);
		return friendList;
	}
	
	/**
	 * @return Returns the user.
	 */
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="parentId")
	public User getUser() {
		return user;
	}

	/**
	 * @return Returns the friendEmail.
	 */
	public String getFriendEmail() {
		return friendEmail;
	}

	/**
	 * @param friendEmail The friendEmail to set.
	 */
	public void setFriendEmail(String friendEmail) {
		this.friendEmail = friendEmail;
	}

	/**
	 * @return Returns the nickName.
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * @param nickName The nickName to set.
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * @return Returns the remark.
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark The remark to set.
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @param user The user to set.
	 */
	public void setUser(User user) {
		this.user = user;
	}
    /* bean properties begin */
    public static final String FRIEND_EMAIL_PRO_NAME="friendEmail";
    public static final String NICK_NAME_PRO_NAME="nickName";
    public static final String REMARK_PRO_NAME="remark";
    public static final String USER_PRO_NAME="user";
    /* bean properties end */
}
