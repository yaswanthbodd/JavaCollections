import java.util.Stack;
public class StackPractice {
    public static void main(String a[]){
        Stack<String> books=new Stack<>();
        books.add("Red");
        books.add("Black");
        books.add(0,"white");

        System.out.println(books);
        
        books.remove(0);
        System.out.println(books);

        books.add(0,"yellow");
        System.out.println(books);

        books.set(0,"white");
        System.out.println(books);

        System.out.println(books.contains("yellow"));
        System.out.println(books.contains("Red"));
        
        System.out.println(books.size());
        System.out.println(books.capacity());
        System.out.println(books.isEmpty());
        System.out.println(books.firstElement());
        System.out.println(books.lastElement());
        System.out.println(books.get(1));
        books.clear();
        System.out.println(books);
    }
}
