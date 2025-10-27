public class WhileDoWhile {
    public static void main(String[] args) {

        int a = 8;
    /*    while (a > 15) {
            System.out.println(a);
            a--; // -- smanjuje vrijednost varijable za 1
           --a; // -- smanjuje vrijednost varijable za 1
        // a++; // ++ povećava vrijednost varijable za 1
        }
*/
        do {  //izvršava se makar 1 puta, prije nego se provjeri uvjet while
            System.out.println(a);
            a++;
        } while (a < 15);



    }
}
