import java.util.Scanner;

public class Exercises22 {
    public static void main(String[] args) {


//        Algorymy liniowe na tablicy link. Zaimplementuj algortymy liniowe na tablicach z linku:
//
//       1 Suma elementów tablicy
//       2 Zliczanie wystąpień zadanego elementu w tablicy
//       3 Szukanie elementu minimalnego/maksymalnego w talicy
//       4 Szukanie elementu w tablicy, Dla chętnych: Szukanie elementu z wartownikiem


        int[] array = {1, 4, 3, 4, 5, 6};

//  1 Suma elementów tablicy

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];
        }
        System.out.println(sum);

//   2 Zliczanie wystąpień zadanego elementu w tablicy

        int aSum = 0;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (a == array[i]) {

                aSum++; //dodaje 1

            }

        }
        System.out.println(aSum);

        //       3 Szukanie elementu minimalnego/maksymalnego w talicy

        int resultMIN = 0;

        for (int i = 0; i < array.length; i++) {

            resultMIN = array[0];

            if (array[i] < resultMIN) {

                resultMIN = array[i];
            }

        }
        System.out.println(resultMIN);

        int resultMAX = 0;

        for (int i = 0; i < array.length; i++) {

            resultMAX = array[0];

            if (array[i] > resultMAX) {

                resultMAX = array[i];
            }

        }
        System.out.println(resultMAX);


//       4 Szukanie elementu w tablicy, Dla chętnych: Szukanie elementu z wartownikiem

        int n = scanner.nextInt();
        int[] array1 = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            array1[i] = array[i];

        }

        array1[array1.length - 1] = n;

        for (int i = 0; i < array1.length; i++) {

            if (array1[i] == n) {
                if (i == array1.length - 1) {
                    System.out.println("nie odnaleziono elementu o wartości "+n);

                } else {
                    System.out.println("odnaleziono element o wartości" +n + "o indeksie" +i);
                    break;

                }
            }
        }
    }
}


