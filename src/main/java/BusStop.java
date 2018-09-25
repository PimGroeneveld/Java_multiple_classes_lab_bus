import java.util.ArrayList;

public class BusStop {
    private ArrayList<Person> queue;
    private String busStopName;

    public BusStop(String busStopName){
        this.queue = new ArrayList<>();
        this.busStopName = busStopName;
    }

    public int getPersonCount() {
        return this.queue.size();
    }

    public void addPerson(Person person) {
        this.queue.add(person);
    }

    public Person removePerson(Person person) {
        return this.queue.remove(0);
    }
}
