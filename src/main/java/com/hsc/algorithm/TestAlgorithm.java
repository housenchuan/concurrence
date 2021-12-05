package com.hsc.algorithm;

/**
 * 算法练习
 */
public class TestAlgorithm {

    public static void quickSort(int arrs[],int start, int end){
        int temp = arrs[start];
        int s = start;
        int e = end;
        while (s<e){
            while (s<e && arrs[e]>temp){
                e--;
            }
            if(s<e){
                arrs[s] = arrs[e];
                s++;
            }
            while (s<e && arrs[s]<temp){
                s++;
            }
            if(s<e){
                arrs[e] = arrs[s];
                e--;
            }
        }
        arrs[s] = temp;
        quickSort(arrs,start,s-1);
        quickSort(arrs,s+1,end);
    }
    public static int maxProfit(int arrs[]){
        int min = arrs[0];
        int max = 0;
        for (int i = 1; i < arrs.length; i++) {
            max = Math.max(arrs[i]-min,max);
            min = Math.min(min,arrs[i]);
        }
        return max;
    }
    public static int  search(int arrs[],int target){
        int i = 0;
        int j = arrs.length-1;
        while (i<=j){
            int mid = (j-i)/2+i;
            if(arrs[mid]==target){
                return mid;
            }else if(target>arrs[mid]){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return -1;
    }
    public static Node reserve(Node head){
        Node pre = null;
        Node cur = head;
        while (cur != null){
            Node temp = head.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public static String addStrings(String num1,String num2){
        StringBuilder sb = new StringBuilder("");
        int carry = 0;
        int i = num1.length()-1;
        int j = num2.length()-1;
        while (i>=0 || j>=0 || carry != 0){
            int n1 = i>=0 ? num1.charAt(i)-'0' : 0;
            int n2 = j>=0 ? num2.charAt(i)-'0' : 0;
            int temp = n1+n2+carry;
            carry = temp/10;
            sb.append(temp%10);
        }
        return sb.reverse().toString();
    }

    public static void quickSort1(int arrs[],int start,int end){
        if(start>=end)return;
        int temp = arrs[start];
        int l = start;
        int r = end;
        while (l<r){
            while (l<r && arrs[r] > temp){
                r--;
            }
            if(l<r){
                arrs[l] = arrs[r];
                l++;
            }
            while (l<r && arrs[l] < temp){
                l++;
            }
            if(l<r){
                arrs[r] = arrs[l];
                r--;
            }
        }
        arrs[l] = temp;
        quickSort1(arrs,start,l-1);
        quickSort1(arrs,l+1,end);
    }

    public static int maxProfit1(int arrs[]){
        int maxProfit = 0;
        int min = arrs[0];
        for (int i = 1; i < arrs.length; i++) {
            maxProfit = Math.max(maxProfit,arrs[i]-min);
            min = Math.min(arrs[i],min);
        }
        return maxProfit;
    }

    public int search1(int arrs[],int target){
        for (int left = 0,right = arrs.length-1; left <=right ; ) {
            int mid = (left+right)/2 + left;
            if(target == arrs[mid]){
                return mid;
            }else if(target > arrs[left]){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }

   public Node reserve1(Node head){
        Node pre = null;
        Node cur = head;
        while (cur != null){
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
   }


    /**
     *     8 5 4 3
     * +   2 4 5 6
     * = 1 0 9 9 9
     */
   public String addString(String num1,String num2){
        StringBuilder sb = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int temp = 0;
        while (i>=0||j>=0||temp!=0){
            int n1 = i>=0?num1.charAt(i)-'0':'0';
            int n2 = j>=0?num2.charAt(j)-'0':'0';
            int result = n1+n2+temp;
            temp = result/10;
            sb.append(result%10);
            j--;
            i--;
        }
        return sb.reverse().toString();
   }
    public static void main(String[] args) {

    }
}
