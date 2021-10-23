import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

       // Napisz program, który pobierze od użytkownika liczbę n (typu int) i obliczy sumę szeregu harmonicznego od 1 do n


        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę całkowitą. n=");
        int n = scanner.nextInt();

        float sum = 0;
        for (int i = 1; i <= n; i++) {
             sum = sum + 1/(float)i;
        }

        System.out.println(sum);


    }
}
