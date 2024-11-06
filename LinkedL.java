import java.util.*;
public class LinkedL {
    public static void main(String a[]){
        LinkedList<String> l1=new LinkedList<>();
        l1.add("y1"); 
        l1.add("y2");
        l1.add("y3");

        ArrayList<String> al1=new ArrayList<>();
        al1.add("s1");
        al1.add("s2");

        //Add one collection to another collection . addAll(index,list)

        l1.addAll(al1);
        System.out.println(l1);

        //remove the elements by using path and element
        l1.remove(1);
        System.out.println(l1);

        l1.remove("s1");
        System.out.println(l1);

        l1.removeAll(al1);
        System.out.println(l1);

        ArrayList<String> al2=new ArrayList<>();
        al2.add("f1");
        al2.add("f2");
        al2.add("f3");
        al2.add("f4");

        System.out.println(al2);

        l1.addAll(al2);
        System.out.println(l1);

        //Retrivel
        System.out.println(l1.get(2));
        System.out.println(l1.contains("j1"));
        
        //Update
        l1.set(2,"y4");
        System.out.println(l1);

        //Some Other Special Methods
        //remove(); , removeFirst(); , removeLast(); , removeFirstOccurance(object), 
        // removeLastOccurance(Object);, getFirst(); , getLast();

        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());

        //Important Points: -
        /*
         * Default Capacity - 0
         * Initial Capacity - 0
         * null values - yes
         * Duplicate Elements - yes
         * Insertion Order - yes
         * Sorted Order - yes
         * Random access - yes
         * Synchronised - no
         * Good - Data Manipulation
         */
    }
}
