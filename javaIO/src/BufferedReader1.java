import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader1{


   public static void main (String args[]) {
      String datua;
      int zbk;
     
      BufferedReader irakurketa = new BufferedReader(new InputStreamReader(System.in));
      
      try {

         System.out.println("Idatzi textua(hitza, esaldia edo zenbakiak ): ");
         datua = irakurketa.readLine();
         System.out.println("Idatzitakoa: " + datua);
         System.out.println("Idatzi karaktere bat: ");
         zbk = irakurketa.read();
         System.out.println("Idatzitako karakterearen ASCII kodea: "+zbk);

      } catch (IOException ErrorDeLectura) {

          System.out.println(ErrorDeLectura);
      }
   }
	
}