package com.company;

public class Remover_Linked_List_Element {
    private ListNode head;

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next;
      }
    }
    public void printList() {
        ListNode current = head;
        while (current != null){
            System.out.print(current.val+"-->");
            current = current.next;
        }
        System.out.println("null");
    }

    //Removing element in the given linked list
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
    public static void main(String[] args) {
        //Remove Linked List Elements
        Remover_Linked_List_Element obj = new Remover_Linked_List_Element();
        obj.head = new ListNode(1);
        obj.head.next = new ListNode(2);
        obj.head.next.next = new ListNode(3);
        obj.head.next.next.next = new ListNode(4);


        obj.printList();

        obj.removeElements(obj.head, 4);
        obj.printList();
    }
}
