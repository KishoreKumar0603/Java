package Google_Hack;

import java.util.ArrayList;

class  Graph
{
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    Graph(int v)
    {
        for(int i =0;i<v;i++)
        {
            adjList.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u ,int v)
    {
        adjList.get(u).add(v);
        adjList.get(v).add(u);

    }
    public void printList()
    {
        for(int i=0;i<adjList.size();i++)
        {
            for(int j = 0;j<adjList.get(i).size();j++)
            {
                System.out.print(adjList.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
public class minimumBuses {
    public static void main(String[] args) {
        
        int[][] graph = {
            {0,1,0,0,1},
            {1,0,1,0,1},
            {0,1,0,1,0},
            {0,0,1,0,1},
            {1,1,0,1,0},
        };
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(1,2);
        g.addEdge(1,4);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.printList();
    }


}
