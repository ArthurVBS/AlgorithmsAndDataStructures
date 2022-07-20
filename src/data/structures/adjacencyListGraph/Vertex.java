package data.structures.adjacencyListGraph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

  private int index;

  private String value;

  private List<Edge> adjacencyLists;

  public Vertex(int index, String value) {
    this.index = index;
    this.value = value;
    this.adjacencyLists = new ArrayList<Edge>();
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public List<Edge> getAdjacencyLists() {
    return adjacencyLists;
  }

  public void setAdjacencyLists(List<Edge> adjacencyLists) {
    this.adjacencyLists = adjacencyLists;
  }

  public String toString() {
    return "{" + this.index + ", " + this.value + " - " + this.adjacencyLists.toString() + "}";
  }
}
