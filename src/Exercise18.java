
import java.util.Scanner;
import java.util.regex.Matcher;
import  java.util.regex.Pattern;

public class Exercise18 {


//    Napisz program, który pobierze od użytkownika tekst (zmienna typu String) i sprawdzi, czy użytkownik kichnął,
//    tzn. czy w podanym tekście znajduje się tekst „aaaa psik” z dowolnie wieloma, ale minimum jedną literą ‘a’
//    na początku wyrażenia (czyli kichnięciem jest zarówno „a psik”, jak i „aaaaaaaaaa psik”).
//    Podpowiedź: użyj wyrażenia regularnego z odpowiednim kwantyfikatorem.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        boolean userSneeze = doesUserSneeze(userInput);
        if(userSneeze){
            System.out.println("użytkownik kichnął");
        }else {
            System.out.println("użytkownik nie kichnął");
        }
    }

        private static boolean doesUserSneeze(String userInput){
          Pattern sneezePattern = Pattern.compile("a+psik");
            Matcher matcher = sneezePattern.matcher(userInput);
            return matcher.find();


        }

    }
