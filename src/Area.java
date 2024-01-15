import java.util.ArrayList;

public class Area {
    private int id;
    private ArrayList<Punt> punts;

    public Area(Punt p1, Punt p2, Punt p3) {
        this.punts = new ArrayList<>();
        punts.add(p1);
        punts.add(p2);
        punts.add(p3);
    }

    public Area(Linia l1, Linia l2) {
        this.punts = new ArrayList<>();
        punts.add(l1.getP1());
        punts.add(l1.getP2());
        punts.add(l2.getP1());
        punts.add(l2.getP2());
    }

    public String toString() {
        return "Linia{punts: " + punts + "}";
    }
}
