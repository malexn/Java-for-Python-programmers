import java.util.Scanner;
import java.util.Arrays;
// import java.io.File;
// import java.io.FileNotFoundException;

public class Enigma {
   public static void main(String[] args){
      
      String kryptotext1, klartext1;

      //File file = new File("/Users/alexander/Documents/JavaP/Enigma/kth.javap.enigma/enigma.1.in");
      //Scanner sc = new Scanner(file);

      Scanner sc = new Scanner(System.in);
      
      try {
         kryptotext1 = sc.next();
         klartext1 = sc.next();
      }
      finally {
         if(sc != null) {
            sc.close();
         }
      }
      
      String[] kryptoText = kryptotext1.split("");
      String[] klarText = klartext1.split("");
      String startPositions = "";
      
      for (int i = 0; i <= (kryptoText.length - klarText.length); i++) {
         boolean hit = false;
         for (int j = 0; j < klarText.length; j++) {
            if (kryptoText[i+j].equals(klarText[j])) {
               hit = true;
               break;
            }    
         }

         if(!hit) {
            startPositions += (i+1) + " ";
         } 
      }

      if(startPositions.length() == 0) {
         startPositions = "-1";
      }

      System.out.println(startPositions);
   }
}
