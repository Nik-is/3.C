public class Kalkulacka {
    public static void main(String[] args) {
        Ctverec ct1 = new Ctverec(7);
        ct1.info();
        Ctverec ct2 = new Ctverec();
        ct2.info();

    }
}

/**
 * Třída pro práci se čtverci
 */
class Ctverec {
    double a;

    /**
     * Konstruktor, kterému zadám parametr a on nastaví stranu na tuto hodnotu
     * @param a
     */
    public Ctverec(int a) {
        this.a = a;
    }

    /**
     * Bezparametrický konstruktor
     */
    public Ctverec() {
        a = 5;
    }
    /**
     * Vypočítá a vypíše obvod čtverce
     */
    void obvod() {
        System.out.println("Obvod tohoto čtverce je " + (4 * a));
    }

    /**
     * Vypočítá a vypíše obsah čtverce
     */
    void obsah() {
        System.out.println("Obsah tohoto čtverce je " + (a * a));
    }

    /**
     * Vypíše informace o čtverci
     */
    void info() {
        System.out.println("Já jsem čtverec o straně " + a);
        obsah();
        obvod();
    }
}