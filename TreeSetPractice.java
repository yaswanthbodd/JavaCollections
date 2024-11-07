import java.util.*;
public class TreeSetPractice {
    public static void main(String args[]){
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(34);
        ts.add(2);
        ts.add(25);
        ts.add(99);
        ts.add(2);
        ts.add(3);
        System.out.println(ts);

        //remove
        System.out.println(ts.remove(3));

        //retrieval
        for(Integer val:ts){
            System.out.println(val);
        }

        System.out.println(ts.contains(34));

        System.out.println(ts.first());
        System.out.println(ts.last());
        
        //remove
        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());
        System.out.println(ts);

        ts.add(2); 
        ts.add(23);
        ts.add(45);
        ts.add(77);
        ts.add(64);

        System.out.println(ts);
        System.out.println(ts.subSet(25, 45));
        System.out.println(ts.descendingSet());
    }
}
