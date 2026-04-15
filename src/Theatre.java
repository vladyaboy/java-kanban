public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");

        String choreographer = "Один Хореограф";
        String musicalAuthor = "Автор Музыки";

        Director director1 = new Director("Режиссер", "Первый", Gender.MALE, 4);
        Director director2 = new Director("Режиссер", "Второй", Gender.MALE, 2);

        Actor actor1 = new Actor("Актер", "Один", Gender.MALE, 184);
        Actor actor2 = new Actor("Актер", "Два", Gender.FEMALE, 167);
        Actor actor3 = new Actor("Актер", "Три", Gender.MALE, 172);

        String operaLibretto = "Либретто для оперы.";
        String balletLibretto = "Либретто для балета.";

        Show show = new Show("Спектакль", 135, director1);
        show.addActor(actor1);
        show.addActor(actor2);
        System.out.println();
        show.printActors();
        System.out.println();

        Opera opera = new Opera("Опера", 175, director2, musicalAuthor, operaLibretto, 3);
        opera.addActor(actor1);
        opera.addActor(actor2);
        opera.addActor(actor3);
        //Тест добавления актера который уже присутствует в постановке
        opera.addActor(actor3);
        System.out.println();
        opera.printActors();
        opera.printLibrettoText();
        System.out.println();

        Ballet ballet = new Ballet("Балет", 185, director2, musicalAuthor, balletLibretto, choreographer);
        ballet.addActor(actor1);
        ballet.addActor(actor2);
        ballet.addActor(actor3);
        System.out.println();
        ballet.printActors();
        ballet.printLibrettoText();
        System.out.println();
        //Замена
        System.out.println("\t\t*** Тест замены ***\n");
        show.replaceActor(actor1, actor1.getSurName());
        System.out.println();
        show.printActors();
        show.replaceActor(actor3, actor2.getSurName());
        System.out.println();
        show.printActors();
        System.out.println();
        show.replaceActor(actor2, "Четыре");
        System.out.println();
        show.printActors();
    }
}
