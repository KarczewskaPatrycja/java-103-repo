import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class Exercise17 {
    public static void main(String[] args) {

//        Napisz program, który pobierze od użytkownika datę najbliższych Twoich zajęć w SDA i obliczy ile dni do nich pozostało.
//        Podpowiedź:datę wczytaj jako typ String i przeparsuj na LocalDate. Obecną datę pobierz z metody LocalDate.now().



        // aktualna data

                LocalDate today = LocalDate.now();

                System.out.println(today.toString());


         // data kolejnych zajęć


                Scanner scanner = new Scanner(System.in);
                 System.out.println("podaj datę kolejnych zajęć");
                String dateOfClasses =scanner.nextLine();


        //różnica pomiędzy datami

                LocalDate dateClasses = LocalDate.parse(dateOfClasses);

                System.out.println(dateClasses);

             //   Duration difference = Duration.between(dateClasses,today);



        int difference = (int) ChronoUnit.DAYS.between(today,dateClasses);

               System.out.println("The differencece in days is : " + difference);
            }
    }

