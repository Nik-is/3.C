import java.util.Scanner;
public class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Napiš kus textu");
        String str = sc.nextLine();
        str.trim();
        System.out.println("Napsal jsi\n" + str);
    }
}