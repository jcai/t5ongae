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


/**
 * 论坛的接口
 * @author <a href="mailto:jun.tsai@gmail.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.0.1
 */
public interface Forum extends Treeable{

	
	/**
	 * 得到论坛的名称
	 * @return 论坛的名称
	 */
	public abstract String getName();

	/**
	 * 设定论坛的名称
	 * @param name 论坛名称
	 */
	public abstract void setName(String name);

	
	
	/**
	 * @return Returns the admins.
	 */
	public String getAdmins();

	/**
	 * @param admins
	 *            The admins to set.
	 */
	public void setAdmins(String admins);

	/**
	 * @return Returns the commentNum.
	 */
	public int getCommentNum();

	/**
	 * @param commentNum
	 *            The commentNum to set.
	 */
	public void setCommentNum(int commentNum);

	/**
	 * @return Returns the topicNum.
	 */
	public int getTopicNum();

	/**
	 * @param topicNum
	 *            The topicNum to set.
	 */
	public void setTopicNum(int topicNum);

	/**
	 * @return Returns the description.
	 */
	public String getDescription();

	/**
	 * @param description The description to set.
	 */
	public void setDescription(String description);

}