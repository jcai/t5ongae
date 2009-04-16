package ganshane.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href="jun.tsai@fepss.com">Jun Tsai</a>
 * @version $Revision$
 * @since 0.0.1
 */
public interface TimestampedModel extends Serializable, PersistModel {
    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    Date getUpdatedAt();

    void setUpdatedAt(Date updatedAt);
}
