 import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.HashSet;
 
class graph_list {
int  vertex;
List<List<Integer>> adjList;  
 
graph_list(int vertex){
    this.vertex=vertex;
    adjList=new ArrayList<>(vertex);
    for(int i=0;i<vertex;i++){
        adjList.add(new ArrayList<>());
    }
 }

void addEdges(int source,int dest){
    adjList.get(source).add(dest);
    //adjList.get(dest).add(source); // Remove comment if graph is undirected
}
void bfs(int startVertex){
    //boolean visited[]=new boolean[vertex];
    Queue<Integer> q=new LinkedList<>();
    HashSet<Integer> hs=new HashSet<>();
    //visited[startVertex]=true;
    q.offer(startVertex);
    hs.add(startVertex);
    while(!q.isEmpty()){
        int curr=q.poll();
        System.out.print(curr+" ");
        // if(!hs.contains(curr)){
            
            //hs.add(curr);
        // }
        // System.out.print(curr+" ");
        // for(int i=0;i<adjList.get(curr).size();i++){
        //     int next=adjList.get(curr).get(i);
        //     if(!hs.contains(next)){
        //         hs.add(next);
        //         q.offer(next);
        //     }
        // }
        for(int neigh:adjList.get(curr)){
            
            if(!hs.contains(neigh)){
                // System.out.print(neigh+" ");
                hs.add(neigh);
                q.offer(neigh);
            }
        }
    }
}
// public void print(){
//     for(int i=0;i<vertex;i++){
//         System.out.print(i+"->");
//         for(int j=0;j<adjList.get(i).size();j++){
//             System.out.print(adjList.get(i).get(j)+" ");
//         }
//         System.out.println();
//     }
// }
public static void main(String[] args){
    graph_list g=new graph_list(5);   
    g.addEdges(0, 1);
    g.addEdges(0, 2);
    g.addEdges(1, 3);
    g.addEdges(1, 4);
    g.addEdges(2, 3);
    System.out.println("Graph is created");
    g.bfs(0);
    //g.print();
}
}

