//PROJECT DEVELOPER'S NAME: Saran Sai Movva
//COURSE NUMBER: CMSC270
//DATE: 1/29/2017
//PROJECTNAME: DisjointSet Class
//DESCRIPTION: The purpose of this assignment is to create a class called DisjointSetwith methods
//as defined by Disjoint Set Data StructureI, II, andIII in the Appendix C document taken from the
//third edition of Foundations of Algorithms by Neapolitan and Naimipour.Your code will ultimately 
//be the code resultant from Disjoint Set Data Structure III.
//FILES: DisjointSet.java, NodeType.java.
//BUGS: None that i have noticed
//problems existing in your project.
//UNIMPLEMENTED FEATURES: A better display to clearly represent the output 
//RESULTS AND CONCLUSIONS: Result is that the algorithms are crucial to making a efficient program. Now here
//it was a bit difficult to execute because I thought the project was a bit too vague 
package cs.ben.edu.Lab3;

/**
 * DisjointSet Class
 * 
 * @author Saran
 * @version 1.0
 *
 */
public class DisjointSet {
	// Array of the universe
	private NodeType[] universe = null;

	/**
	 * Default constructor
	 */
	public DisjointSet() {
		this.universe = new NodeType[21];
		for (int i = 1; i < 21; i++) {
			universe[i] = new NodeType();
			makeSet(i);
		}
	}

	/**
	 * Constructor that takes in size
	 * 
	 * @param size
	 *            integer value of the size of the universe
	 */
	public DisjointSet(int size) {
		this.universe = new NodeType[++size];
		for (int i = 1; i < size; i++) {
			universe[i] = new NodeType();
			makeSet(i);
		}
	}

	/**
	 * Method that finds the parent of a node
	 * 
	 * @param i
	 *            integer value of the node you are trying to find
	 * @return returns the integer value if the parent
	 */
	public int find(int i) {
		int temp = i;
		while (universe[temp].getParent() != temp) {
			temp = universe[temp].getParent();
		}
		return temp;
	}

	/**
	 * Method that merges two nodes
	 * 
	 * @param p
	 *            integer value of the first node you want to merge
	 * @param q
	 *            integer value of the second node you want to merge
	 */
	public void merge(int p, int q) {
		if (universe[p].getDepth() == universe[q].getDepth()) {
			universe[p].setDepth(universe[p].getDepth() + 1);
			universe[q].setParent(p);

			if (universe[q].getSmallest() < universe[p].getSmallest()) {
				universe[p].setSmallest(universe[q].getSmallest());
			}
		} else if (universe[p].getDepth() < universe[q].getDepth()) {
			universe[p].setParent(q);
			if (universe[p].getSmallest() < universe[q].getSmallest()) {
				universe[q].setSmallest(universe[p].getSmallest());
			}
		} else {
			universe[q].setParent(p);
			if (universe[q].getSmallest() < universe[p].getSmallest()) {
				universe[p].setSmallest(universe[q].getSmallest());
			}
		}
	}

	/**
	 * Method that checks to see if two nodes are in the same set
	 * 
	 * @param i
	 *            integer value of the first node you are checking
	 * @param j
	 *            integer value of the second node you are checking
	 * @return boolean value true if they are in the same set and false if they
	 *         are not
	 */
	public boolean sameSet(int i, int j) {
		if (find(i) == find(j)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Smallest value in a set
	 * 
	 * @param p
	 *            the value of the node that you want to find the smallest of
	 * @return integer value of the smallest
	 */
	public int small(int p) {
		return universe[p].getSmallest();
	}

	/**
	 * Outputs the current state of the universe
	 */
	public void display() {
		NodeType temp;
		for (int i = 1; i < universe.length; i++) {
			temp = universe[i];
			System.out.print("Parent = " + temp.getParent() + " ");
			System.out.print("Depth = " + temp.getDepth() + " ");
			System.out.println("Smallest = " + temp.getSmallest() + " ");
		}
	}

	/**
	 * Method that check if the two nodes are the same
	 * 
	 * @param p
	 *            NodeType of the first node you want to check
	 * @param q
	 *            NodeType of the second node you want to check
	 * @return boolean value true if they are equal and false if they are not
	 */
	protected boolean equal(NodeType p, NodeType q) {
		if (p == q) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Method that creates a Set of the integer value
	 * 
	 * @param i
	 *            integer value of the set you want to create
	 */
	protected void makeSet(int i) {
		universe[i].setParent(i);
		universe[i].setDepth(0);
		universe[i].setSmallest(i);
	}
}
