package Exercise19;

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


