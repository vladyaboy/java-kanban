public class Ballet extends MusicalShow {
    private String choreographer;

    public Ballet(String title, int duration, Director director, String musicalAuthor, String librettoText, String choreographer) {
        super(title, duration, director, musicalAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public void printChoreographer() {
        System.out.println("Хореограф: " + choreographer);
    }
}
