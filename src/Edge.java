
public class Edge {

	private Vertex v1, v2;
	private int weight;

	public Edge(Vertex v1, Vertex v2)
	{
		this.v1 = v1;
		this.v2 = v2;
	}
	
	public Edge(Vertex first, Vertex second, int edgeWeight) {
		v1 = first;
		v2 = second;
		weight = edgeWeight;
	}

	public int getWeight() {
		return weight;
	}

	public Vertex getV1() {
		return v1;
	}

	public Vertex getv2() {
		return v2;
	}
}