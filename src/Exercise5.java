import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {


//        Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int)
//        i wypisze wszystkie liczby pierwsze, większe od 1 i mniejsze od podanej liczby.


        printPrimes(100);
    }


    static void printPrimes(int n){
        for (int i = 2; i < n; i++) {
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n) {

        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
