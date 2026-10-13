import java.util.Scanner;

public class SpocitejKruh {
    public static void main(String[] args) {
        Scanner otrok = new Scanner(System.in);
        System.out.println("Kolik kruhů mám vytvořit?");
        int pocetKruhu = otrok.nextInt();
        Kruh[] poleKruhu = new Kruh[pocetKruhu];

        for (int i = 0; i < poleKruhu.length; i++) {
            System.out.println("Zadej poloměr "+(i+1)+". kruhu:");
            double polomer = otrok.nextDouble();
            poleKruhu[i] = new Kruh(polomer);
        }

        for (int i = 0; i < poleKruhu.length; i++) {
            System.out.println();
            System.out.println("Poloměr kruhu je "+ poleKruhu[i].getPolomer()+ " a průměr "+ poleKruhu[i].prumer());
            System.out.println("Obvod kruhu je "+ poleKruhu[i].obvod());
            System.out.println("Obsah kruhu je "+ poleKruhu[i].obsah());
        }

        otrok.close();
    }
}