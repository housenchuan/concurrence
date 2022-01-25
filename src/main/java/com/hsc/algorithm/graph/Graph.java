package com.hsc.algorithm.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
    private List<Integer> list;
    private int[][] edges;
    private int edgesNum;
    private boolean isVisited[];

    public Graph(int n){
        this.edges = new int[n][n];
        this.list = new ArrayList<>(n);
        this.edgesNum = 0;
        this.isVisited = new boolean[n];
    }

    public int getFirstNeighbor(int index){
        for (int i = 0; i < list.size(); i++) {
            if(this.edges[index][i]>0){
                return i;
            }
        }
        return -1;
    }
    public int getNextNeighbor(int v1,int v2){
        for (int i = v2+1; i < list.size(); i++) {
            if(this.edges[v1][i]>0){
                return i;
            }
        }
        return -1;
    }
    public void depthFirstSearch(int i){
        System.out.println(this.list.get(i));
        isVisited[i]=true;
        int w = getFirstNeighbor(i);
        while (w!=-1){
            if(!isVisited[w]){
                depthFirstSearch(w);
            }
            w=getNextNeighbor(i,w);
        }
    }

    public void dfs(){
        for (int i = 0; i < this.list.size(); i++) {
            if(!isVisited[i]){
                depthFirstSearch(i);
            }
        }
    }

    public void broadFirstSearch(int i){
        int u,w;
        LinkedList queue = new LinkedList<>();
        System.out.println(this.list.get(i));
        isVisited[i]=true;
        queue.addLast(i);
        while (!queue.isEmpty()){
            u = (Integer)queue.removeFirst();
            w = getFirstNeighbor(u);
            while (w!=-1){
                if(!isVisited[w]){
                    System.out.println(list.get(w));
                    isVisited[w]=true;
                    queue.addLast(w);
                }
                w=getNextNeighbor(u,w);
            }
        }
    }

    public void bfs(){
        for (int i = 0; i < this.list.size(); i++) {
            if(!isVisited[i]){
                broadFirstSearch(i);
            }
        }
    }


}
