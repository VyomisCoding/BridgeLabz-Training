
import java.util.*;
public class StockSpanProblem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int n=sc.nextInt();

        int[] price = new int[n];
        int[] span = new int[n];

        System.out.println("Enter the stock prices");  // read stock prices
        for(int i=0;i<n;i++){
            price[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();   // stack to store indices of days

        span[0] = 1;    // first day is always 1
        stack.push(0);
        for(int i=1;i<n;i++){
            while(!stack.isEmpty() && price[stack.peek()] <= price[i]){
                stack.pop();
            }
            span[i] = stack.isEmpty()?(i+1):(i-stack.peek());   // If stack is empty, all previous prices are smaller
            stack.push(i);
        }
        System.out.println("Stock Span");
        for (int i = 0; i < n; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
