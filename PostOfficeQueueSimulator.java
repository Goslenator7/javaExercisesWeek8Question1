import javax.swing.*;
import java.util.LinkedList;

public class PostOfficeQueueSimulator {

    // Create linked list of Person objects, and collect them in the postOfficeQueue list
    private LinkedList <Person> postOfficeQueue = new LinkedList<Person>();

    // Add a person to the queue
    public void add(Person person) {
        this.postOfficeQueue.addLast(person);
    }

    // Serve (remove) the first person in the queue
    public void serve() {
        this.postOfficeQueue.removeFirst();
    }

    // Show the length of the queue
    public void queueLength() {
        JOptionPane.showMessageDialog(null,"Queue size is "+this.postOfficeQueue.size()+".");
    }

    // Print the names of all the people in the queue
    public void printQueue() {
        for(Person tempPerson : postOfficeQueue) {
            tempPerson.printDetails();
        }
    }

    // Print the name of the person at position x in the queue
    public void whoseAt(int x) {
        JOptionPane.showMessageDialog(null, this.postOfficeQueue.get(x-1).getPersonName());
    }

    // Print the name of the first person in the queue
    public void whoseAtFront() {
        String nextPerson = "The next person in the queue is "+this.postOfficeQueue.peekFirst().getPersonName()+".";
        JOptionPane.showMessageDialog(null, nextPerson);
    }

}
