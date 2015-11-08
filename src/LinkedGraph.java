import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

public class LinkedGraph implements IFBasicGraph {

	private List<Vertex> vertices;
	private int noVer;
	private int noOfEdges;
	private List<LinkedList<Vertex>> adjList;

	public LinkedGraph(int noVer) {
		init(noVer);
		noOfEdges = 0;

	}

	private void init(int noVer) {
		vertices = new ArrayList<Vertex>(noVer);
		this.noVer = noVer; // - 1;
		adjList = new ArrayList<LinkedList<Vertex>>(noVer);
		for (LinkedList<Vertex> l : adjList)
			l = new LinkedList<Vertex>();

	}

	@Override
	public void addVertex(Vertex vertex) {
		// TODO Auto-generated method stub
		vertices.add(vertex);
	}

	@Override
	public void removeVertex(Vertex vertex) {
		// TODO Auto-generated method stub
		for (int i = 0; i < vertices.size(); i++) {
			if (vertices.get(i).equals(vertex)) {
				System.out.println(vertices.get(i).getName() + " has been removed");
				vertices.remove(i);
			}
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (vertices.isEmpty());
	}

	@Override
	public boolean hasEdge(Vertex v1, Vertex v2) {
		// TODO Auto-generated method stub
		return false;
	}

	public void addEdge(Vertex v1, Vertex v2)
	{
		for(int i = 0; i < vertices.size(); i++)
		{
			if(vertices.get(i).equals(v1))
			{
				//adjList.get(i).add(v2);
				System.out.println("Edge tilføjet: " + v1.getName() + " -> " + v2.getName());
			}
			//System.out.println(adjList.get(1).get(1).getName());
		}
	}
	@Override
	public List<Vertex> getAdjacenciesTo(Vertex vertex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNoOfVertices() {
		// TODO Auto-generated method stub
		return vertices.size();
	}

	@Override
	public boolean containsVertex(Vertex v) {
		// TODO Auto-generated method stub
		boolean status = false;
		for (int i = 0; i < vertices.size(); i++) {
			if (vertices.get(i).equals(v)) {
				status = true;
			}
		}
		return status;
	}
}