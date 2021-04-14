import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println(karakter("dansk"));
  }

  public static int karakter(String karakter) {
    int[] karakterListe = new int[7];
    karakterListe[0] = 7;
    karakterListe[1] = 10;
    karakterListe[2] = 4;
    karakterListe[3] = 4;
    karakterListe[4] = 12;
    karakterListe[5] = 10;
    karakterListe[6] = 4;

    switch (karakter){
      case "historie":
        return karakterListe[0];
      case "idræt":
        return karakterListe[1];
      case "dansk":
        return karakterListe[2];
      case "matematik":
        return karakterListe[3];
      case "religion":
        return karakterListe[4];
      case "engelsk":
        return karakterListe[5];
      case "biologi":
        return karakterListe[6];
      default:
        return 0;
    }
  }
}
