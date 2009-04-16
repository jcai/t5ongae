/*		
 * Copyright 2008 The Fepss Pty Ltd. 
 * site: http://www.fepss.com
 * file: $Id$
 * created at:2009-4-16
 */
package ganshane.entities;

import javax.persistence.Entity;
import javax.persistence.Column;

/**
 * 增加了类别基础类
 * @author <a href="jun.tsai@fepss.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.0.1
 */
public interface Classify extends Treeable{
    String getName();

    void setName(String name);
}
