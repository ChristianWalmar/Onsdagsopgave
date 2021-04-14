import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println(karakter());
  }

  public static int karakter() {
    int[] karakterListe = new int[7];

    karakterListe[0] = 7;
    karakterListe[1] = 10;
    karakterListe[2] = 4;
    karakterListe[3] = 4;
    karakterListe[4] = 12;
    karakterListe[5] = 10;
    karakterListe[6] = 4;

    return karakterListe.length;
  }
}
