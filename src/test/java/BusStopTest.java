import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void before(){
        busStop = new BusStop("CodeClan Building");
        person = new Person();
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.getPersonCount());
    }

    @Test
    public void addPersonToQueue(){
        busStop.addPerson(person);
        assertEquals(1, busStop.getPersonCount());
    }

    @Test
    public void removePersonFromQueue(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.addPerson(person);
        assertEquals(3, busStop.getPersonCount());
        busStop.removePerson(person);
        assertEquals(2, busStop.getPersonCount());
    }



}
