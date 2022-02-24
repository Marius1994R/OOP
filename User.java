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

}
