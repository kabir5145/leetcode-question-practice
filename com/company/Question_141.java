package com.company;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
public class Question_141 {
    public static boolean hasCycle(ListNode head) {
        /*
        Time  : O(n)
        Space : O(1)
         */
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
//        Linked List Cycle
        // Create nodes
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        // Link nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Create cycle
        n4.next = n2;

        System.out.println(hasCycle(n1));
    }
}
