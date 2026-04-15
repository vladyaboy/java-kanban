import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surName, Gender gender, int height) {
        super(name, surName, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurName(), height);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Actor otherActor = (Actor) obj;
        return Objects.equals(this.getName(), otherActor.getName()) &&
                Objects.equals(this.getSurName(), otherActor.getSurName()) &&
                this.getHeight() == otherActor.getHeight();

    }

    @Override
    public String toString() {
        return "\"" + this.getName() + " " + this.getSurName() + " (Рост: " + this.getHeight() + " см)\"";
    }
}
