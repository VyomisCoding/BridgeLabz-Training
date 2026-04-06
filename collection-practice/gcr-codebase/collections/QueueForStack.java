// Queue Interface

import java.util.*;

public class QueueForStack{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    void push(int x){
        q2.add(x);
        while(!q1.isEmpty())
            q2.add(q1.remove());

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    int pop(){
        if (q1.isEmpty()) return -1;
        return q1.remove();
    }
    int top(){
        if (q1.isEmpty()) return -1;
        return q1.peek();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        QueueForStack st = new QueueForStack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println("Pop: " + st.pop()); // 3
    }
    
}
