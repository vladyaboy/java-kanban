public class MusicalShow extends Show {
    private String musicalAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director, String musicalAuthor, String librettoText) {
        super(title, duration, director);
        this.musicalAuthor = musicalAuthor;
        this.librettoText = librettoText;
    }

    public void printMusicalAuthor() {
        System.out.println("Автор музыки: " + musicalAuthor);
    }

    public void printLibrettoText() {
        System.out.println("Либрето: " + librettoText);
    }
}
