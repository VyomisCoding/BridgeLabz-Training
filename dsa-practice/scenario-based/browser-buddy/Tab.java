public class Tab{
    String name;
    BrowserHistory history;
    public Tab(String name){
        this.name = name;
        this.history = new BrowserHistory();
    }
}
