package Student;

public class Medinformatiker extends Student implements hacker{

	int ken;
	public Medinformatiker(String name, String vn, int alter, int ken) {
		super(name, vn, alter);
		this.ken = ken;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hack() {
		System.out.println("Der Informatiker ist "+this.ken+" gut");

	}


}
