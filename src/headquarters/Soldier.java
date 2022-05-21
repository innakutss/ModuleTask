package headquarters;

public class Soldier extends Person {

    int id;
    int age;
    String name;

    public Soldier(int id, int age, String name) {
        super(id, age, name);
    }

    @Override
    public void canFight() {
        super.canFight();
    }
}
