package com.hsc.algorithm.stack;


public class StackPractice {
    public static void sort(int arr[]){
        //1.构建大顶堆
        for (int i = arr.length/2-1; i >= 0; i--) {
            //从第一个非叶子节点开始调整结构
            adjustHeap(arr,i,arr.length);
        }
        //2.排序
        for (int i = arr.length-1; i > 0; i--) {
            swap(arr,0,i);//将堆顶元素与末尾元素进行交换
            adjustHeap(arr,0,i);//重新对堆进行调整
        }

    }
    /**
     * 大顶堆：每个节点的值都大于等于其左右孩子节点的值
     * 小顶堆：每个节点的值都小于等于其左右孩子节点的值
     * 思路：将待排元素构建成大顶堆，此时堆顶的元素就是最大值，将其与末尾元素进行交换，此时末尾元素就是最大值，然后将
     *      剩余的n-1个元素重新构建大顶堆，重复此操作，便能得到一个有序序列了。
     */
    public static void adjustHeap(int arr[],int i,int length){
        for(int k=i*2; k<length; k=k*2){//从i节点的左子节点开始，也就是2i处开始
            if(k+1<length && arr[k]<arr[k+1]){//如果左子节点小于右子节点，k指向右子节点
                k++;
            }
            if(arr[k]>arr[i]){//如果子节点大于父节点，将子节点赋值给父节点
                swap(arr,i,k);
                i=k;
            }else{
                break;
            }
        }
    }
    public static void swap(int []arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }



    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,16,7,8,9,111,121,12,13,14,15,16,17};;
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
