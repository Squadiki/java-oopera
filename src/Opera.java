import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                 Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public void printListOfActors() {
        System.out.println("Актёры, участвующие в опере:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.name + " " + actor.surname + " (" + actor.height + " см).");
        }
    }
}
