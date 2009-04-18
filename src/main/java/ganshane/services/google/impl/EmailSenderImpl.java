/*		
 * Copyright 2008 The Fepss Pty Ltd. 
 * site: http://www.fepss.com
 * file: $Id$
 * created at:2009-4-18
 */
package ganshane.services.google.impl;

import ganshane.services.google.EmailSender;

import javax.mail.Session;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import java.util.Properties;

/**
 * 发送邮件的实现类
 * @author <a href="jun.tsai@fepss.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.0.1
 */
public class EmailSenderImpl implements EmailSender {
    /**
     * 发送Email
     * @param from 发送地址
     * @param to 接受人地址
     * @param subject 主题
     * @param body 内容
     */
    public void sendMail(String from, String to, String subject, String body) {
        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);
        Message msg = new MimeMessage(session);
        try {
            msg.setFrom(new InternetAddress(from));
            msg.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));
            msg.setSubject(subject);
            msg.setText(body);
            Transport.send(msg);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
