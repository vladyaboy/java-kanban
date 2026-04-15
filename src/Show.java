import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Show {
    private String title;
    private int duration;
    private Director director;

    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public void printDuration() {
        System.out.println("Длительность шоу: " + duration + "мин.");
    }

    public void addActor(Actor actorToAdd) {
        if (listOfActors.contains(actorToAdd)) {
            System.out.println("Актер \"" + actorToAdd.getSurName() + "\" уже участвует в этом шоу.");
        } else {
            listOfActors.add(actorToAdd);
            System.out.println("Актер \"" + actorToAdd.getSurName() + "\" успешно добавлен в \"" + title + "\".");
        }
    }

    public void replaceActor(Actor actorToAdd, String surname) {
            for (int i = 0; i < listOfActors.size(); i++) {
                if (Objects.equals(listOfActors.get(i).getSurName(), surname)) {
                    listOfActors.set(i, actorToAdd);
                    System.out.println("Актёр \"" + surname + "\"" + " успешно заменён на \"" + actorToAdd.getSurName() + "\" в постановке \"" + title + "\".");
                    return;
                }
            }
            System.out.println("Актера с такой фамилией нет в списке.");
    }

    public void printActors() {
        System.out.println("Актёры в спектакле \"" + title + "\":");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void printDirectorsInfo() {
        System.out.println("Режиссёр: " + director.toString());
    }
}
