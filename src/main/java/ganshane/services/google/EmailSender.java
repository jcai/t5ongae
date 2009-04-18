package ganshane.services.google;

/**
 * 发送Email的服务类
 * @author <a href="jun.tsai@fepss.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.0.1
 */
public interface EmailSender {
    /**
     * 发送Email
     * @param from 发送地址
     * @param to 接受人地址
     * @param subject 主题
     * @param body 内容
     */
    void sendMail(String from, String to, String subject, String body);
}
