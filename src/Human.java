public class Human {
    String name;
    int yearOfBirth;
    String town;
    Human (String name, int yearOfBirth, String town) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
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

    public String toString () {
        return "Hello! My mane is " + name + " I`m from " + town + " I was " + yearOfBirth + " let's get acquainted!";

    }

}
