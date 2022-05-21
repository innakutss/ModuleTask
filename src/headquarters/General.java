package headquarters;

public class General extends Person {

    int id;
    int age;
    String name;

    public General(int id, int age, String name) {
        super(id, age, name);
    }


    class Commander extends General {
        
        int id;
        int age;
        String name;

        public Commander(int id, int age, String name) {
            super(id, age, name);
        }

        @Override
        public void canFight() {
            super.canFight();
        }

        class Soldier extends Commander {

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
        }


    @Override
    public void canFight() {
        super.canFight();
    }
}
