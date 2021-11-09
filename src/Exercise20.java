import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;

public class Exercise20 {

//    Napisz program, który będzie z Tobą grał w „za dużo, za mało”. Na początku komputer losuje liczbę z zakresu od 0 do 100
//    (podpowiedź: skorzystaj z metody Random.nextInt()) a następnie czeka na podanie liczby przez użytkownika. Jeśli użytkownik poda liczbę większą,
//    niż wylosowana przez komputer, program powinien wypisać „za dużo” i czekać na podanie kolejnej liczby. Jeśli użytkownik poda liczbę mniejszą,
//    program powinien wypisać „za mało” i analogicznie czekać na następną liczbę.
//    Jeśli użytkownik poda odpowiednią wartość, to program powinien wypisać słowo „Bingo!” i zakończyć się.


    //Czy użytkownik ma 18 lat
    //czy użytkownik wprowadził dodatnią liczbę
    //tylko możliwe 4 losowania


// GRA : ZA DUŻO, ZA MAŁO

    //  Losowanie liczby z zakrsu od 0 do 100

    public static void main(String[] args) {


        int differenceAge = checkAge18(printUserAge());
        check(differenceAge);


    }


    public static int checkAge18(String userAge) {

        LocalDate today = LocalDate.now();
        System.out.println(today.toString());

        LocalDate UserAge = LocalDate.parse(userAge);
        int difference = (int) ChronoUnit.YEARS.between(UserAge, today);
        return difference;
    }

    public static String printUserAge() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj datę urodzenia");
        String userAge = scanner.nextLine();
        return userAge;
    }

    public static void check(int differenceAge) {

        if (Math.abs(differenceAge) >= 18) {


            Random random = new Random();
            int val1 = random.nextInt(101);
            System.out.println("Random Integer value : " + val1);

            //  Podanie liczby przez użytkownika

            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę:");
            int userInteger = scanner.nextInt();

            //  sprawdzenie liczby z liczbą losowaną


            while (val1 != userInteger) {

                if (userInteger < 0) {
                    System.out.println("liczba nie może być ujemna");
                    System.out.println("Podaj liczbę:");
                    userInteger = scanner.nextInt();

                } else if (userInteger >= 0) {

                    if (userInteger > val1) {
                        System.out.println("za dużo");

                        System.out.println("Podaj liczbę:");
                        userInteger = scanner.nextInt();
                    } else {
                        System.out.println("za mało");

                        System.out.println("Podaj liczbę:");
                        userInteger = scanner.nextInt();
                    }
                }

            }

            System.out.println("Bingo");
        } else {
            System.out.println("nie masz 18 lat, wróć jak dorośniesz");
        }
    }

    public static void printMessageToUser(int numberOfRandom) {

        int count = 1;
        while (count <= numberOfRandom)

            System.out.println("podaj liczbę do sprawdzenia");

        count++;


    }
}






