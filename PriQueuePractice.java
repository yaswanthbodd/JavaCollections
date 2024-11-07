import java.util.*;
public class PriQueuePractice {
    public static void main(String args[]){
        // Priority Queue
        Queue<Integer> pq=new PriorityQueue<>();
        //Add the Elements by using two methods -> offer(),add(). Both are same methods
        pq.add(2);
        pq.offer(4);
        pq.add(6);
        pq.offer(8);

        System.out.println(pq);

        //Retrival - peek()
        System.out.println(pq.peek());

        //Deletion of elements - poll()-> It remove head value otherwise if queue is empty return null.
        // remove() -> It also remove head value But if queue is empty it rise an Exception

        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.remove());
        System.out.println(pq);

        System.out.println(pq.contains(1));

        Queue<Integer> pq1=new PriorityQueue<>();
        pq1.add(2);
        pq1.add(1);
        pq1.add(9);
        pq1.add(5);
        pq1.add(4);

        System.out.println(pq1);

        while(!pq1.isEmpty()){
            System.out.println(pq1.poll());
        }

        Queue<Integer> pq2=new PriorityQueue<>(Comparator.reverseOrder());
        pq2.add(2);
        pq2.add(1);;
        pq2.add(5);
        pq2.add(4);

        System.out.println(pq2);
        while(!pq2.isEmpty()){
            System.out.print(pq2.poll()+" ");
        }
    }
}
