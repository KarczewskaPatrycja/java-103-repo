import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercise12 {


//    Napisz program, który pobierze od użytkownika tekst (zmienną typu String)
//    i policzy jakim procentem wszystkich znaków tekstu był znak spacji

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst:");
        String userString = scanner.nextLine();


        String replaceString=userString.replaceAll("\\s","");
        System.out.println(replaceString.length());
        System.out.println(userString.length());


        int a = (userString.length()-replaceString.length());
        float b = (float)a/ (float) userString.length()*100;

        System.out.println(b);

     }

 }








