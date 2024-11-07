import java.util.*;
public class ArrayDequePractice {
    public static void main(String a[]){
        ArrayDeque<String> ad=new ArrayDeque<>();
        // Add the Elements - add(), addFirst(),addLast(),offer(),offerFirst(),offerLast()
        // Retrival - peek(),peekFirst(),peekLast()
        // Deletion - poll(),pollFirst(),pollLast(), remove(),removeFirst(),removeLast() , clear( )

        ad.add("Banana");
        ad.addFirst("Cherry");
        ad.addLast("Apple");
        ad.offer("pear");
        ad.offerFirst("kiwi");
        ad.offerLast("Mango");

        System.out.println(ad);

        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());

        System.out.println(ad);
        System.out.println(ad.poll());
        System.out.println(ad);
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
        System.out.println(ad);
        System.out.println(ad.size());

    }
}
