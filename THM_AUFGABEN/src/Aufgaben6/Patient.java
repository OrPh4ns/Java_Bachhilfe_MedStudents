package Aufgaben6;
public class Patient {
    private String name;
    private int age;
    private static int count=0;
    public Patient(){
    }
    public void setinfo(String name,int age){
        this.name = name;
        this.age = age;
        count++;
    }
    public String toString(){
        return "Name is : "+this.name+" ][ Age is : "+this.age;
    }
    public int getCount(){
        return count;
    }



}
