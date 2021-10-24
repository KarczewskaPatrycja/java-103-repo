import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

//        Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int) i obliczy liczbę Fibonacciego o wskazanym indeksie.
//        Przykładowo, jeśli użytkownik poda liczbę 5, Twój program powinien wypisać piątą liczbę Fibonacciego.
//        Kolejne liczby Fibonacciego powstają poprzez zsumowanie dwóch poprzednich liczb Fibonacciego.

// 0. Napisz metodę statyczną, która wypisze w konsoli kolejne wyrazy ciągu Fibonacciego -> 1,1,2,3,5,8,13,21
        // dla n =0 F[0]=0
        // dla n =1 F[1]=1
        // dla n >1 F[n-1]+F[n-2]


        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę całkowitą. i=");
        int i = scanner.nextInt();


        int[] Array = new int[i];

        for (int n = 0; n <= i-1; n++) {
            if (n == 0) {
                Array[n] = 0;
            }
            if (n == 1) {
                Array[n] = 1;
            }
            if (n >= 2) {
                Array[n] = Array[n - 1] + Array[n - 2];
            }
        }
        System.out.print(Array[i-1]);
    }
}
