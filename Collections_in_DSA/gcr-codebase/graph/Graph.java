class Graph {
 int vertex;
 int[][] matrix;
 
   Graph(int vertex){
    this.vertex=vertex;
   matrix=new int[vertex][vertex];
 }   
 void addEdge(int source,int dest){
    matrix[source][dest]=1;
    //matrix[dest][source]=1; Remove comment if graph is undirected
 }

 public void print(){
    for(int i=0;i<vertex;i++){
        for(int j=0;j<vertex;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
 }
 public static void main(String[] args){
    Graph g=new Graph(5);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 3);
    g.addEdge(1, 4);
    g.addEdge(3, 4);
    System.out.println("Graph is created");
    g.print();
    }
 }

