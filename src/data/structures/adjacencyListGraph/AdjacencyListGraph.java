package data.structures.adjacencyListGraph;

import java.util.*;

public class AdjacencyListGraph {

  private Vertex[] vertexes;

  private boolean directed;

  private int lastIndexVertex;

  public AdjacencyListGraph(boolean directed) {
    this.vertexes = new Vertex[10];
    this.directed = directed;
    this.lastIndexVertex = 0;
  }


  public void addVertex(String value) {
    this.vertexes[this.lastIndexVertex] = new Vertex(this.lastIndexVertex, value);
    this.lastIndexVertex++;
  }

  public void removeVertex(String value) {
    for (int i = 0; i < this.lastIndexVertex; i++) {
      Vertex vertex = this.vertexes[i];
      if (vertex != null && vertex.getValue().equals(value)) {
        this.vertexes[i] = null;

        for (int j = 0; j < this.lastIndexVertex; j++) {
          Vertex sourceVertex = this.vertexes[j];
          if (sourceVertex != null) {
            List<Edge> adjacencyListsDest = sourceVertex.getAdjacencyLists();
            for (Edge edge : adjacencyListsDest) {
              if (edge.getDestinationVertex() == vertex.getIndex()) {
                adjacencyListsDest.remove(edge);
                break;
              }
            }
          }
        }
      }
    }
  }

  public void addEdge(int sourceVertex, int destinationVertex) {
    addEdge(sourceVertex, destinationVertex, 1);
  }

  public void addEdge(int sourceVertex, int destinationVertex, double weight) {
    if (!containsEdge(sourceVertex, destinationVertex)) {
      Vertex vertex = this.vertexes[sourceVertex];
      if (vertex != null) {
        List<Edge> adjacencyLists = vertex.getAdjacencyLists();
        adjacencyLists.add(new Edge(sourceVertex, destinationVertex, weight));
        if (!directed) {
          Vertex vertexSource = this.vertexes[destinationVertex];
          List<Edge> adjacencyListsDest = vertexSource.getAdjacencyLists();
          adjacencyListsDest.add(new Edge(destinationVertex, sourceVertex, weight));
        }
      }
    }
  }

  public void removeEdge(int sourceVertex, int destinationVertex) {
    Vertex vertex = this.vertexes[sourceVertex];
    if (vertex != null) {
      List<Edge> adjacencyList = vertex.getAdjacencyLists();
      for (Edge edge : adjacencyList) {
        if (edge.getDestinationVertex() == destinationVertex) {
          adjacencyList.remove(edge);

          if (!directed) {
            Vertex vertexSource = this.vertexes[destinationVertex];
            List<Edge> adjacencyListDest = vertexSource.getAdjacencyLists();
            adjacencyListDest.removeIf(edge2 -> edge2.getDestinationVertex() == sourceVertex);
          }
        }
      }
    }
  }

  private boolean containsEdge(int sourceVertex, int destinationVertex) {
    Vertex vertex = this.vertexes[sourceVertex];
    if (vertex != null) {
      List<Edge> adjacencyLists = vertex.getAdjacencyLists();
      for (Edge edge : adjacencyLists) {
        if (edge.getDestinationVertex() == destinationVertex) {
          return true;
        }
      }
    }
    return false;
  }

  public void breadthFirstTraversal() {
    Vertex firstVertex = null;
    for (Vertex vertex : this.vertexes) {
      if (vertex != null) {
        firstVertex = vertex;
        break;
      }
    }

    Queue<Vertex> toBeVisitedQueue = new LinkedList<Vertex>();
    toBeVisitedQueue.offer(firstVertex);

    Set<Vertex> visitedIdentifiedVertex = new HashSet<Vertex>();
    visitedIdentifiedVertex.add(firstVertex);

    while (toBeVisitedQueue.peek() != null) {
      Vertex vertex = toBeVisitedQueue.poll();
      for (Edge edge : vertex.getAdjacencyLists()) {
        Vertex adjacentVertex = getVertex(edge.getDestinationVertex());
        if (!visitedIdentifiedVertex.contains(adjacentVertex)) {
          toBeVisitedQueue.offer(adjacentVertex);
          visitedIdentifiedVertex.add(adjacentVertex);
        }
      }
      System.out.print(vertex.getValue() + ", ");
    }
  }

  private Vertex getVertex(int index) {
    for (Vertex vertex : this.vertexes) {
      if (vertex.getIndex() == index) {
        return vertex;
      }
    }

    return null;
  }

  public String toString() {
    StringBuilder toReturn = new StringBuilder("Directed=" + this.directed + "\n");
    for (Vertex vertex : this.vertexes) {
      if (vertex != null) {
        toReturn.append(vertex.toString()).append("\n");
      }
    }
    return toReturn.toString();
  }
}
