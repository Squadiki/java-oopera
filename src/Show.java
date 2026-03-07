import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printListOfActors() {
        System.out.println("Актёры, участвующие в спектакле:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.name.equals(newActor.name) && actor.surname.equals(newActor.surname) &&
                    actor.height == newActor.height) {
                System.out.println("Данный актёр уже в составе!");
                return;
            }
        }
        listOfActors.add(newActor);
        System.out.println("Актёр добавлен!");
    }

    public void changeOfActor(Actor newActor, String surname) {
        for (Actor actor : listOfActors) {
            if (actor.surname.equals(surname)) {
                int index = listOfActors.indexOf(actor);
                listOfActors.set(index, newActor);
                System.out.println("Замена актёра произошла успешно!");
                return;
            }
        }
        System.out.println("Нет актёра с такой фамилией!");
    }
}
