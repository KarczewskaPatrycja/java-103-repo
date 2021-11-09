import java.util.Arrays;
import java.util.Scanner;

public class Exercises25 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        char[] userText = scanner.nextLine().toCharArray();

        int n = scanner.nextInt();

        System.out.println(Arrays.toString(userText));

        encryption(userText);

        System.out.println();

        decryption(userText);



        } public static void encryption(char[] userText) {

        for (int i = 0; i < userText.length; i++) {


            if (userText[i] != ' ') {


                int index = (int) userText[i] + 3;
                userText[i] = (char) index;

                System.out.print(userText[i] + " ");

            } else {
                System.out.print(' ');

            }
        }
    } public static void decryption(char[] userText) {

        for (int i = 0; i < userText.length; i++) {


            if (userText[i] != ' ') {


                int index = (int) userText[i] - 3;
                userText[i] = (char) index;

                System.out.print(userText[i] + " ");

            } else {
                System.out.print(' ');


            }
        }
    }
    }


