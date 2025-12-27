package com.company;

public class Remove_Nth_Node_From_End_SLL {
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
    public void print(){
        ListNode cur = head;
        while(cur != null){
            System.out.print(cur.data + "-->");
            cur = cur.next;
        }
        System.out.println("Null");
    }

    //Finding the length of singly linked list
    public void length(){
        ListNode cur = head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        System.out.println("The length of singly linked list is : "+count);
    }
    //Remove Nth Node from End of List
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast n+1 steps
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete node
        slow.next = slow.next.next;

        return dummy.next;
    }
    public static void main(String[] args) {
        //Remove Nth Node From End of List
        Remove_Nth_Node_From_End_SLL obj = new Remove_Nth_Node_From_End_SLL();
        obj.head = new ListNode(1);
        obj.head.next = new ListNode(2);
        obj.head.next.next = new ListNode(3);
        obj.head.next.next.next = new ListNode(4);
        obj.head.next.next.next.next = new ListNode(5);

        obj.print();
        obj.length();

        obj.removeNthFromEnd(obj.head, 2);
        obj.print();
    }
}
