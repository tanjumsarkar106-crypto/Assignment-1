
public class Main {
    public static void main(String[] args) {
        
        Coordinate c1 = new Coordinate(23.81, 90.41);
        Coordinate c2 = new Coordinate(51.50, -0.12);

        
        Schedule s1 = new Schedule(10, 30);
        Schedule s2 = new Schedule(18, 45);

        
        Airport a1 = new Airport("Dhaka Airport", c1);
        Airport a2 = new Airport("London Airport", c2);

        
        Flight f1 = new Flight("BG-101", 250, a1, s1, a2, s2);

      
        System.out.println("Flight ID: " + f1.getFlightId());
        System.out.println("Capacity: " + f1.getCapacity());
        System.out.println("From: " + f1.getDepartureFrom().getName() + " at " + f1.getDepartureTime().getHour() + ":" + f1.getDepartureTime().getMinute());
        System.out.println("To: " + f1.getFlyingTo().getName() + " at " + f1.getArrivalTime().getHour() + ":" + f1.getArrivalTime().getMinute());
    }
}


class Coordinate {
    private double longitude, latitude;
    public Coordinate(double la, double lo) { this.latitude = la; this.longitude = lo; }
    public double getLongitude() { return longitude; }
    public double getLatitude() { return latitude; }
}

class Schedule {
    private int hour, minute;
    public Schedule(int h, int m) { this.hour = h; this.minute = m; }
    public int getHour() { return hour; }
    public int getMinute() { return minute; }
}

class Airport {
    private String name;
    private Coordinate location;
    public Airport(String n, Coordinate c) { this.name = n; this.location = c; }
    public String getName() { return name; }
}

class Flight {
    private String flightId;
    private int capacity;
    private Airport departureFrom, flyingTo;
    private Schedule departureTime, arrivalTime;

    public Flight(String id, int cap, Airport from, Schedule dep, Airport to, Schedule arr) {
        this.flightId = id;
        this.capacity = cap;
        this.departureFrom = from;
        this.departureTime = dep;
        this.flyingTo = to;
        this.arrivalTime = arr;
    }
    public String getFlightId() { return flightId; }
    public int getCapacity() { return capacity; }
    public Airport getDepartureFrom() { return departureFrom; }
    public Airport getFlyingTo() { return flyingTo; }
    public Schedule getDepartureTime() { return departureTime; }
    public Schedule getArrivalTime() { return arrivalTime; }
}