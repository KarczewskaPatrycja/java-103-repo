import java.util.Arrays;

public class Exercises23 {

    public static void main(String[] args) {


//        Sortowanie bąbelkowe i inne algorytmy sortowania link
//        Zaimplementuj sortowanie bombelkowe na tablicy i na ArrayLiście


        int[] array = {5,4,3,2,5,4,3,2,1};

        bubblesort1(array);}

    private static void swap(int[] tablica, int i, int j) {
        int temp = tablica[i];
        tablica[i] = tablica[j];
        tablica[j] = temp;

    }
    public static void bubblesort1(int[] tablica) {
        for(int i = 0; i < tablica.length - 1; i++) {
            for(int j = 0; j < tablica.length - 1; j++) {
                if(tablica[j] > tablica[j + 1]) {
                    swap(tablica, j, j + 1);
                }
            }
        }
    }
}
//    public static int[] sort(int[] numbers) {
//        boolean changed = false;
//        for (int index = 0; index < numbers.length - 1; index++) {
//            int currentNumber = numbers[index];
//            int nextNumber = numbers[index + 1];
//            if (currentNumber > nextNumber) {
//                numbers[index] = nextNumber;
//                numbers[index + 1] = currentNumber;
//                changed = true;
//            }
//        }
//        return changed ? sort(numbers) : numbers;