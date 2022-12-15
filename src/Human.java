public class Human {
    String name;
    int yearOfBirth;
    String town;
    String jobTitle;
    Human (String name, int yearOfBirth, String town, String jobTitle) {
        this.name = name;
        this.yearOfBirth = 0;
        this.town = town;
        this.jobTitle = jobTitle;
        checkString(name);
        checkString(town);
        checkString(jobTitle);
        checkYearOdBirth(yearOfBirth);
    }

    public String getName() {
        return this.name;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public String getTown() {
        return this.town;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public String toString () {
        return "Hello! My mane is " + name + " I`m from " + town + " I was " + yearOfBirth +
                " I`m " + jobTitle + " let's get acquainted!";

    }

    // Методы check
     private void checkYearOdBirth (int yearOfBirth) {
         if (yearOfBirth < 0) {
             throw new IllegalArgumentException("Информация указана не верно");}
     }

     private void checkString (String string) {
         if (string==null || string.isBlank()) {
             throw new IllegalArgumentException("Информация не указана");}
         }
     }

