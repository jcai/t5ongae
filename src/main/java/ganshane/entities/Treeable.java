package ganshane.entities;

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


	  /* bean properties*/
    public static final String LEFT_PRO_NAME="left";
    public static final String RIGHT_PRO_NAME="right";
    public static final String DEPTH_PRO_NAME="depth";
}
