package main.school_bk;

public class Student {

    private String firstName = "ime";
    private String lastName = "prezime";
    private int yearOfBirth;

    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.yearOfBirth = 0;

    }

    public Student(String customFirstName, String customLastName, int customYearOfBirth) {
        this.firstName = customFirstName;
        this.lastName = customLastName;
        this.yearOfBirth = customYearOfBirth;

    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String customFirstName) {
        this.firstName = customFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String customLastName) {
        this.lastName = customLastName;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void setYearOfBirth(int customYearOfBirth) {
        this.yearOfBirth = customYearOfBirth;
    }

    public void info() {
        System.out.println("First name:" + this.getFirstName());
        System.out.println("Last name:" + this.getLastName());
        System.out.println("Year of birth:" + this.getYearOfBirth());

    }
}
