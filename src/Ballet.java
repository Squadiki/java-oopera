import java.util.ArrayList;
import java.util.Scanner;

public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors, Scanner scanner,
                  Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, listOfActors, scanner, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    // Вывод списка актёров
    @Override
    public void printListOfActors() {
        System.out.println("Актёры, участвующие в балете:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }
}
