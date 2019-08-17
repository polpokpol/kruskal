public class Edge implements Comparable<Edge> {

    private double weight;
    private Vertex startVertex;
    private Vertex targeVertex;

    public Edge(double weight, Vertex startVertex, Vertex targeVertex){
        setWeight(weight);
        setStartVertex(startVertex);
        setTargeVertex(targeVertex);
    }

    public double getWeight() {
        return weight;
    }

    public Vertex getTargeVertex() {
        return targeVertex;
    }

    public void setTargeVertex(Vertex targeVertex) {
        this.targeVertex = targeVertex;
    }

    public Vertex getStartVertex() {
        return startVertex;
    }

    public void setStartVertex(Vertex startVertex) {
        this.startVertex = startVertex;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        return Double.compare(getWeight(), o.getWeight());
    }


}