package org.example.ExcercicesNotés;

public class Utilisateur {
    private String firstName;
    private String lastName;
    private int age;

    public Utilisateur(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Nom: " + lastName);
        System.out.println("Prénom: " + firstName);
        System.out.println("Âge: " + age);
    }

    public boolean isMajor() {
        return age >= 18;
    }

    public void wishBirthday() {
        System.out.println("Bon anniversaire " + firstName + " !");
    }
}
