import java.util.Scanner;

public class SumaZnamenki {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj čiju sumu znamenki želiš izračunati:");
        int broj = 356;
        int privremeniBroj = Math.abs(broj);
        int sumaZnamenki = 0;

        while (privremeniBroj > 0) {
            //356 : 10 = 35 -> cjelobrojno dijeljenje
            // 6 -> modulo odnosno ostatak pri dijeljenju %
            // normalno dijeljenje = 35.6
            //35 : 10 = 3 -> cjelobrojno dijeljenje
            // 5  -> ostatak pri dijeljenju %
            // 3 : 10 = 0 -> cjelobrojno dijeljenje
            // 3  -> ostatak pri dijeljenju %
            int zadnjaZnamenka = privremeniBroj % 10;
            sumaZnamenki += zadnjaZnamenka;
            privremeniBroj = privremeniBroj / 10; //cjelobrojno dijeljenje //
        }

        System.out.println("Zbroj znamenki broja: "+ broj + " jednak je: " + sumaZnamenki);
    }
}
