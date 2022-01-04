package com.bridgelabz.dsa.day14;

public class AddLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty ");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        AddLinkedList list = new AddLinkedList();
        list.addFirst(70); // add 70 and create head at 70
        list.printList();
        list.addFirst(30); //add 30 and move head at 30
        list.printList();
        list.addFirst(56);// add 56 and move head at 56
        list.printList();
    }
}
