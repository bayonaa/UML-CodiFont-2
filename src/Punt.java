class Punt {
    private int id;
    private double x;
    private double y;

    public Punt(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "Punt{x: " + x + ", y: " + y + "}";
    }
}
