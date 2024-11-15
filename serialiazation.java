import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class serialiazation {
    private static final String FILE_NAME = "people.ser";

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));

        // Serialize the list of people
        serialize(people);

        // Deserialize the list of people
        List<Person> deserializedPeople = deserialize();
        if (deserializedPeople != null) {
            for (Person person : deserializedPeople) {
                System.out.println(person);
            }
        }
    }

    private static void serialize(List<Person> people) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(people);
            System.out.println("Serialization successful.");
        } catch (IOException e) {
            System.err.println("Serialization error: " + e.getMessage());
        }
    }

    private static List<Person> deserialize() {
        List<Person> people = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            people = (List<Person>) ois.readObject();
            System.out.println("Deserialization successful.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization error: " + e.getMessage());
        }
        return people;
    }
}


