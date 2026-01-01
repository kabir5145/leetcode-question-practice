package com.company;

public class Remove_Duplicate_II {
    private ListNode head;

    static class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    //Printing the listNode
    public void print(){
        ListNode cur = head;
        while (cur != null){
            System.out.print(cur.val+"-->");
            cur = cur.next;
        }
        System.out.println("Null");
    }
     public ListNode deleteDuplicates(ListNode head) {
         ListNode dummy = new ListNode(0);
         dummy.next = head;

         ListNode prev = dummy;

         while (head != null) {
             if (head.next != null && head.val == head.next.val) {
                 int val = head.val;
                 while (head != null && head.val == val) {
                     head = head.next;
                 }
                 prev.next = head;
             } else {
                 prev = prev.next;
                 head = head.next;
             }
         }
         return dummy.next;
    }
    public static void main(String[] args) {
        Remove_Duplicate_II r = new Remove_Duplicate_II();
        r.head = new ListNode(1);
        r.head.next = new ListNode(2);
        r.head.next.next = new ListNode(2);
        r.head.next.next.next = new ListNode(4);
        r.head.next.next.next.next = new ListNode(4);
        r.head.next.next.next.next.next = new ListNode(3);

        r.print();
        r.deleteDuplicates(r.head);
        r.print();
    }
}
