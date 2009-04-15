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

import java.security.Principal;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

/**
 * 用户实体
 * 
 * @author <a href=mailto:Ghostbb@bjmaxinfo.com>Ghostbb</a>
 * @author <a href="mailto:jun.tsai@gmail.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.0.1
 */
@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = {User.EMAIL_PRO_NAME})})
public class User extends AbstractPersistModel implements Principal{
	
	/** 检查在线用户的HQL **/
	public static final String CHECK_USER_HQL_NAMED_QUERY="user.check_user_hql_named_query";
	static final String CHECK_USER_HQL = "from User  u where u."+User.EMAIL_PRO_NAME+"=? and u."+User.PASSWORD_PRO_NAME+"=?";
	/** 判断是否存在给定的email 地址 **/
	public static final String EXIST_USER_EMAIL_NAMED_QUERY="User.exist_user_email_named_query";
	static final String EXIST_USER_EMAIL_HQL="select count(*) from User u where u."+User.EMAIL_PRO_NAME+"=?";

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
    private boolean accountNonExpired = true;
    private boolean accountNonLocked = true;
    private boolean credentialsNonExpired = true;
    private boolean enabled = true;
    private Collection<GrantedAuthority> grantedAuthorities = 
        new HashSet<GrantedAuthority>();

	private String email;
	
	private String password;
	
	private String nickName;
	
	private List<FriendList> friendLists;
	
	private String qq;

	private String icq;

	private String yahoo;

	private String msn;

	private String comefrom;

	private String homepage;

	private String sex;

	private String birthday;

	private String idiograph;

	private String headPortrait;

	private String style;

	private String timeZone;
	
	/**
	 * 用户发帖数
	 */
	private int topicCount;
	
	/**
	 * @return Returns the topics.
	 */
	@OneToMany(mappedBy="user")
	public List<FriendList> getFriendLists() {
		return friendLists;
	}

	/**
	 * @return Returns the password.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password The password to set.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	
	/**
	 * 
	 * @see java.security.Principal#getName()
	 * @since 0.0.3
	 */
	@Transient
	public String getName() {
		return this.getEmail();
	}
	
	/**
	 * domain Object method
	 * @param userId
	 * @return new instance of User
	 */
	@Transient
	public static User newInstance(String userId) {
		User user =new User();
		user.setId(userId);
		return user;
	}

	/**
	 * @return Returns the email.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email The email to set.
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @param friendLists The friendLists to set.
	 */
	public void setFriendLists(List<FriendList> friendLists) {
		this.friendLists = friendLists;
	}

	/**
	 * @return Returns the topicCount.
	 */
	public int getTopicCount() {
		return topicCount;
	}

	/**
	 * @param topicCount The topicCount to set.
	 */
	public void setTopicCount(int topicCount) {
		this.topicCount = topicCount;
	}
	
	/**
	 * @return Returns the birthday.
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday The birthday to set.
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return Returns the comefrom.
	 */
	public String getComefrom() {
		return comefrom;
	}

	/**
	 * @param comefrom The comefrom to set.
	 */
	public void setComefrom(String comefrom) {
		this.comefrom = comefrom;
	}

	/**
	 * @return Returns the headPortrait.
	 */
	public String getHeadPortrait() {
		return headPortrait;
	}

