import java.util.Stack;

public class ClosedTabStack{
    private Stack<Tab> stack = new Stack<>();
    public void closeTab(Tab tab){
        stack.push(tab);
        System.out.println("Tab closed: " + tab.name);
    }

    public Tab reopenTab(){
        if(stack.isEmpty()){
            System.out.println("No tabs to restore");
            return null;
        }
        return stack.pop();
    }
}
