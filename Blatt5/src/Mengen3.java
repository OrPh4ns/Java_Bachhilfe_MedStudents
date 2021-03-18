import java.net.Inet4Address;
import java.util.TreeSet;

public class Mengen3 {

	
	private TreeSet<Integer> A = new TreeSet<>();
	private TreeSet<Integer> B = new TreeSet<>();
	
	public void primA(int n) {
		for(int i = 0 ; i<=n;i++) {
			if(i%2==0) {
				A.add(i-1);
			}
		}
		
		System.out.println("A : "+A.toString());
		
		for(int teiler = 1; teiler <= n;teiler++) {
			if(n%teiler==0) {
				B.add(teiler);
			}
		}
		System.out.println("B : "+B.toString());
	}
	@SuppressWarnings("unlikely-arg-type")
	public TreeSet<Integer> merge(){
		TreeSet<Integer> tmp = new TreeSet<Integer>();
		for(int e : A) {
			if(B.contains(A)) {
				tmp.add(e);
			}
		}
		return tmp;
	}
	public static void main(String[] args) {
		Mengen3 m = new Mengen3();
		m.A.add(9);
		m.B.add(3);
		m.primA(7);
		System.out.println(	m.merge().toString());
	}

}
