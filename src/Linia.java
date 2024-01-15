class Linia {
    private int id;
    private Punt p1;
    private Punt p2;

    public Linia(Punt p1, Punt p2) {
        this.p1 = p1;
        this.p2 = p2;
    }


    public Punt getP1() {
        return p1;
    }

    public void setP1(Punt p1) {
        this.p1 = p1;
    }

    public Punt getP2() {
        return p2;
    }

    public void setP2(Punt p2) {
        this.p2 = p2;
    }

    public String toString() {
        return "Linia{p1: " + p1 + ", p2: " + p2 + "}";
    }
}
