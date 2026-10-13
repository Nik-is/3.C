public class Obdelnik {
    private double stranaA;
    private double stranaB;

    public double getStranaA() {
        return stranaA;
    }

    public double getStranaB() {
        return stranaB;
    }

    public void setStranaA(double stranaA) {
        if (stranaA == 0) {
            stranaA = 1;
            System.out.println("Strana nemůže být 0, dal jsem tam 1");
        }

        if (stranaA < 0) {
            stranaA = Math.abs(stranaA);
            System.out.println("Asi ses spletl, to - tam nemělo být");
        }
        this.stranaA = stranaA;
    }

    public void setStranaA(double stranaA){
        this.stranaA = stranaA;
    }

    public void setStranaB(double stranaB) {
        this.stranaB = stranaB;
    }
    public Obdelnik() {
        stranaA = 2;
        stranaB = 3;
    }

    public Obdelnik(double strana) {
        stranaA = strana;
        stranaB = strana;
    }

    public Obdelnik(double stranaA, double stranaB) {
        this.stranaA = stranaA;
        this.stranaB = stranaB;
    }

    public double obvod() {
        return 2*(stranaA+stranaB);
    }

    public double obsah() {
        return (stranaA*stranaB);
    }

    public void info() {
        System.out.println("Obdelník se stranami "+stranaA+" a "+stranaB);
        System.out.println("Obvod "+obvod());
        System.out.println("Obsah "+obsah());
    }
}
