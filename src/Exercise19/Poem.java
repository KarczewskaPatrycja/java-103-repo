package Exercise19;
//        Napisz program, składający się z kilku klas:
//        a. Klasy Author, reprezentującą autora – pisarza wierszów, składającej się z pól surname oraz nationality (oba typu String)
//        b. Klasy Poem, reprezentującą wiersz, składającą się z pól creator (typu Author) oraz stropheNumbers (typu int – reprezentującej ilość zwrotek wiersza)
//        c. Klasy Main, w której znajdzie się metoda main, a w niej kod w którym:
//        i. Stworzysz trzy obiekty klasy Poem, uzupełniając go wszystkimi danymi (używając konstruktora lub setter’ów) i zapiszesz je w tablicy
//        ii. Wypiszesz nazwisko tego autora, który napisał wiersz o największej liczbie zwrotek (niech odpowiedź obliczy Twój program!)


public class Poem {
    //        b. Klasy Poem, reprezentującą wiersz, składającą się z pól creator (typu Author) oraz stropheNumbers (typu int – reprezentującej ilość zwrotek wiersza)


    private Author creator;
    private int stropheNumbers;


    public Author getCreator() {
        return creator;
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }

    public Poem(Author creator, int stropheNumbers){
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;


    }

    }


