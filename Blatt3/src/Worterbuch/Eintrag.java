package Worterbuch;

public class Eintrag {
    private String wortDeutsch;
    private String wortEnglisch;

    public Eintrag(String wortDeutsch, String wortEnglisch) {
        this.wortDeutsch = wortDeutsch;
        this.wortEnglisch = wortEnglisch;
    }

    public String getWortDeutsch() {
        return wortDeutsch;
    }

    public String getWortEnglisch() {
        return wortEnglisch;
    }

    /*
    Compares if two entries are completely equal

    @pre the type of the entries is Eintrag
    @param o Object of type Eintrag which is compared to the local values of this entry
    @return true if the entry is equal, false otherwise
    */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Eintrag))
            return false;
        Eintrag that = (Eintrag) o;

        //ToDo Implement eqals according to the specification
        return false;
    }

    @Override
    public int hashCode() {
        return wortDeutsch.hashCode();
    }
}
