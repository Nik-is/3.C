public class Kruh {

    private double polomer;

    public double getPolomer() {
        return polomer;
    }

    public void setPolomer(double polomer) {
        this.polomer = polomer;
    }

    public Kruh(double polomer) {
        this.polomer = polomer;
    }

    double obvod() {
        return 2*Math.PI*polomer;
    }

    double obsah() {
        return Math.PI*polomer*polomer;
    }

    double prumer() {
        return polomer*2;
    }
}
