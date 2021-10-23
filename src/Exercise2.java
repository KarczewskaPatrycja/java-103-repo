import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
//Napisz program obliczający BMI (Body Mass Index) i sprawdzający, czy jest ono w normie. Program powinien wczytywać
// od użytkownika dwie zmienne: wagę w kilogramach (typ float) oraz wzrost w centymetrach (typ int).
//Optymalny zakres BMI wynosi od 18.5 do 24.9, wartości mniejsze lub większe są wartościami nieoptymalnymi.
// Twój program powinien wypisać „BMI optymalne” lub „BMI nieoptymalne”, zgodnie z powyższymi założeniami.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wagę w kg:");
        float userWeight = scanner.nextFloat();
        System.out.println("Podaj wzrost w cm:");
        int userHeight = scanner.nextInt();
        scanner.close();


        BodyMassIndex(userWeight,userHeight);

    }

    public static void BodyMassIndex(float Weight, int Height){


            float BMI =Weight / (float) Math.pow((Height),2)*10000;


            if (BMI>=18.5 && BMI<=24.9 ){
                System.out.println("BMI optymalne");
            }else{
                System.out.println("BMI nieoptymalne");
            }

        System.out.println(BMI);

    }
}
