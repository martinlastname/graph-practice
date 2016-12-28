/**
 * Nodes for use in graphs and trees
 *
 * @author Martin Matasovic
 * @version 1.0
 * @since 2016-12-25
 */

import java.util.ArrayList;

public class Node {

  // Nodes have n neighbors, 0 through n-1, "left" to "right".
  ArrayList<Node> children = new ArrayList<Node>();

  /**
   * Default no-arg constructor
   *
   * @return Node
   */
  public Node() {

  }

  /**
   * Constructs Node capapble of having given number of neighbors.
   *
   * 0 = no-arg equivalent. Nodes can have as many neihbors as they like.
   * n where n >= 1, maximum number of children node can have.
   *
   * @param max_n maximum number of neighbors Node can have
   * @return Node of specified neighbor limit
   */
  public Node(int max_n) {

  }
  

}
