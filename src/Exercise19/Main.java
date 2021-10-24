package Exercise19;

public class Main {
    public static void main(String[] args) {

//        c. Klasy Main, w której znajdzie się metoda main, a w niej kod w którym:
//        i. Stworzysz trzy obiekty klasy Poem, uzupełniając go wszystkimi danymi (używając konstruktora lub setter’ów) i zapiszesz je w tablicy
//        ii. Wypiszesz nazwisko tego autora, który napisał wiersz o największej liczbie zwrotek (niech odpowiedź obliczy Twój program!)


        Author creator1 = new Author("autor jakiś tam 1 ", "AAA");
        Author creator2 = new Author("autor jakiś tam 2", "BBB");
        Author creator3 = new Author("autor jakiś tam 3", "CCC");

        Poem poem1 = new Poem(creator1, 5);
        Poem poem2 = new Poem(creator2, 10);
        Poem poem3 = new Poem(creator3, 15);

        Poem[] arrayPoem = {poem1, poem2, poem3};

        printPoemArray(arrayPoem);
        maxStropheNumbers(arrayPoem);
    }

    static void printPoemArray(Poem[] arrayPoem) {
        for (int i = 0; i < arrayPoem.length; i++) {
//            System.out.println(arrayPoem[i].getStropheNumbers());
//            System.out.println(arrayPoem[i].getCreator().getSurname());
//            System.out.println(arrayPoem[i].getCreator().getNationality());
        }
    }


    static void maxStropheNumbers(Poem[] arrayPoem) {

       var creator =  arrayPoem[0].getCreator().getSurname();
        var max = arrayPoem[0].getStropheNumbers();
        // sprawdzamy pozostałe elementy tablicy


        for (int i = 1; i < arrayPoem.length; i++) {
            if (arrayPoem[i].getStropheNumbers() >= max) {
                max = arrayPoem[i].getStropheNumbers();
                 creator =  arrayPoem[i].getCreator().getSurname();

            }
        }
        System.out.println(max);
        System.out.println(creator);
    }
}

