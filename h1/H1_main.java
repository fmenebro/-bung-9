package h1;

public class H1_main {
    public static void main(String[] args) {
        PrioListe pl = new PrioListe();
        Patient a = new Patient("A", 1);
        Patient b = new Patient("B", 10);
        Patient c = new Patient("C", 5);
        Patient d = new Patient("D", 7);

        pl.addPatient(a);
        pl.addPatient(b);
        pl.addPatient(c);
        pl.addPatient(d);

        pl.getNextPatient();
    }
}
