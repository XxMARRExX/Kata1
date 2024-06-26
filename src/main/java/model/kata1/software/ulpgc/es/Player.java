package model.kata1.software.ulpgc.es;

public class Player extends Person{

    private int age;
    private String position;

    public Player(String name, int age, String position) {
        super(name);
        this.age = age;
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Player{" +
                " Name: " + super.getName() +
                ", age: " + getAge() +
                ", position='" + getPosition() + '\'' +
                " }\n";
    }
}
