package data.structures.adjacencyListGraph;

public class Edge {

  private int sourceVertex;

  private int destinationVertex;

  private double weight;

  public Edge(int sourceVertex, int destinationVertex) {
    this.sourceVertex = sourceVertex;
    this.destinationVertex = destinationVertex;
    this.weight = 1;
  }

  public Edge(int sourceVertex, int destinationVertex, double weight) {
    this.sourceVertex = sourceVertex;
    this.destinationVertex = destinationVertex;
    this.weight = weight;
  }

  public int getSourceVertex() {
    return sourceVertex;
  }

  public void setSourceVertex(int sourceVertex) {
    this.sourceVertex = sourceVertex;
  }

  public int getDestinationVertex() {
    return destinationVertex;
  }

  public void setDestinationVertex(int destinationVertex) {
    this.destinationVertex = destinationVertex;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String toString() {
    return "(" + this.sourceVertex + ", " + this.destinationVertex + ", " + this.weight + ")";
  }

}
