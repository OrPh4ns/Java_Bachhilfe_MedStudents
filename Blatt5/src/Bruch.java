import java.util.HashMap;

public class Bruch {
	int z;
	int n;
	public Bruch(int z , int n) {
		this.z = z;
		this.n = n;
	}
	public void Zadd(Bruch b) {
		System.out.println(this.z+b.z);
	}
	
	public String toString() {
		return this.z+"/"+this.n;
	}
	
	HashMap<Bruch, String> bruch = new HashMap<>();
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	public static void main(String[] args) {
		for(int i = 2; i<=30;i+=2) {
			System.out.print(i+",");
		}
	}
	
}
