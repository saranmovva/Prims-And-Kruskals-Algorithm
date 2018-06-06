package cs.ben.edu.Lab3;

/**
 * Edge Class
 * 
 * @author Saran
 * @version 1.0s
 *
 */
public class Edge {
	// Class variables
	private int weight;
	private int first;
	private int second;

	/**
	 * Constructor without weight
	 * 
	 * @param first
	 *            -int value of first node
	 * @param second
	 *            - int value of second node
	 */
	public Edge(int first, int second) {
		this.first = first;
		this.second = second;
	}

	/**
	 * Constructor with weight
	 * 
	 * @param weight
	 *            -int value of weight between first and second node
	 * @param first
	 *            -int value of first node
	 * @param second
	 *            -int value of second node
	 */
	public Edge(int weight, int first, int second) {
		this.weight = weight;
		this.first = first;
		this.second = second;
	}

	/**
	 * Method that returns weight
	 * 
	 * @return -int value of weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * Method that sets the weight
	 * 
	 * @param weight
	 *            -int value of weight
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * Method that returns value of first node
	 * 
	 * @return -int value of first node
	 */
	public int getFirst() {
		return first;
	}

	/**
	 * Method that sets the first node
	 * 
	 * @param first
	 *            -int value of first node
	 */
	public void setFirst(int first) {
		this.first = first;
	}

	/**
	 * Method that returns value of second node
	 * 
	 * @return -int value of second node
	 */
	public int getSecond() {
		return second;
	}

	/**
	 * Method that sets the first node
	 * 
	 * @param second
	 *            -int value of second node
	 */
	public void setSecond(int second) {
		this.second = second;
	}
}
