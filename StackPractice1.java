import java.util.Stack;
public class StackPractice1 {
    public static void main(String a[]){
        Stack<String> books=new Stack<>(); 
        //Special methods available in stack
        //1. Push - Add elements into the stack
        //2. pop - remove element from top of the stack (LIFO).
        //3. Peek - It Dispaly top most element in the stack.
        //4. search - It search from top to bottom with starting with index '1'.

        // Push operation
        books.push("Red");
        books.push("black");
        books.push("white");

        System.out.println(books);

        //Pop operation
        System.out.println(books.pop());
        System.out.println(books);

        //peek operation
        System.out.println(books.peek());

        //search operation
        System.out.println(books.search("Red"));

        //Some other Methods in stack
        books.push("yellow"); 
        books.push("white");

        System.out.println(books.indexOf("Red"));

        System.out.println(books.isEmpty());
        System.out.println(books.empty());

        //Important Points 
        // Default Capacity - 10
        // Initial Capacity - 10
        // Duplicate Elements - yes
        // Null Values - yes
        // Insertion Order - yes
        // Sorted Order - no
        // random access of elements - yes, It allowed but we didn't used
        // Synchronisex - yes
    }
}
