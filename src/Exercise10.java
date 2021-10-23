import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

//        Napisz program, który pobierze od użytkownika jedną liczbę dodatnią (typu int) i obliczy sumę cyfr podanej liczby.
//        Podpowiedź: aby rozpatrywać liczbę cyfra po cyfrze, możesz obliczać resztę
//        z dzielenia liczby przez 10 (aby uzyskać wartość ostatniej cyfry) i dzielić liczbę bez reszty przez 10 (żeby „przesuwać” się do kolejnej cyfry).


        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dodatnią liczbę całkowitą:");
        int userInt = scanner.nextInt();



        int sum =0;
        String numberAsString = Integer.toString(userInt);

        for (int i = 0; i <numberAsString .length() ; i++) {

             sum += userInt % 10;

             userInt = userInt /10;

        }
        System.out.println(sum);
    }

}
