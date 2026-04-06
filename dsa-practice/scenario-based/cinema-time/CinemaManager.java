import java.util.*;

public class CinemaManager{
    private List<String> movieTitles = new ArrayList<>();     // List for movie titles
    private List<String> showTimes = new ArrayList<>();       // List for showtimes (parallel list)
    
    public void addMovie(String title, String time) throws InvalidTimeFormatException{    // Add movie with time
        if(!isValidTime(time)){    // Validate time format HH:MM
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }
        movieTitles.add(title);
        showTimes.add(time);
        System.out.println("Movie added successfully");
    }
    
    public void searchMovie(String keyword){    // Search movie by keyword (case-insensitive)
        try{
            boolean found = false;
            for(int i=0;i<movieTitles.size();i++){
                if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())){
                    System.out.println(String.format(    // formatted output
                            " %s at %s",
                            movieTitles.get(i),
                            showTimes.get(i)
                    ));
                    found = true;
                }
            }
            if(!found){
                System.out.println("No movie found with keyword");
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("Invalid index accessed during search");
        }
    }
    
    public void displayAllMovies(){    // Display all movies
        if (movieTitles.isEmpty()){
            System.out.println("No movies available");
            return;
        }
        System.out.println("\n Movie Schedule:");
        for (int i = 0; i < movieTitles.size(); i++){
            System.out.println((i + 1) + ". " + movieTitles.get(i) + " - " + showTimes.get(i));
        }
    }
    
    public void generateReport(){      // Generate printable report (List → Array)
        String[] titleArray = movieTitles.toArray(new String[0]);
        String[] timeArray = showTimes.toArray(new String[0]);
        System.out.println("\nPrintable Report:");
        for (int i = 0; i < titleArray.length; i++) {
            System.out.println(titleArray[i] + " | " + timeArray[i]);
        }
    }

    private boolean isValidTime(String time){       // Time validation helper method
        if(!time.matches("\\d{2}:\\d{2}")){
            return false;
        }
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        return hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59;
    }
}
