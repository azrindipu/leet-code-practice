package graph;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Graph graph = new Graph(5);
        graph.generateGraph();
        graph.printAdj();

        DfsHelper dfsHelper = new DfsHelper(graph);
        List<Integer> path = dfsHelper.runDfs();
        System.out.println(path.toString());
    }
}
