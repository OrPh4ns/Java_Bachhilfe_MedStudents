package UpCastingandDown;

public class Application {

	public static void main(String[] args) {

		
		Fruit fruit = new Apple();
		System.out.println(fruit.getCaluries());
		System.out.println(fruit.getOrgin());
		 Apple castedapple = (Apple)fruit;
		 System.out.println(castedapple.getCaluries());
			System.out.println(castedapple.getOrgin());
	
		
		
		if(castedapple instanceof Fruit) {
			System.out.println("Yes");
		
		}}
	
	
}
