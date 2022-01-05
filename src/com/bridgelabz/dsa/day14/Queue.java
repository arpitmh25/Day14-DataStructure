package com.bridgelabz.dsa.day14;

import java.util.LinkedList;

public class Queue {

    LinkedList<Integer> queue = new LinkedList<Integer>();

    public void enqueue(int value) {
        queue.addLast(value);
    }

    public void dequeue() {
        if (queue.size() < 1)
            System.out.println(" Queue is empty!");
        else
            queue.remove();
    }

    public void displayQueue() {
        for (Integer integer : queue) {
            System.out.print(" " + integer);
        }
        System.out.println();
    }

}

class QueueLinkedList {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("Queue by Link List");
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.displayQueue();

        queue.dequeue();
        queue.displayQueue();
        System.out.println(" Operations done ");
    }
}