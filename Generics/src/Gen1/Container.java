package Gen1;

public class Container<a1,a2>{
	a1 name1;
	a2 name2;
	public Container(a1 name1,a2 name2){
		this.name1=name1;
		this.name2=name2;
	}
	public void print() {
		System.out.println("Name1="+this.name1+"//Name2="+this.name2);
	}
	
}
