import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Pilot pilot;

    private CabinCrewMember crewMember1;
    private CabinCrewMember crewMember2;
    private ArrayList<CabinCrewMember> cabinCrewMembers;

    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private int flightNumber;
    private String destination;
    private String departureLocation;
    private String departureTime;

    private Flight flight1;

    @Before
    public void before(){
        pilot = new Pilot("Chris", CabinCrewRanks.CAPTAIN,"1152");
        crewMember1 = new CabinCrewMember("Elizabeth", CabinCrewRanks.PURSER);
        crewMember2 = new CabinCrewMember("Tim", CabinCrewRanks.FLIGHT_ATTENDANT);
        cabinCrewMembers = new ArrayList<CabinCrewMember>();
        cabinCrewMembers.add(crewMember1);
        cabinCrewMembers.add(crewMember2);
        passenger1 = new Passenger("Dan", 2);
        passenger2 = new Passenger("Richard", 3);
        passenger2 = new Passenger("Louise", 3);
        passengers = new ArrayList<Passenger>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        plane = new Plane(PlaneType.BOEING545);
        flight1 = new Flight(pilot, cabinCrewMembers, passengers, plane, 212,"EDI", "LDN", "1645");
    }

    @Test
    public void hasPilot(){
        assertEquals("Chris", flight1.getPilot().getName());
    }

    @Test
    public void hasCrewMembers(){
        assertEquals(2, flight1.getCabinCrewMembers().size());
    }

    @Test
    public void hasPassengers(){
        assertEquals(2, flight1.getPassengers().size());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals(212, flight1.getFlightNumber());
    }

    @Test
    public void canAddPassengers(){
        flight1.addPassengerToFlight(passenger3);
        assertEquals(3, flight1.getPassengers().size());
    }

    @Test
    public void canGetEmptySeats(){
        assertEquals(118, flight1.getEmptySeats());
    }
}
