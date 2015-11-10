import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedGraph implements IFBasicGraph {
	LinkedList<Vertex> vertexSet = new LinkedList<>();
	ArrayList<Vertex> vertices = new ArrayList<>();

	public MyLinkedGraph() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addVertex(Vertex vertex) {
		// TODO Auto-generated method stub
		vertices.add(vertex);
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

	public int getNoOfVertices()
	{
		return vertices.size();
	}
	
	public boolean containsVertex(Vertex v)
	{
		boolean status = false;
		for(int i = 0; i < vertices.size(); i++)
		{
			if(vertices.get(i).equals(v))
			{
				status = true;
			}
		}
		return status;
		
	}

	@Override
	public void addEdge(Vertex v1, Vertex v2) {
		// TODO Auto-generated method stub
		
	}
}
