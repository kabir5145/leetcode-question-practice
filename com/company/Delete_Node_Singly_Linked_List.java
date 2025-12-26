package com.company;

public class Delete_Node_Singly_Linked_List {
    private ListNode head;

    static class ListNode {
        public int val;
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Printing the singly linked list
    public void printingLinkedList(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("Null");
    }

    //Deleting a node in the given singly linked list
        public void deleteNode(ListNode node , int val) {
            node.val = node.next.val;
            node.next = node.next.next;
        }

    public static void main(String[] args) {
        Delete_Node_Singly_Linked_List obj = new Delete_Node_Singly_Linked_List();
        obj.head = new ListNode(1);
        obj.head.next = new ListNode(2);
        obj.head.next.next = new ListNode(3);
        obj.head.next.next.next = new ListNode(4);
        obj.head.next.next.next.next = new ListNode(5);

        obj.printingLinkedList();

       //Deleting the node in the given singly linked list
        obj.deleteNode(obj.head ,2);
        obj.printingLinkedList();
    }
}
