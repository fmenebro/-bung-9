package h2;

public class Passenger {
    private String name;
    private int planned;
    private int visited;
    private boolean ticket;

    public Passenger(String name, int planned, boolean ticket) {
        this.name = name;
        this.planned = planned;
        this.ticket = ticket;
        this.visited = 0;
    }

    public void visit() {
        visited++;
    }

    public boolean shouldExit() {
        return planned == visited;
    }

    public boolean hasTicket() {
        return ticket;
    }

    public String getName() {
        return name;
    }
}
