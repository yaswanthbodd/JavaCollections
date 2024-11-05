import java.util.ArrayList;
import java.util.Arrays;
public class ALPractice{
    public static void main(String a[]){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(5);
        al.add(10);
        al.add(12);
        al.add(1,3);
        System.out.println(al);
        System.out.println(al.size());

        Integer[] arr=new Integer[]{1,2,3,4,5};
        ArrayList<Integer> al1=new ArrayList<>(Arrays.asList(arr));
        al1.add(23);
        System.out.println(al1);

        // Retrive the Elements
        System.out.println("Third Element: "+al1.get(2));

        //Remove the Elements
        al1.remove(3);
        System.out.println(al1);

        //Verification
        System.out.println(al1.contains(5));
        System.out.println(al1.containsAll(al));

        //Update the elements
        al1.set(0, null);
        System.out.println(al1);

        //Some other methods lastIndexOf(), firstElement(),lastElement(),isEmpty()

        //Retrive the elements by using for each loop
        for(Integer i:al1){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}