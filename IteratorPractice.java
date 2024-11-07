import java.util.*;
public class IteratorPractice {
    public static void main(String a[]){
        //It is used in both Legacy class and new class -> Map does not use the iterator 
        // But we can use by using hm.keySet().iterator or hm.values().iterator()
        ArrayList<Integer> al=new ArrayList<>();
        al.add(72);
        al.add(25);
        al.add(17);
        al.add(99);

        Iterator<Integer> i=al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
