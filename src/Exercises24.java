import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercises24 {

    public static void main(String[] args) {


        System.out.println("Podaj kwotę");
        Scanner sc = new Scanner(System.in);
        int kwota = sc.nextInt();
        int reszta = kwota;
        Integer [] nominaly = {50, 100, 200, 20, 10, 5, 2, 1};
        //sortowanie w przypadku rosnącym a następnie malejącym
         Arrays.sort(nominaly, Collections.reverseOrder());

        System.out.println(Arrays.toString(nominaly));


        while (kwota >= 0) {
            for (int i = 0; i < nominaly.length; ++i) {
                if (kwota > nominaly[i] && kwota !=0) {
                    int liczbaBanknotow = kwota / nominaly[i];
                    kwota = kwota % nominaly[i];

                    System.out.println(liczbaBanknotow);
                    System.out.println(nominaly[i]);

                    }
                }
            }
        }
    }
