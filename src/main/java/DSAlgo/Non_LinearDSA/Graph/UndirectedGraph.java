package DSAlgo.Non_LinearDSA.Graph;

import java.util.ArrayList;

public class UndirectedGraph {
    public static void main(String[] args){
        int n=3 ,m=3;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        adj.get(n).add(m);
        adj.get(m).add(n);
        for (int i=0;i<n;i++){
            for (int j=0;j<adj.get(i).size();j++){
                System.out.print(" -> "+adj.get(i).add(j));
            }
            System.out.println();
        }
    }
}
