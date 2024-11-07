import java.util.*;
public class ListIteratorPractice {
    public static void main(String args[]){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(57);
        al.add(34);
        al.add(12);
        al.add(77);

        System.out.println(al);
        ListIterator<Integer> i=al.listIterator();
        System.out.println("Forward Direction: ");
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }

        System.out.println();
        i.add(23);
        System.out.println("Backword Direction: ");
        while(i.hasPrevious()){
            System.out.print(i.previous()+" ");
        }
        System.out.println();
    }
}
