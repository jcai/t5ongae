/*		
 * Copyright 2008 The Fepss Pty Ltd. 
 * site: http://www.fepss.com
 * file: $Id$
 * created at:2009-4-18
 */
package ganshane.pages;

import ganshane.services.google.EmailSender;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.annotations.Property;

/**
 * 发送Email的页面
 * @author <a href="jun.tsai@fepss.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.0.1
 */
public class MailForm {
    @Inject
    private EmailSender sender;
    @Property
    private String from;
    @Property
    private String to;
    @Property
    private String subject;
    @Property
    private String body;

    void onActionFromMailForm(){
        sender.sendMail(from,to,subject,body);
        
    }
}
