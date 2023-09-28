import java.time.LocalDate;

public class Admin {
    private static Admin instance;
    private String name;

    private Admin(String name) {
        this.name = name;
    }

    public static Admin getInstance(String name) {
        if (instance == null) {
            instance = new Admin(name);
        }
        return instance;
    }

    public String getName(){
        return this.name;
    }

}
