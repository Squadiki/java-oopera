import java.util.ArrayList;
import java.util.Scanner;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors, Scanner scanner,
                 Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, scanner, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    // Вывод списка актёров
    @Override
    public void printListOfActors() {
        System.out.println("Актёры, участвующие в опере:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }
}
