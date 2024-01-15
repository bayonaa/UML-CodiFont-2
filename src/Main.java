public class Main {
    public static void main(String[] args) {
        Punt p1 = new Punt(3, 5);
        Punt p2 = new Punt(6, 8);
        Punt p3 = new Punt(9, 11);

        Linia l1 = new Linia(p1, p2);
        Linia l2 = new Linia(p1, p3);

        Area a1 = new Area(p1, p2, p3);
        Area a2 = new Area(l1, l2);

        System.out.println(a1);
        System.out.println(a2);
    }
}
