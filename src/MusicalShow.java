import java.util.ArrayList;
import java.util.Scanner;

public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    protected MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors, Scanner scanner,
                          Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors, scanner);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Вывод текста либретто
    public void printLibrettoText() {
        System.out.println( "Либретто: " + librettoText);
    }
}
