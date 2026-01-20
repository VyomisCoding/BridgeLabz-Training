public class BrowserHistory{
    private HistoryNode current;
    public void visit(String url){
        HistoryNode node = new HistoryNode(url);
        if(current != null){
            current.next = node;
            node.prev = current;
        }
        current = node;
        System.out.println("Visited: " + url);
    }

    public void back(){
        if(current!=null && current.prev!=null){
            current = current.prev;
            System.out.println("Back to: " + current.url);
        }else{
            System.out.println("No previous page");
        }
    }

    public void forward(){
        if(current!=null && current.next!=null){
            current = current.next;
            System.out.println("Forward to: " + current.url);
        }else{
            System.out.println("No forward page");
        }
    }

    public String getCurrentPage(){
        return current == null ? "No Page" : current.url;
    }
    
}
