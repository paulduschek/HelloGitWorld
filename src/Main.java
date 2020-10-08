import java.util.Scanner;

/**
 * @author Paul Duschek
 * @version 1.0, 8.10.20
 */

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.printf("Geben Sie 2 zu addierende Zahlen ein:%n");
            int val1 = sc.nextInt();
            int val2 = sc.nextInt();

            System.out.printf("Ergebnis: %d", val1 + val2);
        }
        catch (Exception ex)
        {
            System.out.println("Ungültige Eingabe, versuchen Sie es noch einmal!");
        }
    }

}