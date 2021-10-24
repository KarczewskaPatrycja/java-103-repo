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
//        int userInt5 = scanner.nextInt();
//        int userInt6 = scanner.nextInt();
//        int userInt7 = scanner.nextInt();
//        int userInt8 = scanner.nextInt();
//        int userInt9 = scanner.nextInt();
//        int userInt10 = scanner.nextInt();

//        String userInt11 = scanner.nextLine();
//        String userInt12 = scanner.nextLine();
//
//
//        boolean match = userInt12.matches(userInt11);


        int[] arrayUserInt = new int[4];
        arrayUserInt[0] = userInt1;
        arrayUserInt[1] = userInt2;
        arrayUserInt[2] = userInt3;
        arrayUserInt[3] = userInt4;



        for (int i = 0; i < arrayUserInt.length; i++) {
            for (int j = 0; j < arrayUserInt.length; j++) {
                if (i!=j && arrayUserInt[i] == arrayUserInt[j]) {

                    int array =  arrayUserInt[i];
                    System.out.println(array);
                }
            }
        } //żle wyświetla wynik bo x 2
    }
}






