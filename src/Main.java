public class Main {
    public static void main(String[] args) {

        System.out.println("\nEven numbers.");

        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("\nOdd numbers.");

        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }

        int sayi = 1;
        while (sayi < 10) {
            System.out.println(sayi);
            sayi += 2;
        }
        System.out.println("while döngüsü sonlandı.");

        System.out.println("\nShown odd numbers using do-while loop");
        int j = 1;
        do {
            j += 2;
            System.out.println(j);
        } while (j < 10);
    }

}
