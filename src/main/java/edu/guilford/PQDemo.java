package edu.guilford;

import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;

public class PQDemo 
{
    public static void main( String[] args )
    {
        //build a priority queue for the FullNames objects
        //it will be sorted according to the natural ordering of the FullNames
        //as determined by the compareTo method in the FullName class and the sortOrder attribute

        PriorityQueue<FullName> pq = new PriorityQueue<FullName>();
        //ass 20 fullname object to the pq
        
        for (int i=0; i < 20; i++){
            pq.add(new FullName());
        }
        //print out the priority queue
        System.out.println("Priority queue: "+ pq);

        //now use poll to print out the priority queue in order
        System.out.println("The priority queue in order is: ");
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        //let's build a stack to show the difference
        //between  a priority queue and a stack
        Stack<FullName> s = new Stack<FullName>();
        //add 20 FullName objects to the stack
        for(int i = 0; i< 20; i++){
            s.push(new FullName());
        }
        //Pop each element of the stack and print it
        System.out.println("The stack in order is:");
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println("Is the stack empty? "+ s.isEmpty());
        System.out.println("Is the priority queue empty? "+ pq.isEmpty());

        //instantiate a treeSet of FullNames objects
        TreeSet<FullName> nameSet = new TreeSet<FullName>();

        //add 20 fullnames to the stack
        for(int i = 0; i< 20; i++){
            s.add(new FullName());
        }
        System.out.println("Here's the new stack of FullNames: ");
        System.out.println(s);

        //add the element of the stack to the treeSet
        while (!s.isEmpty()){
            //popping an element off the stack returns that element and removes it from the stack

            nameSet.add(s.pop());
        }
        //print out the treeSet
        System.out.println("Here's the treeSet of FullNames: ");
        System.out.println(nameSet);
        System.out.println("The size of the treeSet is: "+ nameSet.size());

    }
}
