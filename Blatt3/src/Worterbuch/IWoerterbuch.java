package Worterbuch;


public interface IWoerterbuch {

	
	void foreach();
    /*
    Adds a new Entry to the list of entries in the dictionary

    @pre list exists and is initialised
    @param eintrag corresponds to the type Eintrag and has two arguments - wordGerman and wordEnglish
    @post the list has one more entry
     */
    void fuegeHinzu(Eintrag eintrag);
    

    /*
    Removes an Entry from the entry list.

    @pre list is not empty
    @param eintrag the entry to be removed
    @post the corresponding entry from the list where german and english expression are the same
    @throw NoSuchwordException Exception if noch expression can be found
     */
    void entferne(Eintrag eintrag) throws NoSuchWordException;

    /*
    Translates the german word into its english expression.

    @param wort a german word
    @throw NoExpressionFoundException Exception if there could not be found the corresponding english expression
    @return the english expression of the given german word
     */
    String uebersetzteInsEnglische(String wort) throws NoExpressionFoundException;

    /*
    Translates the english word into its german expression.

     @param wort an english word
     @throw NoExpressionFoundException Exception if there could not be found the corresponding german expression
     @return the german expression of the given english word
    */
    String uebersetzteInsDeutsche(String wort) throws NoExpressionFoundException;
}
