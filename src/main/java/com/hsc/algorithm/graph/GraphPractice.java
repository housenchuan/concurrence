package com.hsc.algorithm.graph;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GraphPractice {
    private List<Integer> list;
    private int edges[][];
    private boolean isVisited[];

    public GraphPractice(int n){
        list = new ArrayList<>(n);
        edges = new int[n][n];
        isVisited = new boolean[n];
    }

    public int getFirstNeighbor(int i){
        for (int j = 0; j < list.size(); j++) {
            if(edges[i][j]>0){
                return j;
            }
        }
        return -1;
    }

    public int getNextNeighbor(int v1,int v2){
        for (int i = v2+1; i < list.size(); i++) {
            if(edges[v1][i]>0){
                return i;
            }
        }
        return -1;
    }

    public void depthFirstSearch(int i){
        System.out.println(list.get(i));
        isVisited[i]=true;
        int w = getFirstNeighbor(i);
        while (w!=-1){
            if(!isVisited[w]) {
                depthFirstSearch(i);
            }else{
                w=getNextNeighbor(i,w);
            }
        }
    }

    public void dfs(){
        for (int i = 0; i < list.size(); i++) {
            if(!isVisited[i]){
                depthFirstSearch(i);
            }
        }
    }

    public void broadFirstSearch(int i){
        System.out.println(list.get(i));
        isVisited[i]=true;
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(i);
        while(!queue.isEmpty()){
            int u = queue.removeFirst();
            int w = getFirstNeighbor(u);
            while(w!=-1){
                if(!isVisited[w]){
                    System.out.println(list.get(w));
                    isVisited[w] = true;
                    queue.addLast(w);
                }
                w=getNextNeighbor(u,w);
            }
        }
    }

    public void bfs(){
        for(int i = 0; i < list.size(); i++){
            if(!isVisited[i]){
                broadFirstSearch(i);
            }
        }
    }

    /**
     * 拓扑排序
     */
    public  void topSort(int []source){
        List<Integer> result = new ArrayList<>();
        boolean flag = true;
        while (flag){
            for (int i = 0; i < source.length; i++) {
                if(source[i] == 1){
                    return ;
                }
            }
        }
    }

    /**
     * 查找入度
     */
    public  int [] getSource(){
        int result[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(edges[i][j]==1){
                    result[j]+=1;
                }
            }
        }
        return result;
    }
}