import java.util.Vector;
public class VPractice {
    public static void main(String a[]){
        Vector v1=new Vector();
        v1.add("Yaswanth");
        v1.add("subbu");
        v1.add("srinu");
        v1.add(2,"syam");

        // System.out.println("Size: "+v1.size());
        // System.out.println("Capacity: "+v1.capacity());
        System.out.println(v1);
        
        Vector v2=new Vector();
        v2.add("Subhani");
        v2.add("Saida");

        //Add Vector From one vector another vector
        for(int i=0;i<v2.size();i++){
            v1.add(v2.get(i));
        }

        System.out.println(v1);

    }
}
