/*		
 * Copyright 2008 The Fepss Pty Ltd. 
 * site: http://www.fepss.com
 * file: $Id$
 * created at:2009-4-16
 */
package ganshane.entities.impl;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 节点类
 * @author <a href="jun.tsai@fepss.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.0.1
 */
@Entity
public class Node extends AbstractTimestampedModel{
    private String title;
    private int status;
    /** 是否允许评论 0 = no, 1 = closed (read only), 2 = open (read/write).**/
    private int comment;
    /**Boolean indicating whether the node should be displayed on the front page.**/
    private int promote;
    /**Boolean indicating whether the node should be displayed at the top of lists in which it appears.**/
    private int sticky;
    /** node type**/
    private Long typeId;
    /** own member **/
    private Long memberId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public int getPromote() {
        return promote;
    }

    public void setPromote(int promote) {
        this.promote = promote;
    }

    public int getSticky() {
        return sticky;
    }

    public void setSticky(int sticky) {
        this.sticky = sticky;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
}
