package graph;

import java.util.ArrayList;
import java.util.List;

public class DfsHelper {
    private Graph graph;
    boolean[] visited;
    List<Integer> path;
    public DfsHelper(Graph graph){
        this.graph = graph;
        visited = new boolean[graph.numberOfNode];
        path = new ArrayList<>();
    }

    public List<Integer> runDfs(){
        for(int i=0; i<graph.numberOfNode; i++){
            if(!visited[i]){
                dfs(i);
            }
        }
        return path;
    }

    public void dfs(int src){
        visited[src]=true;
        path.add(src);
        List<Integer> adjNodes = graph.adj[src];
        for(Integer adjNode: adjNodes){
            if(!visited[adjNode]){
                dfs(adjNode);
            }
        }
    }
}
