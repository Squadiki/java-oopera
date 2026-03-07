import java.util.Objects;

public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    protected Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender);
    }
}
