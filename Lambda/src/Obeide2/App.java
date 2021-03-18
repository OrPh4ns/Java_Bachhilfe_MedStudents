package Obeide2;

public class App {

	public static void main(String[] args) {
		myWork instance =(x,y)->{
			System.out.println("x+y = "+(x+y));
		};
		instance.doWord(5, 7);
	}

}
