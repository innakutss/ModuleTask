package headquarters;

import java.util.ArrayList;

public class MainHeadquarter {

    public static void main(String[] args) {

        ArrayList<Person> headquarter = new ArrayList<>() {
        };
            General general = new General(40, 50, "Ivan");
            General.Commander commander1 = general.new Commander(31, 35, "Petro");
            General.Commander commander2 = general.new Commander(32, 33, "Arsen");
            General.Commander.Soldier soldier1 = commander1.new Soldier(11, 23, "Oleh");
            General.Commander.Soldier soldier2 = commander1.new Soldier(12, 20, "Andriy");
            General.Commander.Soldier soldier3 = commander1.new Soldier(13, 22, "Vasyl");
            Soldier soldier4 = new Soldier(14, 23, "Anton");
            Soldier soldier5 = new Soldier(15, 28, "Mykola");
            Soldier soldier6 = new Soldier(16, 26, "Orest");

            headquarter.add(general);
            headquarter.add(commander1);
            headquarter.add(commander2);
            headquarter.add(soldier1);
            headquarter.add(soldier2);
            headquarter.add(soldier3);
            headquarter.add(soldier4);
            headquarter.add(soldier5);
            headquarter.add(soldier6);

        System.out.println(headquarter);

    }


    }