	/**
	 * @param headPortrait The headPortrait to set.
	 */
	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait;
	}

	/**
	 * @return Returns the homepage.
	 */
	public String getHomepage() {
		return homepage;
	}

	/**
	 * @param homepage The homepage to set.
	 */
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	/**
	 * @return Returns the icq.
	 */
	public String getIcq() {
		return icq;
	}

	/**
	 * @param icq The icq to set.
	 */
	public void setIcq(String icq) {
		this.icq = icq;
	}

	/**
	 * @return Returns the idiograph.
	 */
	public String getIdiograph() {
		return idiograph;
	}

	/**
	 * @param idiograph The idiograph to set.
	 */
	public void setIdiograph(String idiograph) {
		this.idiograph = idiograph;
	}

	/**
	 * @return Returns the msn.
	 */
	public String getMsn() {
		return msn;
	}

	/**
	 * @param msn The msn to set.
	 */
	public void setMsn(String msn) {
		this.msn = msn;
	}

	/**
	 * @return Returns the qq.
	 */
	public String getQq() {
		return qq;
	}

	/**
	 * @param qq The qq to set.
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 * @return Returns the sex.
	 */
	@Column(columnDefinition = "varchar(10)")
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex The sex to set.
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return Returns the style.
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * @param style The style to set.
	 */
	public void setStyle(String style) {
		this.style = style;
	}

	/**
	 * @return Returns the timeZone.
	 */
	public String getTimeZone() {
		return timeZone;
	}

	/**
	 * @param timeZone The timeZone to set.
	 */
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	/**
	 * @return Returns the yahoo.
	 */
	public String getYahoo() {
		return yahoo;
	}
	
	   @Transient
		public GrantedAuthority[] getAuthorities() {
	        final Collection<GrantedAuthority> grantedAuthorities =
	            getGrantedAuthorities();
	        return (GrantedAuthority[]) grantedAuthorities.toArray(
	                new GrantedAuthority[grantedAuthorities.size()]);
		}

		/**
		 * @return Returns the accountNonExpired.
		 */
		public boolean isAccountNonExpired() {
			return accountNonExpired;
		}

		/**
		 * @param accountNonExpired The accountNonExpired to set.
		 */
		public void setAccountNonExpired(boolean accountNonExpired) {
			this.accountNonExpired = accountNonExpired;
		}

		/**
		 * @return Returns the accountNonLocked.
		 */
		public boolean isAccountNonLocked() {
			return accountNonLocked;
		}

		/**
		 * @param accountNonLocked The accountNonLocked to set.
		 */
		public void setAccountNonLocked(boolean accountNonLocked) {
			this.accountNonLocked = accountNonLocked;
		}

		/**
		 * @return Returns the credentialsNonExpired.
		 */
		public boolean isCredentialsNonExpired() {
			return credentialsNonExpired;
		}

		/**
		 * @param credentialsNonExpired The credentialsNonExpired to set.
		 */
		public void setCredentialsNonExpired(boolean credentialsNonExpired) {
			this.credentialsNonExpired = credentialsNonExpired;
		}

		/**
		 * @return Returns the enabled.
		 */
		public boolean isEnabled() {
			return enabled;
		}

		/**
		 * @param enabled The enabled to set.
		 */
		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}

		/**
		 * @return Returns the username.
		 */
		@Transient
		public String getUsername() {
			return this.getEmail();
		}



		/**
		 * @return Returns the grantedAuthorities.
		 */
	    @OneToMany
		public Collection<GrantedAuthority> getGrantedAuthorities() {
			return grantedAuthorities;
		}

		/**
		 * @param grantedAuthorities The grantedAuthorities to set.
		 */
		public void setGrantedAuthorities(
				Collection<GrantedAuthority> grantedAuthorities) {
			this.grantedAuthorities = grantedAuthorities;
		}
		
	    public void addRole(String role) {
	        final GrantedAuthority authority = new GrantedAuthority();
	        authority.setAuthority(role);
	        getGrantedAuthorities().add(authority);
	    }

	/**
	 * @param yahoo The yahoo to set.
	 */
	public void setYahoo(String yahoo) {
		this.yahoo = yahoo;
	}

    /* bean properties begin */
    public static final String EMAIL_PRO_NAME="email";
    public static final String PASSWORD_PRO_NAME="password";
    public static final String NICK_NAME_PRO_NAME="nickName";
    public static final String FRIEND_LISTS_PRO_NAME="friendLists";
    public static final String QQ_PRO_NAME="qq";
    public static final String ICQ_PRO_NAME="icq";
    public static final String YAHOO_PRO_NAME="yahoo";
    public static final String MSN_PRO_NAME="msn";
    public static final String COMEFROM_PRO_NAME="comefrom";
    public static final String HOMEPAGE_PRO_NAME="homepage";
    public static final String SEX_PRO_NAME="sex";
    public static final String BIRTHDAY_PRO_NAME="birthday";
    public static final String IDIOGRAPH_PRO_NAME="idiograph";
    public static final String HEAD_PORTRAIT_PRO_NAME="headPortrait";
    public static final String STYLE_PRO_NAME="style";
    public static final String TIME_ZONE_PRO_NAME="timeZone";
    public static final String TOPIC_COUNT_PRO_NAME="topicCount";
    /* bean properties end */



}
