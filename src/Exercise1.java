import java.util.Scanner;

public class Exercise1 {
    //Napisz program, który pobierze od użytkownika średnicę okręgu (zmienną typu float) i
    // obliczy obwód tego okręgu. Do obliczeń przyjmij najpierw π = 3.14,
    // a następnie skorzystaj z wbudowanej klasy Math i znajdującej się tam stałej PI.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj średnicę okręgu w cm");
        float userInput = scanner.nextFloat();

        scanner.close();

        float pi = 3.14f;
        float obwodOkregu = pi * userInput;
        System.out.println("obwód okręgu to: "+obwodOkregu);

// PI definiowane za pomocą funkcji Math

        double cir =  Math.PI * userInput;
        System.out.println("obwód okręgu to: "+cir);






    }


}
