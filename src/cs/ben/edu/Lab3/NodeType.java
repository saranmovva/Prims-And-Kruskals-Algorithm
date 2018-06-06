package cs.ben.edu.Lab3;

/**
 * Class that holds information of a node
 * 
 * @author Saran
 * @version 1.0
 */
public class NodeType {
	// Class variables
	private int parent;
	private int depth;
	private int smallest;

	/**
	 * Default constructor
	 */
	public NodeType() {
		parent = 0;
		depth = 0;
		smallest = 0;
	}

	/**
	 * Constructors that defines the Node
	 * 
	 * @param parent
	 *            integer value of the parent
	 * @param depth
	 *            integer value of the depth
	 * @param smallest
	 *            integer value of the smallest
	 */
	public NodeType(int parent, int depth, int smallest) {
		this.parent = parent;
		this.depth = depth;
		this.smallest = smallest;
	}

	/**
	 * Getter for the parent
	 * 
	 * @return integer value of the parent
	 */
	public int getParent() {
		return parent;
	}

	/**
	 * Setter for the parent
	 * 
	 * @param parent
	 *            integer value of what you want to set the parent to
	 */
	public void setParent(int parent) {
		this.parent = parent;
	}

	/**
	 * Getter for the depth
	 * 
	 * @return integer value of the depth
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * Setter for the depth
	 * 
	 * @param depth
	 *            integer value of what you want to set the depth to
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}

	/**
	 * Getter for the smallest
	 * 
	 * @return integer value of the smallest
	 */
	public int getSmallest() {
		return smallest;
	}

	/**
	 * Setter for the smallest
	 * 
	 * @param smallest
	 *            integer value of what you want to set the smallest to
	 */
	public void setSmallest(int smallest) {
		this.smallest = smallest;
	}

}
