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
    public String toString() {
        return "Имя: " + name + ", фамилия: " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender);
    }
}
