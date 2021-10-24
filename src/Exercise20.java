import java.util.Random;
import java.util.Scanner;

public class Exercise20 {

//    Napisz program, który będzie z Tobą grał w „za dużo, za mało”. Na początku komputer losuje liczbę z zakresu od 0 do 100
//    (podpowiedź: skorzystaj z metody Random.nextInt()) a następnie czeka na podanie liczby przez użytkownika. Jeśli użytkownik poda liczbę większą,
//    niż wylosowana przez komputer, program powinien wypisać „za dużo” i czekać na podanie kolejnej liczby. Jeśli użytkownik poda liczbę mniejszą,
//    program powinien wypisać „za mało” i analogicznie czekać na następną liczbę.
//    Jeśli użytkownik poda odpowiednią wartość, to program powinien wypisać słowo „Bingo!” i zakończyć się.

// GRA : ZA DUŻO, ZA MAŁO

    //  Losowanie liczby z zakrsu od 0 do 100

    public static void main(String[] args) {


        Random random = new Random();
        int val1 = random.nextInt(101);
        System.out.println("Random Integer value : " + val1);

        //  Podanie liczby przez użytkownika

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int userInteger = scanner.nextInt();

        //  sprawdzenie liczby z liczbą losowaną

        while (val1 != userInteger) {

            if (userInteger > val1) {
                System.out.println("za dużo");

                System.out.println("Podaj liczbę:");
                userInteger = scanner.nextInt();
            } else {
                System.out.println("za mało");

                System.out.println("Podaj liczbę:");
                userInteger = scanner.nextInt();
            }
        }System.out.println("Bingo");
    }
}

