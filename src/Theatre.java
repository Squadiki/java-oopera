import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        ArrayList<Actor> listOfActorsSpectacle = new ArrayList<>();
        ArrayList<Actor> listOfActorsBallet = new ArrayList<>();
        ArrayList<Actor> listOfActorsOpera = new ArrayList<>();

        Actor actor1 = new Actor("Александр", "Ануфриев", Gender.MALE, 181);
        Actor actor2 = new Actor("Дарья", "Стрельцова", Gender.FEMALE, 169);
        Actor actor3 = new Actor("Иван", "Щетинин", Gender.MALE, 180);

        Director director1 = new Director("Мария", "Бушова", Gender.FEMALE, 28);
        Director director2 = new Director("Никита", "Кубраков", Gender.MALE, 32);

        Person musicAuthor = new Person("Владимир", "Смирнов", Gender.MALE);
        Person choreographer = new Person("Валерия", "Конькова", Gender.FEMALE);

        Show spectacle = new Show("Ёжик в тумане", 78, director1, listOfActorsSpectacle);
        Ballet ballet = new Ballet("Лебединое озеро", 165, director2, listOfActorsBallet, musicAuthor,
                "С 1997 года спектакль сохраняется в репертуаре «Кремлевского балета» и неизменно имеет " +
                        "большой зрительский успех.", choreographer);
        Opera opera = new Opera("Королевские игры", 121, director1, listOfActorsOpera, musicAuthor,
                "Сочинение драматурга Григория Горина и композитора Шандора Каллоша.", 3);

        spectacle.addActor(actor1);
        spectacle.addActor(actor2);

        ballet.addActor(actor2);
        ballet.addActor(actor3);

        opera.addActor(actor1);
        opera.addActor(actor2);
        opera.addActor(actor3);

        spectacle.printListOfActors();
        ballet.printListOfActors();
        opera.printListOfActors();

        ballet.changeOfActor(actor1, "Стрельцова");
        ballet.printListOfActors();

        spectacle.changeOfActor(actor3, "Пугачёв");

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
