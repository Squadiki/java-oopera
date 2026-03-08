import java.util.Objects;

public class Actor extends Person {
    protected int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + " (рост: " + height + " см.)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return super.equals(o) && Objects.equals(height, actor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }
}