 import java.util.List;
import java.util.ArrayList;
 
class GraphList {
int  vertex;
List<List<Integer>> adjList;  
 
GraphList(int vertex){
    this.vertex=vertex;
    adjList=new ArrayList<>(vertex);
    for(int i=0;i<vertex;i++){
        adjList.add(new ArrayList<>());
    }
 }

void addEdges(int source,int dest){
    adjList.get(source).add(dest);
    adjList.get(dest).add(source); // Remove comment if graph is undirected
}
public void print(){
    for(int i=0;i<vertex;i++){
        System.out.print(i+"->");
        for(int j=0;j<adjList.get(i).size();j++){
            System.out.print(adjList.get(i).get(j)+" ");
        }
        System.out.println();
    }
}
public static void main(String[] args){
    GraphList g=new GraphList(5);   
    g.addEdges(0, 1);
    g.addEdges(0, 2);
    g.addEdges(1, 3);
    g.addEdges(1, 4);
    g.addEdges(3, 4);
    System.out.println("Graph is created");
    g.print();
}
}

