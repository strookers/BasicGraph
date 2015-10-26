import java.util.List;

/**
 * basic graph operations on a non-weighted graph are defined in this interface
 * specification omitted when obvious
 */
public interface IFBasicGraph {
   //adds a vertex to the graph
   void addVertex(Vertex vertex);
   //remove a vertex from the graph
   void removeVertex(Vertex vertex);
   //checks if empty
   boolean isEmpty();
   //checks if vertex have edge
   boolean hasEdge(Vertex v1, Vertex v2);
   //adds an edge
   public void addEdge(Vertex v1, Vertex v2);
   //get a list of neighbors to vertex
   List<Vertex> getAdjacenciesTo(Vertex vertex);
   //print number of vertices
   int getNoOfVertices();
   //see if a vertex exist
   boolean containsVertex(Vertex v);
 }