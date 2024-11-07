import java.util.*;
public class EnumerationPractice {
    public static void main(String a[]){
        //Legacy class -> Hashtable, Vector, Stack, Properties, Dictionary
        Vector<String> v=new Vector<>();
        v.add("Apple");
        v.add("Mango");
        v.add("Banana");
        v.add("Guava");

        System.out.println(v);
        Enumeration<String> e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
            
        }

        Stack<String> s=new Stack<>();
        s.add("Apple");
        s.add("Mango");
        s.add("Banana");
        s.add("Guava");

        System.out.println(s);
        Enumeration<String> e1=s.elements();
        while(e1.hasMoreElements()){
            System.out.println(e1.nextElement());
            
        }

        Hashtable<String,Integer> ages=new Hashtable<>();
        ages.put("India",200);
        ages.put("Srilanka",300);
        ages.put("US",500);
        Enumeration<Integer> ag=ages.elements();
        while(ag.hasMoreElements()){
            System.out.println(ag.nextElement());
        }
    }
}
