package com.company;

public class Find_Middle_Singly_Linked_List {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Printing the singly linked list
    public void printList() {
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    //Finding middle node in singly linked list
    public void findMiddle() {
        if (head == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
    public static void main(String[] args) {
        //Middle of the Linked List
        Find_Middle_Singly_Linked_List f =  new Find_Middle_Singly_Linked_List();
        f.head = new ListNode(1);
        f.head.next = new ListNode(2);
        f.head.next.next = new ListNode(3);
        f.head.next.next.next = new ListNode(4);
        f.head.next.next.next.next = new ListNode(5);


        //Finding the middle node in singly linked list
        f.printList();
        f.findMiddle();
    }
}
