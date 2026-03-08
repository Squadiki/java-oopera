import java.util.ArrayList;
import java.util.Scanner;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;
    Scanner scanner; // Здесь будет необходима только для уточнения актёра при замене

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    // Вывод списка актёров
    public void printListOfActors() {
        System.out.println("Актёры, участвующие в спектакле:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    // Вывод информации о директоре
    public void printInfoDirector() {
        System.out.println(director);
    }

    // Добавление актёра
    public void addActor(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (listOfActors.contains(newActor)) {
                System.out.println("Данный актёр уже в составе!");
                return;
            }
        }
        listOfActors.add(newActor);
        System.out.println("Актёр добавлен!");
    }

    // Замена актёра
    public void changeOfActor(Actor newActor, String surname, Scanner scanner) {
        // Прохожу по списку и считаю сколько актёров с нужной фамилией
        int counterSameSurnames = 0;
        for (Actor actor : listOfActors) {
            if (actor.surname.equals(surname)) {
                counterSameSurnames++;
            }
        }
        // Если всего один, то заменяю его
        if (counterSameSurnames == 1) {
            for (Actor actor : listOfActors) {
                if (actor.surname.equals(surname)) {
                    int index = listOfActors.indexOf(actor);
                    listOfActors.set(index, newActor);
                    System.out.println("Замена актёра произошла успешно!");
                    return;
                }
            }
        // Если от 2-х, то прошу уточнить имя, а потом заменяю нужного актёра
        } else if (counterSameSurnames >= 2) {
            System.out.print("Актёров с фамилией '" + surname + "': "  + counterSameSurnames +
                    ". Пожалуйста, уточните имя актёра для замены: ");
            this.scanner = scanner;
            String scanName = scanner.next();
            for (Actor actor : listOfActors) {
                if (actor.surname.equals(surname) && actor.name.equals(scanName)) {
                    int index = listOfActors.indexOf(actor);
                    listOfActors.set(index, newActor);
                    System.out.println("Замена актёра произошла успешно!");
                    return;
                }
            }
        }
        System.out.println("Нет указанного актёра!");
    }
}
