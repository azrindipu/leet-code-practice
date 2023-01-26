package graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    int numberOfNode;
    List[] adj;
    public Graph(int numberOfNode){
        this.numberOfNode = numberOfNode;
        adj = new List[numberOfNode];
        for(int i=0; i<numberOfNode; i++){
            adj[i] = new ArrayList();
        }
    }

    public void generateGraph(){
        this.add(0,1);
        this.add(1,0);
        this.add(1,2);
        this.add(1,3);
        this.add(2,1);
        this.add(2,4);
        this.add(3,1);
        this.add(3,4);
        this.add(4,2);
        this.add(4,3);
    }

    public void add(int src, int dest){
        adj[src].add(dest);
    }

    public void printAdj(){
        for(int i=0; i<numberOfNode; i++){
            System.out.println("Node ["+i+"]: "+adj[i].toString());
        }
    }
}
