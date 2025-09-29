
import java.util.PriorityQueue;

//PriorityQueue is child class of Queue Interface
//ProrityQueue is class which is located in java.util package
//priorityQueue is allows duplicate elements
//prorityQueue doesnt allows null values
//priority queue elements ar stored in soretd ascending oder 
//priority queue is not synchronized
//priority queue is introduced in java 1.5 vresion

class PriorityQueueExample{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(); 
        pq.add(10);
        pq.add(20);
        pq.add(30); 
        pq.add(40);
        pq.add(20); // Duplicate element
        //pq.add(null); // doesnt allows Null value 

        System.out.println(pq);
    }
}