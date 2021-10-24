import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int h = scanner.nextInt();


        String[][] arr = new String[h][l];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (i == j && j <= h) {

                    System.out.print(arr[i][j] = "*");
                }

                if (j == 2 * h - i - 1 && j >= h) {

                        System.out.print(arr[i][j] = "*");
                } else {
                        System.out.print(" ");

                    }

                }
                System.out.println();

            }
            System.out.println();
        }
    }
//
//    public static void main(String[] args) {
//
//        printWave(2, 2000);
//
//    }
//
//    public static void printWave(int height,int count) {
//        int l = height - 1;
//
//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j < count; j++) {
//
//
//                if (j % (height * 2) == l) {
//                    System.out.print("*");
//                } else if (j % (height * 2) == height + i) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            l--;
//            System.out.println();
//        }
//    }
//}

//
//    public static void main(String[] args) {
//        printWave(100);
//    }
//
//    private static void printWave(int n) {
//        printSimpleLine(0, n);
//        printComplexLine(1, 4, 2, n);
//        printComplexLine(2, 2, 4, n);
//        printSimpleLine(3, n);
//    }
//
//    static void printComplexLine(int spacesBefore, int firstDistance, int secondDistance, int n) {
//        printSpaces(spacesBefore);
//
//        int distanceCounter = 0;
//        int acutalDistance = firstDistance;
//
//        for (int i = 0; i < n - spacesBefore; i++) {
//            if(distanceCounter == 0){
//                System.out.print("*");
//            } else {
//                System.out.print(" ");
//            }
//
//            distanceCounter++;
//
//            if(distanceCounter == acutalDistance){
//                distanceCounter = 0;
//                if(firstDistance == acutalDistance){
//                    acutalDistance = secondDistance;
//                }else {
//                    acutalDistance = firstDistance;
//                }
//            }
//        }
//        System.out.println();
//    }
//
//
//
//
//
//
//    static void printSimpleLine(int spacesBefore, int n){
//        printSpaces(spacesBefore);
//
//        for (int i = 0; i < n - spacesBefore; i++) {
//            if(i % 6 == 0){
//                System.out.print("*");
//            } else {
//                System.out.print(" ");
//            }
//        }
//        System.out.println();
//    }
//
//    private static void printSpaces(int spacesBefore) {
//        for (int i = 0; i < spacesBefore; i++) {
//            System.out.print(" ");
//        }
//    }
//}
