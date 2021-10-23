import java.util.Scanner;

public class Exercise8 {
//    Napisz program realizujący prosty kalkulator. Program powinien:
//    a. pobrać pierwszą liczbę (typu float)
//    b. pobrać jeden ze znaków: + - / *
//    c. pobrać drugą liczbę (typu float)
//    d. zwrócić wynik pobranego działania
//    Jeśli użytkownik poda znak inny niż obsługiwane, program powinien wypisać „Błędny znak”.
//    Jeśli wpisanego działania nie da się zrealizować (tj. jest niezgodne z zasadami matematyki),
//    to program powinien wypisać napis „Błąd”.

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę:");
        float a = scanner.nextFloat();


        System.out.println("Podaj jeden ze znaków +,-,/,*:");
        String znak = scanner.next();


        System.out.println("Podaj liczbę:");
        float b = scanner.nextFloat();
        scanner.close();

        if (znak.equals("/") || znak.equals("*") || znak.equals("-") || znak.equals("+")) {
            if (znak.equals("+")) {
                float result = a + b;
                System.out.println(result);
            }

            if (znak.equals("-")) {
                float result = a + b;
                System.out.println(result);
            }
            if (znak.equals("*")) {
                float result = a * b;
                System.out.println(result);
            }
            if (znak.equals("/")) {
                // sprawdzenie, czy druga zmienna nie jest zerem oraz
                if(b!=0) {

                    float result = a / b;
                    System.out.println(result);
                }else {
                    System.out.println("niezgodne z zasadami matematyki");
                }
                        }

        } else {
            System.out.println("Błędny znak");

        }
    }
}
