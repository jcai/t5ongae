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

import javax.jdo.annotations.Index;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * 所有在线用户
 * @author jcai
 * @version $Revision$
 * @since 0.0.1
 */
@Entity
@Table(name="online_users")
public class OnlineUser extends AbstractPersistModel{
	/**
	 * 删除当前的超时用户
	 */
	public static final String DELETE_TIMEOUT_USERS_QUERY="OnlineUser.delete-timeout-user-query";
	static final String DELETE_TIMEOUT_USERS = "delete OnlineUser o where o."+OnlineUser.LAST_ACTIVE_TIME_PRO_NAME+"<?";
	
	/** 检查在线用户的HQL **/
	public static final String CHECK_ONLINE_USER_NAMED_QUERY="OnlineUser.check_online_user_named_query";
	static final String CHECK_ONLINE_USER_HQL = "from OnlineUser u where u."+OnlineUser.USER_PRO_NAME+"=?";
	
	/** 判断是否为已经登录的用户 **/
	public static final String QUERY_LOGIN_SYSTEM_USER_NAMED_QUERY="OnlineUser.query_login_system_user_named_query";
	static final String QUERY_LOGIN_SYSTEM_USER_HQL="select count(*) from OnlineUser u where " +
			"u."+OnlineUser.USER_PRO_NAME+"=? and u."+OnlineUser.SECURITY_CODE_PRO_NAME+"=?";
	
	/** 获得当前在线人数 **/
	public static final String COUNT_ONLINE_USER_NUM_NAMED_QUERY="OnlineUser.count_online_user_num_named_query";
	static final String COUNT_ONLINE_USER_NUM = "select count(*) from OnlineUser u";

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6049884480479354114L;
	
	/** 当前用户 **/
	private User user;
	/** 用户的nickName **/
	private String nickName;
	/** 安全码 **/
	private String securityCode;
	/** 访问者的IP **/
	private String ipAddress;
	/** 登录时间 **/
	private long loginTime;
	/** 最后一次活动时间 **/
	private long lastActiveTime;
	/** 最后一次活动的内容 **/
	private String lastActiveContent;
	
	public static final String SECURITY_CODE_COLUMN_NAME="securityCode";
	
	/**
	 * @return Returns the lastActiveContent.
	 */
	public String getLastActiveContent() {
		return lastActiveContent;
	}
	/**
	 * @param lastActiveContent The lastActiveContent to set.
	 */
	public void setLastActiveContent(String lastActiveContent) {
		this.lastActiveContent = lastActiveContent;
	}
	/**
	 * @return Returns the lastActiveTime.
	 */
	@Index(name="OnlineUser_last_active_time")
	public long getLastActiveTime() {
		return lastActiveTime;
	}
	/**
	 * @param lastActiveTime The lastActiveTime to set.
	 */
	public void setLastActiveTime(long lastActiveTime) {
		this.lastActiveTime = lastActiveTime;
	}
	/**
	 * @return Returns the loginTime.
	 */
	public long getLoginTime() {
		return loginTime;
	}
	/**
	 * @param loginTime The loginTime to set.
	 */
	public void setLoginTime(long loginTime) {
		this.loginTime = loginTime;
	}
	/**
	 * @return Returns the securityCode.
	 */
	@Index(name="online_security_code")
	@Column(name=SECURITY_CODE_COLUMN_NAME)
	public String getSecurityCode() {
		return securityCode;
	}
	/**
	 * @param securityCode The securityCode to set.
	 */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	/**
	 * @return Returns the user.
	 */
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id",unique=true)
	@Index(name="online_security_code")
	public User getUser() {
		return user;
	}
	/**
	 * @param user The user to set.
	 */
	public void setUser(User user) {
		this.user = user;
	}
	

	/**
	 * @return Returns the ipAddress.
	 */
	public String getIpAddress() {
		return ipAddress;
	}
	/**
	 * @param ipAddress The ipAddress to set.
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
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
    /* bean properties begin */
    public static final String USER_PRO_NAME="user";
    public static final String NICK_NAME_PRO_NAME="nickName";
    public static final String SECURITY_CODE_PRO_NAME="securityCode";
    public static final String IP_ADDRESS_PRO_NAME="ipAddress";
    public static final String LOGIN_TIME_PRO_NAME="loginTime";
    public static final String LAST_ACTIVE_TIME_PRO_NAME="lastActiveTime";
    public static final String LAST_ACTIVE_CONTENT_PRO_NAME="lastActiveContent";
    /* bean properties end */
}
