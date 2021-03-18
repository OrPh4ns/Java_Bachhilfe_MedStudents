
public class Vars {

	
	
	public static void add(int a, int b, int c) {
		System.out.println(a+b);
		System.out.println(a);
		System.out.println(a+b+c);
		
	}
	
	public static void login(String username, int pass) {
		
		if(username.equals("Diego") || pass == 123) {
			System.out.println("WElcome diego martinz");
		}else {
			System.out.println("ERROR , Fuck off");
		}
	}
	
public static void sw(int pass) {
		
		switch (pass) {
		case 123:
			System.out.println(123);
			break;
		case 111:
			System.out.println(111);
			break;

		case 5:
			System.out.println("Bye");
			break;
		}
	}
public static int max(int x, int y) {
	if(x>y) {
		return x;
	}else {
		return y;
	}
}
public static void bediegite(int pass) {
	
	System.out.println(pass==1?"hallo":"Tschuss");
}

public static void ref(String a) {
	a = "Hello";
	System.out.println(a);
}
public static int fak_rek(int a) {
	if(a==0) return 1;
	else{
		return fak_rek(a-1)*a;
	}
}
public static int fak_it(int n) {
	int fak = 1;
	while(n>0) {
		fak = fak*n;
		n--;
	}
	
	return fak;
}

public static int sum_rek(int a) {
	if(a==0) return 0;
	return sum_rek(a-1)+a;
}

public void int sum_it(int a) {
	int it = 0;
	while(a>0) {
		it=it+a;
		a--;
	}
	return it;
	
}
	public static void main(String[] args) {
		
		System.out.println(sum_rek(5));
		
		//System.out.println(max(5,7));
		String a = "d";
		//ref(a);
		//add(2,5,8);
		//login("Diego", 123);
		//sw(111);
		//bediegite(1);
	}

}
