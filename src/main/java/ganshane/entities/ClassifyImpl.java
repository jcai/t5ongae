/*		
 * Copyright 2008 The Fepss Pty Ltd. 
 * site: http://www.fepss.com
 * file: $Id$
 * created at:2009-4-16
 */
package ganshane.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Basic;

/**
 * @author <a href="jun.tsai@fepss.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.0.1
 */
@Entity
public class ClassifyImpl extends AbstractPersistModel implements Classify{
    private String name;
    // ---  以下用来显示树形结构的

	private int left;
	private int right;
	private int depth;

	//左右列的名称
	private static final String LEFT_COLMN_NAME="LEFT_COL";
	private static final String RIGHT_COLMN_NAME="RIGHT_COL";
    	/**
	 */
	@Column(length = 50)
	public String getName() {
		return name;
	}

	/**
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 */
	@Column(name=LEFT_COLMN_NAME)
	public int getLeft() {
		return left;
	}

	/**
	 */
	public void setLeft(int left) {
		this.left = left;
	}



	/**
	 */
    @Column(name="DEPTH_")
    @Basic
	public int getDepth() {
		return depth;
	}

	/**
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}



    /**
	 */
	@Column(name=RIGHT_COLMN_NAME)
	public int getRight() {
		return right;
	}

	/**
	 */
	public void setRight(int right) {
		this.right = right;
	}

}
