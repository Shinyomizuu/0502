import java.util.Scanner;

public class IP_Umwandlung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie ein wie viele Bewertungen Sie haben möchten: ");
        String ip_adresse = scanner.next();

        String[] ip_adresse_array = ip_adresse.split("\\.");

        int[]ip_nummern = new int[ip_adresse_array.length];
        for (int i = 0; i < ip_adresse_array.length; i++){
            ip_nummern[i] = Integer.parseInt(ip_adresse_array[i]);
        }

        System.out.print("Darstellung in Dezi: ");
        for (int nummer : ip_nummern){
            System.out.print(nummer + " ");
        }

        System.out.print("\nDarstellung in Okta: ");
        for (int nummer : ip_nummern){
            String oktal = Integer.toOctalString(nummer);
            System.out.print(oktal + " ");
        }

        System.out.print ("\nDarstellung in Hexa: ");
        for (int nummer: ip_nummern) {
            String hexa = Integer.toHexString(nummer);
            System.out.print(hexa);
        }

        System.out.print("\nDarstellung in Binär: ");
        for (int nummer : ip_nummern) {
            String bin = Integer.toBinaryString(nummer);
            System.out.print(bin);
        }
    }
}