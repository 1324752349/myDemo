package com.mafengwo.demo.leetcode;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

/**
 * @author chenminrui
 * @date 2020-06-05 5:13 下午
 */
public class Sort {
    public static int  QuickSort(int[] arr,int left,int right){
       int key =arr[left];
       while(left < right){
           while (left<right && arr[right]>=key){
               right--;
           }
           arr[left]=arr[right];
           while (left<right && arr[left]<=key){
               left++;
           }
           arr[right]=arr[left];
       }
       arr[left]=key;
       return left;
    }

    public static void  sort(int[] arr ,int left ,int right){
        if(left<right){
            int i = QuickSort(arr, left, right);
            sort(arr,left,i);
            sort(arr,i+1,right);
        }
    }
    //swap方法：将数组中leftPos和rightPos上的两个数值进行交换
    public static void swap(int[] num,int leftPos,int rightPos) {
        int temp = num[leftPos];
        num[leftPos] = num[rightPos];
        num[rightPos] = temp;
    }

    public static void main(String[] args) {
        int[] a={0,2,5,4,3};
        sort(a,0,a.length-1);
        for (int i:a){
            System.out.println(i);
        }
    }
}
