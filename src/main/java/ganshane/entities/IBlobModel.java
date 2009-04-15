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

package ganshane.entities;

import javax.persistence.Enumerated;

import com.google.appengine.api.datastore.Blob;

/**
 * 上传文件实体使用的接口
 * @author <a href=mailto:Ghostbb@bjmaxinfo.com>Ghostbb</a>
 * @version $Revision$
 * @since 0.0.3
 */
public interface IBlobModel {
	
	/**
	 * 得到Blob的二进制数据
	 * @return
	 * @since 0.0.3
	 */
	@Enumerated
	public Blob getBlobData();
	public void setBlobData(Blob data);
	
	/**
	 * 得到ContentType
	 * @return
	 * @since 0.0.3
	 */
	public String getContentType();
	public void setContentType(String contentType);
	
	/**
	 * 得到用户上传文件的名称
	 * @return
	 * @since 0.0.3
	 */
	public String getBlobName();
	public void setBlobName(String name);
}
