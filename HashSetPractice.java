import java.util.*;
public class HashSetPractice {
    public static void main(String args[]){
        // HashSet internal implmentation HashMap -> array of nodes(key,value)
        HashSet<Integer> hs=new HashSet<>();
        //Addition - add(), addAll()
        //remove - remove(), removeAll()
        //verify - contains()
        hs.add(5);
        hs.add(19);
        hs.add(10);
        hs.add(77);
        hs.add(96);
        hs.add(5); //duplicate elements
        hs.add(null);

        System.out.println(hs);

        //Remove
        hs.remove(19);
        System.out.println(hs);

        //Verify
        System.out.println(hs.contains(96));

        //Retrivel
        for(Integer ele:hs){
            System.out.print(ele+" ");
        }
        System.out.println(hs.isEmpty());
    }
}
