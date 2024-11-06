import java.util.*;
import java.util.Map.Entry;
public class MapPractice {
    public static void main(String args[]){
        Map<Integer, String> m=new Hashtable<>();

        //Add the Elements into the Map
        m.put(523187,"Vetapalem");
        m.put(523002,"Mylavaram");
        m.put(523123,"Chirala");

        //Retrieval of keys from the Map
        Set<Integer> keys=m.keySet();
        for(Integer key:keys){
            System.out.print(key+" ");
        }
        System.out.println();

        //Retrieval of values from the Map
        Collection<String> values=m.values();
        for(String value:values){
            System.out.print(value+" ");
        }
        System.out.println();

        //Retrieval of value from the Map based on key
        System.out.println(m.get(523187));

        //Print both keys and values
        System.out.println("Key   Value");
        for(Integer key:keys){
            System.out.println(key+" "+m.get(key));
        }

        //Deletion
        m.remove(523187);
        System.out.println(m);

        //Verification
        System.out.println(m.containsKey(523187));
        System.out.println(m.containsKey(523123));

        System.out.println(m.containsValue("Hyderabad"));
        System.out.println(m.containsValue("Chirala"));

        //Update
        m.put(523123,"Ongole");
        System.out.println(m);

        m.putIfAbsent(523123,"Chirala");
        System.out.println(m);

        m.putIfAbsent(523187,"Vetapalem");
        System.out.println(m);

        m.replace(523187,"Parchur");
        System.out.println(m);

        System.out.println("Size of the Map: "+m.size());

        //m.clear(); -> It remove total elements in the map

        //Entry Set
        Set<Entry<Integer,String>> entries=m.entrySet();
        for(Entry<Integer,String> entry:entries){
            Integer key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+" "+value);
        }
    }
}
