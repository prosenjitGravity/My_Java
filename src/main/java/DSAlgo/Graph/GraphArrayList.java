package DSAlgo.Graph;

import java.util.ArrayList;

public class GraphArrayList {
    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++) {
            arrayLists.add(new ArrayList<Integer>());
        }
        addEdge(arrayLists, 0, 1);
        addEdge(arrayLists, 0, 4);
        addEdge(arrayLists, 1, 2);
        addEdge(arrayLists, 1, 3);
        addEdge(arrayLists, 1, 4);
        addEdge(arrayLists, 2, 3);
        addEdge(arrayLists, 3, 4);
        MonitoringGraph(arrayLists);

    }

    static void addEdge(ArrayList<ArrayList<Integer>> adJoint, int u, int v) {
        adJoint.get(u).add(v);
        adJoint.get(v).add(u);
    }

    static void MonitoringGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Adjacency list of vertex is  : " + i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }
}
