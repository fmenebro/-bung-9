package h2;

import java.util.ArrayList;

public class Bus {
    private ArrayList<Passenger> passengers;

    public Bus() {
        passengers = new ArrayList<>();
    }

    public void enterBus(Passenger p) {
        passengers.add(p);
    }

    private void exitBus() {
        for (int i = 0; i < passengers.size(); i++) {
            if (passengers.get(i).shouldExit()) {
                passengers.remove(i);
                i--;
            }
        }
    }

    public void nextStop(Passenger[] boarding) {
        for (Passenger p : passengers) {
            p.visit();
        }
        exitBus();
        for (Passenger p : boarding) {
            passengers.add(p);
        }
    }

    public void nextStop() {
        for (Passenger p : passengers) {
            p.visit();
        }
        exitBus();
    }

    public ArrayList<Passenger> findPassengersWithoutTickets() {
        ArrayList<Passenger> removed = new ArrayList<>();
        for (int i = 0; i < passengers.size(); i++) {
            if (!passengers.get(i).hasTicket()) {
                removed.add(passengers.remove(i));
                i--;
            }
        }
        return removed;
    }

    public void transferPassengers(Bus otherBus, String[] passengerNames) {
        for (String name : passengerNames) {
            for (int i = 0; i < passengers.size(); i++) {
                if (passengers.get(i).getName().equals(name)) {
                    otherBus.enterBus(passengers.remove(i));
                    break;
                }
            }
        }
    }
}
