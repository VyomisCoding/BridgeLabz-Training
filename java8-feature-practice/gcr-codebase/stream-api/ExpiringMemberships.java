import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

public class ExpiringMemberships{
    static class Member{               // POJO inside same class
        String name;
        LocalDate expiry;

        Member(String name, LocalDate expiry){
            this.name = name;
            this.expiry = expiry;
        }

        public LocalDate getExpiry() { return expiry; }

        @Override
        public String toString() {
            return name + " - Expires: " + expiry;
        }
    }

    public static void main(String[] args){
        List<Member> members = Arrays.asList(
                new Member("A", LocalDate.now().plusDays(10)),
                new Member("B", LocalDate.now().plusDays(40)),
                new Member("C", LocalDate.now().minusDays(5)),
                new Member("D", LocalDate.now().plusDays(25))
        );
        LocalDate today = LocalDate.now();
        List<Member> expiringSoon = members.stream()
                .filter(m -> {
                    long days = ChronoUnit.DAYS.between(today, m.getExpiry());
                    return days >= 0 && days <= 30;
                })
                .toList();

        expiringSoon.forEach(System.out::println);
    }
}
