/**
 * Xander Krause
 */

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class GraphTester
{
    public static void main(String[] args)
    {
        System.out.println("This is the graph tester");
        Vertex v1=new Vertex("A");
        Vertex v2=new Vertex("B");
        Vertex v3=new Vertex("C");
        Set<Vertex> nodes=new HashSet<Vertex>();
        nodes.add(v1);
        nodes.add(v2);
        nodes.add(v3);

        Edge e1=new Edge(v1, v2, 3);
        Edge e2=new Edge(v2, v3, 6);
        Set<Edge> edges=new HashSet<Edge>();
        edges.add(e1);
        edges.add(e2);

        System.out.println(Vertex (v).outNeighbors);

        Graph g=new MyGraph(nodes, edges);
        Collection<Vertex> r=g.reachableVertices(v1);
    }
}