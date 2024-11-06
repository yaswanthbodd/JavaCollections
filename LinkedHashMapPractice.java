import java.util.*;
public class LinkedHashMapPractice {
    public static void main(String args[]){
        Map<Integer,String> m=new LinkedHashMap<>();
        m.put(577,"Yaswanth");
        m.put(578,"Pawan");
        m.put(568,"Hemanth");
        m.put(596,"Gopi");

        Set<Integer> keys=m.keySet();
        for(Integer key:keys){
            System.out.print(key+" ");
        }
        System.out.println();

        Collection<String> values=m.values();
        for(String value:values){
            System.out.print(value+" ");
        }
        System.out.println();

        m.remove(578);
        System.out.println(m);

        m.putIfAbsent(578,"Pawan");

        System.out.println(m.containsKey(577));

        for(Integer key:keys){
            System.out.println(key+" "+m.get(key));
        }
        System.out.println(m);
    }
}
