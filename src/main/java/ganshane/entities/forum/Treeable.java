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

import ganshane.entities.PersistModel;

/**
 * 一个实现树形结构接口
 * @author <a href="mailto:jun.tsai@gmail.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.0.1
 */
public interface Treeable extends PersistModel{
	/**
	 * @return Returns the left.
	 */
	public int getLeft();

	/**
	 * @param left The left to set.
	 */
	public void setLeft(int left);

	/**
	 * @return Returns the right.
	 */
	public int getRight();

	/**
	 * @param right The right to set.
	 */
	public void setRight(int right);

	/**
	 * @return Returns the depth.
	 */
	public int getDepth();

	/**
	 * @param depth The depth to set.
	 */
	public void setDepth(int depth);
	/**
	 * 得到树的缩进字符串
	 * @return 缩进字符串
	 */
	public String getIndent();

	  /* bean properties*/
    public static final String LEFT_PRO_NAME="left";
    public static final String RIGHT_PRO_NAME="right";
    public static final String DEPTH_PRO_NAME="depth";
}
