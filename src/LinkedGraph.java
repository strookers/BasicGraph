import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedGraph implements IFBasicGraph {
	ArrayList<LinkedList<Vertex>> vertices = new ArrayList<>();
	LinkedList<Vertex> vertexSet = new LinkedList<>();

	public LinkedGraph() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addVertex(Vertex vertex) {
		// TODO Auto-generated method stub
		vertices.add(vertexSet.add(1, vertex));
	}

	@Override
	public void removeVertex(Vertex vertex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasEdge(Vertex v1, Vertex v2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Vertex> getAdjacenciesTo(Vertex vertex) {
		// TODO Auto-generated method stub
		return null;
	}

}
