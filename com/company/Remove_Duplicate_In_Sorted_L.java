package com.company;

public class Remove_Duplicate_In_Sorted_L {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void print(){
        ListNode current = head ;
        while (current!= null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println("null");
    }
    //Deleting duplicates in singly linked list
    public void deleteDuplicates() {
        while (head != null && head.next != null){
            if(head.data == head.next.data){
                head.next = head.next.next;
            }else {
                head = head.next;
            }
        }
    }
    public static void main(String[] args) {
        //Remove Duplicates from Sorted List
        Remove_Duplicate_In_Sorted_L r = new Remove_Duplicate_In_Sorted_L();
        r.head = new ListNode(1);
        ListNode g = new ListNode(1);
        ListNode h = new ListNode(3);

        r.head.next = g;
        g.next = h;

        r.print();
        r.deleteDuplicates();
    }
}
