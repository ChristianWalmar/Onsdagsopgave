import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    int[] karakterListe = new int[7];

    System.out.println("Skriv dine karaterer: ");

    karakterListe[0] = myScanner.nextInt();
    karakterListe[1] = myScanner.nextInt();
    karakterListe[2] = myScanner.nextInt();
    karakterListe[3] = myScanner.nextInt();
    karakterListe[4] = myScanner.nextInt();
    karakterListe[5] = myScanner.nextInt();
    karakterListe[6] = myScanner.nextInt();

    for (int i = 0; i<karakterListe.length; i++){
      System.out.println("Karakter " + i + ": "  + (karakterListe[i]));
    }
  }
}
