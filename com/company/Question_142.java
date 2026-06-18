package com.company;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class Question_142 {
    public Node detectCycle(Node head) {
        /*
        Time : O(n)
        Space : O(1)
         */
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                Node temp = head;

                while(temp != slow){
                    temp = temp.next;
                    slow = slow.next;
                }
                return temp;
            }
        }
        return null;
    }
    public static void main(String[] args) {
//        Linked List Cycle II
        Question_142 q = new Question_142();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        n4.next = n3;

        System.out.println(q.detectCycle(n1));
    }
}
