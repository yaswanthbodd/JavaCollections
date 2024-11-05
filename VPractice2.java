import java.util.Vector;
import java.util.Arrays;
public class VPractice2 {
    public static void main(String a[]){
        Vector v1=new Vector(200); //Set the Vector Size
        System.out.println(v1.capacity());
        System.out.println(v1.size());

        //Convert Arrays into the list
        Object[] arr=new Object[]{1,3,4,5,6,7};
        Vector v2=new Vector(Arrays.asList(arr));
        System.out.println(v2);
        System.out.println(v2.size());
        System.out.println(v2.capacity());

        Vector<Integer> v3=new Vector<>(); //Generics used
        v3.add(12);
        v3.add(null);
        v3.add(null);
        v3.add(12);

        System.out.println(v3);
    }
}
