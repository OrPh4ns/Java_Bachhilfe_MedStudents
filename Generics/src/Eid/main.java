package Eid;

public class main{

	public static void main(String[] args) {
		First<Integer> i = new First<>();
		First<Double> d = new First<>();
		First o = new First("Hello");
		System.out.println(o.content);
		i.content = 5;
		d.content = 2.3;
		System.out.println(i.content);
		System.out.println(d.content);
	}
}