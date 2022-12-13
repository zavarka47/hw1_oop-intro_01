public class Human {
    String name;
    int yearOfBirth;
    String town;
    String jobTitle;
    Human (String name, int yearOfBirth, String town, String jobTitle) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.jobTitle = jobTitle;
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

}
