package ro.itschool;

import java.sql.Struct;

public class User {

    public String lastName;
    public String firstName;
    public  int age;

    public User(String lastNameGiven, String firstNameGiven, int ageGiven) {
        lastName = lastNameGiven;
        firstName = firstNameGiven;
        age = ageGiven;
    }

    public User(String lastNameGiven, String firstNameGiven) {
        lastName = lastNameGiven;
        firstName = firstNameGiven;
        age = 1;
    }
    public User() {
        age = 0;
        lastName = "No name";
        firstName = "No name";
    }
}

