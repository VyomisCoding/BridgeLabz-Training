
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book{
    String genre;
    int pages;
    Book(String genre, int pages){
        this.genre = genre;
        this.pages = pages;
    }
}


public class LibraryBookStatistics {
    public static void main(String[] args) {
    List<Book> books = Arrays.asList( new Book("Fiction", 320), new Book("Fiction", 250), new Book("Horror", 500), new Book("Horror", 180), new Book("Science", 400));
        Map<String, IntSummaryStatistics> stats = books.stream().collect(Collectors.groupingBy(b -> b.genre,Collectors.summarizingInt(b -> b.pages)));
        stats.forEach((genre, summary) -> {           // Printing result
            System.out.println("Genre: " + genre);
            System.out.println(" Total Pages   : " + summary.getSum());
            System.out.println(" Average Pages : " + summary.getAverage());
            System.out.println(" Max Pages     : " + summary.getMax());
            System.out.println(" Min Pages     : " + summary.getMin());
            System.out.println(" Count         : " + summary.getCount());
        });
    }
}

