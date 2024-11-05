import java.util.Arrays;
import java.util.Vector;
public class VPractice1 {
    public static void main(String a[]){
        Vector v1=new Vector();
        v1.add("yaswanth");
        v1.add("sai");
        System.out.println(v1);

        Vector v2=new Vector();
        v2.add("syam");
        v2.add("subhani");
        v2.add("srinu");

        System.out.println(v2); 

        //Add one vector to another vector
        v1.addAll(v2);
        System.out.println(v1);

        //Retrive the elements from the Vector
        System.out.println(v1.get(2));

        //Remove the elements
        v1.remove("yaswanth"); //Element Based
        v1.remove(2); //Index Based
        System.out.println(v1);

        //Remove list
        v1.removeAll(v2);
        System.out.println(v1);

        //To remove all the elements in the vector
        v1.clear();
        System.out.println(v1);

        //Verifications - Ordered not considered
        System.out.println(v2.contains("syam"));
        System.out.println(v2.contains(v1));

        //Update the elements - Replace the elements in that index
        System.out.println(v2);
        v2.set(1,"subbu");
        System.out.println(v2);

        // Some Other Methods
        System.out.println(v2.lastIndexOf("syam"));
        System.out.println(v2.lastIndexOf("srinu"));
        System.out.println(v2.isEmpty());
        System.out.println(v2.firstElement());
        System.out.println(v2.lastElement());

        //Vector to Arrays
        Object[] arr=v2.toArray(); 
        System.out.println(Arrays.toString(arr));
    }
}
