import java.util.Scanner;

public class HelloVars {

    public static void main (String[] args){

        String naam = "Sebastiaan";
        String achternaam = "Walraven";
        int leerjaar = 1;
        double getal = 2.2;

        System.out.println(naam + " " + achternaam);

        System.out.println("Hello variables");

        Scanner scan = new Scanner(System.in);
        naam = scan.next();
        System.out.println(naam);



    }

}
