package com.company;


public class Odd_Even_Linked_List {
    private ListNode head;

    static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) {
            this.data = data;
        }
    }

    public void printList(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        Odd_Even_Linked_List list  = new Odd_Even_Linked_List();
        list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(3);
        list.head.next.next.next = new ListNode(4);

        list.printList();  // before

        list.head = list.oddEvenList(list.head);

        list.printList();  // after
    }
}

