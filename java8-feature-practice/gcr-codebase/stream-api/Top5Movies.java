import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Top5Movies{
    static class Movie{         // POJO inside same class
        String name;
        double rating;
        int year;
        Movie(String name, double rating, int year){
            this.name = name;
            this.rating = rating;
            this.year = year;
        }

        public double getRating(){ return rating; }
        public int getYear(){ return year; }

        @Override
        public String toString(){
            return name + " (" + rating + ", " + year + ")";
        }
    }

    public static void main(String[] args){
        List<Movie> movies = Arrays.asList(
                new Movie("A", 9.1, 2022),
                new Movie("B", 8.5, 2024),
                new Movie("C", 8.8, 2023),
                new Movie("D", 7.9, 2024),
                new Movie("E", 9.0, 2021),
                new Movie("F", 8.9, 2023)
        );

        List<Movie> top5 = movies.stream()
                .sorted(Comparator.comparing(Movie::getRating).reversed()
                        .thenComparing(Movie::getYear).reversed())
                .limit(5)
                .toList();

        top5.forEach(System.out::println);
    }
}
