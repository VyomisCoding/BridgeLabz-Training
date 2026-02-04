import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WeekendDoctors{
    static class Doctor{      // POJO inside same class
        String name;
        String specialty;
        boolean weekend;
        Doctor(String name, String specialty, boolean weekend){
            this.name = name;
            this.specialty = specialty;
            this.weekend = weekend;
        }
        public boolean isWeekend() { return weekend; }
        public String getSpecialty() { return specialty; }

        @Override
        public String toString(){
            return name + " - " + specialty + " - Weekend: " + weekend;
        }
    }

    public static void main(String[] args){
        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr A", "Cardiology", true),
                new Doctor("Dr B", "Neurology", false),
                new Doctor("Dr C", "Orthopedic", true),
                new Doctor("Dr D", "Dermatology", true)
        );

        List<Doctor> weekendDocs = doctors.stream()
                .filter(Doctor::isWeekend)
                .sorted(Comparator.comparing(Doctor::getSpecialty))
                .toList();

        weekendDocs.forEach(System.out::println);
    }
}
