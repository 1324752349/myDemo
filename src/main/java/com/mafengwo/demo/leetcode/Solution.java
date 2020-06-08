package com.mafengwo.demo.leetcode;

/**
 * @author chenminrui
 * @date 2020-06-05 4:07 下午
 */
public class Solution {
    public static void main(String[] args) {
        /*链表1*/
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        System.out.println(printK(listNode1,3).value);
        System.out.println(printListNode(listNode1));
        System.out.println(printListNode(revorseListNode(listNode1)));

        int[] a ={1};
        int i = binarySearch(a, 1);
        System.out.println(i);

    }
    public static String printListNode(ListNode head) {
        StringBuilder stringBuilder = new StringBuilder();
        while (head != null) {
            stringBuilder.append(head.value);
            head = head.next;
        }
        return stringBuilder.toString();
    }


    public static ListNode mergeListNode(ListNode list1,ListNode list2){
        ListNode list = null;
        if(list1==null || list2 ==null){
            return list;
        }
        ListNode head =new ListNode(0);
        list=head;
        while(list1!=null && list2!=null){
            if(list1.value>list2.value){
                list.next=list2;
                list2=list2.next;
            }else {
                list.next=list1;
                list1=list1.next;
            }
            list=list.next;
        }
        list.next=(list1==null?list2:list1);
        return head.next;
    }
    public static ListNode revorseListNode(ListNode listNode){
        ListNode pre=null;
        ListNode next =null;
        if(listNode==null)
            return null;
        while (listNode!=null){
            next =listNode.next;
            listNode.next =pre;
            pre=listNode ;
            listNode =next;
        }
        return pre;

//        if(head ==null)
//            return null;
//        ListNode pre=null;
//        ListNode next =null;
//        while(head !=null){
//            next= head.next;
//            head.next =pre;
//            pre = head;
//            head =next;
//        }
//        return pre;
    }

    public static ListNode printK(ListNode list,int k){
        int a =k;
        if(list==null)
            return list;
        ListNode fir=list;
        ListNode sed=list;
        int count=0;
        while (k!=1) {
           if(fir.next!=null){
               fir=fir.next;
               k--;
           }else{
               return null;
           }
        }
        while(fir.next!=null){
            fir=fir.next;
            sed= sed.next;
        }

        return sed;
    }

    public static int binarySearch(int[] a ,int target){
        int left=0;
        int right=a.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(target>a[mid]){
                left=mid+1;
            }else if(target <a[mid]){
                right =mid-1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
