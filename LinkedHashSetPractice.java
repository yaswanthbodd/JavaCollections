import java.util.*;
public class LinkedHashSetPractice {
    public static void main(String a[]){
        //LinkedHashSet internal Structure implements the LinkedHashMap . link of nodes(key,value).
        // It store key as given add(element). value is stored dummy object ex: new Object()
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(5);
        lhs.add(1);
        lhs.add(5);
        lhs.add(10);
        lhs.add(9);
        lhs.add(null);
        System.out.println(lhs);

        //remove
        System.out.println(lhs.remove(1));
        System.out.println(lhs); 

        //verify
        System.out.println(lhs.contains(5));

        //Retrivel
        for(Integer key:lhs){
            System.out.println(key);
        }
    }
}
