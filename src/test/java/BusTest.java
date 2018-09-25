import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void before(){
        bus = new Bus("The Pub", 3);
        person = new Person();
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void addPassenger(){
        bus.add(person);
        assertEquals(1, bus.countPassengers());
    }

    @Test
    public void cannotAddPassengerDueToFullCap(){
        bus.add(person);
        bus.add(person);
        bus.add(person);
        bus.add(person);
        bus.add(person);
        assertEquals(3, bus.countPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.add(person);
        bus.add(person);
        bus.add(person);
        assertEquals(3, bus.countPassengers());
        bus.removePassenger();
        assertEquals(2, bus.countPassengers());
    }

}
