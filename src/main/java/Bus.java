import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int countPassengers() {
        return this.passengers.size();
    }

    public void add(Person person) {
        if (this.capacity > this.passengers.size()){
            this.passengers.add(person);
        }
    }

    public Person removePassenger() {
        return this.passengers.remove(0);
    }
}
