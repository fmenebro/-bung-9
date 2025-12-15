package h2;

public class H2_main {
    public static void main(String[] args) {
        Bus a = new Bus();
        Bus b = new Bus();

        Passenger p1 = new Passenger("Anna", 2, true);
        Passenger p2 = new Passenger("Ben", 1, true);
        Passenger p3 = new Passenger("Clara", 3, false);

        a.enterBus(p1);
        a.enterBus(p2);
        a.enterBus(p3);

        a.nextStop();
        a.transferPassengers(b, new String[]{"Anna", "Clara"});
    }
}
