import java.util.Scanner;


public class Exercise15 {
    public static void main(String[] args) {


        //Napisz program, który pobierze od użytkownika 10 dowolnie dużych liczb (zmiennych typu int) i wypisze te, które wystąpiły minimum dwukrotnie

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj 10 liczb:");
        int userInt1 = scanner.nextInt();
        int userInt2 = scanner.nextInt();
        int userInt3 = scanner.nextInt();
        int userInt4 = scanner.nextInt();
        int userInt5 = scanner.nextInt();
        int userInt6 = scanner.nextInt();
        int userInt7 = scanner.nextInt();
        int userInt8 = scanner.nextInt();
        int userInt9 = scanner.nextInt();
        int userInt10 = scanner.nextInt();


        int[] arrayUserInt = new int[10];
        arrayUserInt[0] = userInt1;
        arrayUserInt[1] = userInt2;
        arrayUserInt[2] = userInt3;
        arrayUserInt[3] = userInt4;
        arrayUserInt[4] = userInt5;
        arrayUserInt[5] = userInt6;
        arrayUserInt[6] = userInt7;
        arrayUserInt[7] = userInt8;
        arrayUserInt[8] = userInt9;
        arrayUserInt[9] = userInt10;


        int array = 0;


        for (int i = 0; i < arrayUserInt.length; i++) {
            for (int j = i+1; j < arrayUserInt.length; j++) {
                if (i != j && arrayUserInt[i] == arrayUserInt[j]) {

                    array = arrayUserInt[i];
                    System.out.println(array);
                    break;
                }
            }


        }
    }
}






