package DSAlgo.Non_LinearDSA.Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListGraph {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> nested=new ArrayList<ArrayList<Integer>>();
        System.out.println("How many edges have on the graph");
        int edge=predator.nextInt();
        for (int i = 0; i < edge; i++) {
            nested.add(new ArrayList<Integer>());
        }
        addedEdge(nested, 1, 2);
        addedEdge(nested, 2, 3);
        addedEdge(nested, 2, 4);
        addedEdge(nested, 3, 4);
        addedEdge(nested, 5, 3);
        addedEdge(nested, 1, 3);
        addedEdge(nested, 1, 5);
        Monitoring(nested);
    }
    static void addedEdge(ArrayList<ArrayList<Integer>> adjm,int u,int v){
        adjm.get(u).add(v);
        adjm.get(v).add(u);
    }
    static void Monitoring(ArrayList<ArrayList<Integer>> matrix){
        for (int i=0;i<matrix.size();i++){
            System.out.println("List of vertices : ");
            for (int j=0;j<matrix.get(i).size();j++){
                System.out.print(" -> "+matrix.get(i).get(j));
            }
            System.out.println();
        }
    }

}
