package com.kamaldwip.coding.queues.linkedListImpl;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListQueue {

    private LinkedList<Employee> queue;

    public LinkedListQueue() {
        queue = new LinkedList<Employee>();
    }

    public void enQueue(Employee employee){
        queue.addLast(employee);
    }

    public Employee deQueue(){
        return queue.removeFirst();
    }

    public Employee peek(){
        return queue.peekFirst();
    }

    public void printQueue(){
        ListIterator iterator = queue.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
