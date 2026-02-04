import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Marker interface used (Serializable)
class UserData implements Serializable {
    String name;
    int age;

    public UserData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class BackupProcessor {
    public static void main(String[] args) {
        UserData user = new UserData("Vyomesh", 21);

        try (ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("backup.dat"))) {

            out.writeObject(user);
            System.out.println("Backup Created Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
