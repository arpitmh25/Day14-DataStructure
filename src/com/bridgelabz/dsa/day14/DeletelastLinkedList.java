package com.bridgelabz.dsa.day14;

public class DeletelastLinkedList extends DeleteFirstLinedList {
    //Use case 6 deleting last node

    static void popLast() {
        if (head == null || head.next == null) {
            return;
        }
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;

    }

    public static void main(String[] args) {
        DeleteFirstLinedList l6 = new DeleteFirstLinedList();
        appendList(56);
        appendList(70);
        insertBetween(56, 30);
        System.out.println("List before deleting");
        printList();
        System.out.println("List after deleting");
        popLast();
        printList();
    }

}
