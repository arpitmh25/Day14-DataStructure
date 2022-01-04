package com.bridgelabz.dsa.day14;

public class SearchNodeLinkedList {
    public ListNode head;

    public static class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        public static void main(String[] args) {
            SearchNodeLinkedList lists = new SearchNodeLinkedList();

            lists.head = new ListNode(50);
            ListNode secondNode = new ListNode(70);
            ListNode thirdNode = new ListNode(30);
            lists.head.next = secondNode;
            secondNode.next = thirdNode;
            System.out.println("before roving first node in data.");
            lists.print();
            lists.print();
            search(lists, 30);
        }

        private static void search(SearchNodeLinkedList lists, int data) {
            ListNode currentNode = lists.head, previousNode = null;

            while (currentNode != null && currentNode.data != data) {

                currentNode = currentNode.next;
            }
            System.out.println("node is found with data 30 :: " + currentNode.data);
        }

    }

    private void pop(ListNode node, SearchNodeLinkedList lists) {
        ListNode courser = head;
        System.out.println("after removing head node from link list.");

    }

    private void print() {
        ListNode pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + "->");
            pointer = pointer.next;
        }
        System.out.println("null");
    }
}