package data.structures;

import data.structures.adjacencyListGraph.AdjacencyListGraph;

public class Start {

  public static void main(String[] args) {
    AdjacencyListGraph graph = new AdjacencyListGraph(false);

    graph.addVertex("C");
    graph.addVertex("Z");
    graph.addVertex("F");
    graph.addVertex("H");
    graph.addVertex("A");

    graph.addEdge(0, 1);
    graph.addEdge(1, 2);
    graph.addEdge(2, 0);
    graph.addEdge(1, 3);
    graph.addEdge(4, 1);
    graph.addEdge(4, 2);

    graph.removeEdge(0, 1);

    System.out.println(graph);

    graph.breadthFirstTraversal();
  }
}
