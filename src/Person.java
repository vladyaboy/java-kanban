public class Person {
    private String name;
    private String surName;
    private Gender gender;

    public Person(String name, String surName, Gender gender) {
        this.name = name;
        this.surName = surName;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Gender getGender() {
        return gender;
    }


    @Override
    public String toString() {
        return getName() + " " + getSurName();
    }
}
