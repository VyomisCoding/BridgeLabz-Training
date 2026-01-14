import java.util.*;

public class SortStackUsingRecursion{
    static void insertedSorted(Stack<Integer> stack,int element){   //fn to insert an element the correct position in sorted stack
        if(stack.isEmpty() || element > stack.peek()){ // if stack is empty or element is greater than top : push element directly
            stack.push(element);
            return;
        }

        int top = stack.pop();         // if top is greater remove it 
        insertedSorted(stack,element);   // recursively insert element in remaining stack
        stack.push(top);               // put the removal element back 
    }

    static void sortStack(Stack<Integer> stack){   // fn to sort the stack using recursion
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        sortStack(stack);
        insertedSorted(stack, top);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter the number of elements");
        int n=sc.nextInt();

        System.out.println("Enter stack Elements");
        for(int i=0;i<n;i++){
            stack.push(sc.nextInt());
        }

        sortStack(stack);

        System.out.println("Sorted Stack (Top to Bottom):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
    
}
