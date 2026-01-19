public class FibonacciComparison {

    public static void main(String[] args){
        int[] testCases = {10, 30, 50};
        System.out.println("=== Recursive vs Iterative Fibonacci Performance ===");
        System.out.println();
        for(int n : testCases){
            System.out.println("Fibonacci Number: " + n);
            
            if (n <= 30){         // ---------------- Recursive (Avoid very large values (too slow))
                long startRecursive = System.currentTimeMillis();
                int recursiveResult = fibonacciRecursive(n);
                long endRecursive = System.currentTimeMillis();

                System.out.println("Recursive Result: " + recursiveResult);
                System.out.println("Recursive Time: " 
                        + (endRecursive - startRecursive) + " ms");
            }else{
                System.out.println("Recursive Result: Infeasible (Too Slow)");
            }

            long startIterative = System.currentTimeMillis();    // ---------------- Iterative ----------------
            int iterativeResult = fibonacciIterative(n);
            long endIterative = System.currentTimeMillis();
            System.out.println("Iterative Result: " + iterativeResult);
            System.out.println("Iterative Time: " + (endIterative - startIterative) + " ms");
            System.out.println("-------------------------------------------");
        }
    }
    
    public static int fibonacciRecursive(int n){     // Recursive Fibonacci (Exponential Time Complexity: O(2^n))
        if (n <= 1){
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);    // Recursive calls
    }
    
    public static int fibonacciIterative(int n){     // Iterative Fibonacci (Linear Time Complexity: O(n))
        if(n <= 1){
            return n;
        }
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++){     // Loop from 2 to n
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
