public class Main {
    public static void main(String[] args) {

        Human[] humans = new Human[4];
        humans [0] = new Human("Max", 1988, "Minsk");
        humans [1] = new Human("Anna", 1993, "Moscow");
        humans [2] = new Human("Kate", 1992, "Kaliningrad");
        humans [3] = new Human("Artem", 1995, "Moscow");

        HumanService.printHuman(humans);


    }
}