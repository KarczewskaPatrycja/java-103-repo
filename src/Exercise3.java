import java.util.Scanner;

public class Exercise3 {

    //    Napisz program służący do rozwiązywania równania kwadratowego. Program powinien pobrać trzy liczby całkowite
//    (współczynniki równania kwadratowego a, b, c) i wyliczyć pierwiastki x1, x2 równania
//    Jeśli delta ∆ wyjdzie ujemna, wypisz „Delta ujemna” i zakończ program.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj współczynniki równania kwadratowego:");
        System.out.println("Podaj a:");
        int a = scanner.nextInt();

        System.out.println("Podaj b:");
        int b = scanner.nextInt();

        System.out.println("Podaj c:");
        int c = scanner.nextInt();

        scanner.close();

        quadraticEquation(a, b, c);

    }

    static void quadraticEquation(int a, int b, int c) {

        float delta = (float) Math.pow(b, 2) - 4 * a * c;
        if (delta >= 0) {

            System.out.println(delta);

            float x1 = (-(float) b - (float) Math.sqrt(delta)) / (2 * a);
            System.out.println("x1=" + x1);


            float x2 = (-(float) b + (float) Math.sqrt(delta)) / (2 * a);
            System.out.println("x2=" + x2);
        } else {
            System.out.println("delta nie może być ujemna");

        }


    }
}
