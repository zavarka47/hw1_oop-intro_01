public class HumanService {

    public static void printHuman(Human[] humans) {
        for (int i = 0; i < humans.length; i++) {
            System.out.println("Hello! My mane is " + addSpaceToName(humans[i].getName(), humans) +
                    " I`m from " + addSpaceToTown(humans[i].getTown(), humans) +
                    " I was " + humans[i].getYearOfBirth() +
                    " I`m " + addSpaceToJobTitle(humans[i].getJobTitle(), humans) +
                    " let's get acquainted!");}

        }
    public static int maxLengthName(Human[] humans) {
        int maxLengthName = humans[0].getName().length();
        for (int i = 0; i < humans.length; i++) {
            if (maxLengthName < humans[i].getName().length()){
                maxLengthName = humans[i].getName().length();
            }
        }
        return maxLengthName;
    }

    public static String addSpaceToName (String name, Human[] humans) {
        int max = maxLengthName(humans);
        String fullName = name;
        if (name.length() < max){
            for (int i = 0; i < (max - name.length()); i++) {
                fullName = fullName + ".";}
            }
        return fullName + "...";
    }

    public static int maxLengthTown (Human[] humans) {
        int maxLengthTown = humans[0].getTown().length();
        for (int i = 0; i < humans.length; i++) {
            if (maxLengthTown < humans[i].getTown().length()){
                maxLengthTown = humans[i].getTown().length();
            }
        }
        return maxLengthTown;
    }

    public static String addSpaceToTown (String town, Human[] humans) {
        int max = maxLengthTown(humans);
        String fullTown = town;
        if (town.length() < max){
            for (int i = 0; i < (max - town.length()); i++) {
                fullTown = fullTown + ".";}
        }
        return fullTown + "...";
    }

    public static int maxLengthJobTitle (Human[] humans) {
        int maxLengthJobTitle = humans[0].getJobTitle().length();
        for (int i = 0; i < humans.length; i++) {
            if (maxLengthJobTitle < humans[i].getJobTitle().length()){
                maxLengthJobTitle = humans[i].getJobTitle().length();
            }
        }
        return maxLengthJobTitle;
    }

   public static String addSpaceToJobTitle (String jobTitle, Human[] humans) {
        int max = maxLengthJobTitle(humans);
        String fullJobTitle = jobTitle;
        if (jobTitle.length() < max){
            for (int i = 0; i < (max - jobTitle.length()); i++) {
                fullJobTitle = fullJobTitle + ".";}
        }
       if (jobTitle.startsWith("a") || jobTitle.startsWith("e") || jobTitle.startsWith("i") || jobTitle.startsWith("o")
                || jobTitle.startsWith("u") || jobTitle.startsWith("y")) {
            fullJobTitle = "an " + fullJobTitle;
        } else {
            fullJobTitle = "a " + fullJobTitle;
        }
        return fullJobTitle + "...";}

}