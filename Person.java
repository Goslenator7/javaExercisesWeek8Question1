import javax.swing.*;

public class Person {

    private String personName;

    // Constructor
    public Person(String personName) {
        this.personName = personName;
    }

    // Method to print the person's name
    public void printDetails() {
        JOptionPane.showMessageDialog(null, personName);
    }

    // Get and set
    public String getPersonName() {
        return this.personName = personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
