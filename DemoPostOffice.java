import javax.swing.*;

public class DemoPostOffice {
    public static void main(String[] args) {

        // Create a new linked list called myPostOffice
        PostOfficeQueueSimulator myPostOffice = new PostOfficeQueueSimulator();

        // Create new person objects and give them a name
        Person p1 = new Person("Tommy");
        Person p2 = new Person("Slavoj");
        Person p3 = new Person("Gertrude");
        Person p4 = new Person("Shaquille");

        // Add the new person objects to the list
        myPostOffice.add(p1);
        myPostOffice.add(p2);
        myPostOffice.add(p3);
        myPostOffice.add(p4);

        // Call these methods on the myPostOffice list
        myPostOffice.queueLength();
        myPostOffice.printQueue();
        myPostOffice.whoseAtFront();
        myPostOffice.serve();
        myPostOffice.printQueue();
        myPostOffice.whoseAtFront();
        myPostOffice.whoseAt(Integer.parseInt(JOptionPane.showInputDialog("Enter the queue position number to find a name: ")));

    }
}
