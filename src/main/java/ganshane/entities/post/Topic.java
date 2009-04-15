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

import ganshane.entities.IBlobModel;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

import com.google.appengine.api.datastore.Blob;

/**
 * 论坛的帖子
 * 
 * @author jcai
 * @version $Revision$
 * @since 0.0.1
 */
@Entity
@DiscriminatorValue("t")
public class Topic extends AbstractPost implements IBlobModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3685296942413753894L;
	
	//回帖的数目
	private int commentNum;
	//查看的次数
	private int viewNum;
	
	private Blob blobData;
	
	public Blob getBlobData() {
		return blobData;
	}

	public void setBlobData(Blob blobData) {
		this.blobData = blobData;
	}

	private String contentType;
	
	private String blobName;

	

	/**
	 * @return Returns the blobName.
	 */
	public String getBlobName() {
		return blobName;
	}

	/**
	 * @param blobName The blobName to set.
	 */
	public void setBlobName(String blobName) {
		this.blobName = blobName;
	}

	/**
	 * @return Returns the contentType.
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * @param contentType The contentType to set.
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * @return Returns the commentNum.
	 */
	public int getCommentNum() {
		return commentNum;
	}

	/**
	 * @param commentNum The commentNum to set.
	 */
	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}

	/**
	 * @return Returns the viewNum.
	 */
	public int getViewNum() {
		return viewNum;
	}

	/**
	 * @param viewNum The viewNum to set.
	 */
	public void setViewNum(int viewNum) {
		this.viewNum = viewNum;
	}
	@Override
	@Transient
	public boolean isTopic() {
		return true;
	}
	
    /* bean properties begin */
    public static final String COMMENT_NUM_PRO_NAME="commentNum";
    public static final String VIEW_NUM_PRO_NAME="viewNum";
    /* bean properties end */

	public IBlobModel newInstance() {
		return new Topic();
	}

}
