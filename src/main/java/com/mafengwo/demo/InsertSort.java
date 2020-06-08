package com.mafengwo.demo;

/**
 * @author chenminrui
 * @date 2020-06-05 10:35 上午
 */
public class InsertSort {
    public static void sort(int[] a ,int start ,int end ){

        int tmp = a[start];
        int pre =start;
        int last= end;
        while(start<end){
            while(start<end && tmp <a[end]){
                end--;
            }
            a[pre]=a[end];
            while(start<end && tmp>a[start]){
                start++;
            }
            a[start]=a[pre];
        }
        a[pre]=tmp;
        sort(a,start,pre);
        sort(a,pre+1,end);
    }

    public static void main(String[] args) {
        int[] a={0,2,4,6,3};
        sort(a,0,a.length-1);

    }
}
