package Aufgaben7;
import java.io.FileWriter;
import java.io.IOException;

public class Patient extends Exception {
    String name;
    int puls;

    public Patient(String n, int p){
        this.name = n;
        this.puls = p;
    }
    public void setPuls() throws  TodException, IOException{
        this.puls = puls;
        if (this.puls ==0) {
           throw new TodException(this.name,puls);
        }

    }
}