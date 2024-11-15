package librarySystem;


    import java.io.Serializable;

public class Borrower implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;

    public Borrower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "name='" + name + '\'' +
                '}';
    }
}


