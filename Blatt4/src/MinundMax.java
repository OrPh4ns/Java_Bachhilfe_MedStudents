import java.util.ArrayList;
import java.util.List;

public class MinundMax{

	
	
	
	static <T extends Comparable<T>> T getMin1(List<T> list) { 
		T min =  list.get(0); 
  for (T i : list) { 
	  if(i.compareTo(min)<=0) {
		  min = i;
	  }
  }   
  
  
  return min; }
	
	
	
	
	
	
	
	
	public  <T extends Comparable<T>> T getMin(List<T> list) {
		T min = list.get(0);
		for(T i : list) {
			if(i.compareTo(min)<=0) {
				min = i;
			}
		}return min;
	}
	

	
	public <T extends Comparable<T>> T getMax(List<T> list) {
		T max = list.get(0);
		for(T i : list) {
			if(i.compareTo(max) >= 0) {
				max = i;
			}
		}
		return max;
	}
	
	public <T> int getMinx(List<T> list) {
		T min = list.get(0);
		for(T i : list) {
			if(min==i) {
				min = i;
			}
		} return (int) min;
		
	}
	public static void main(String[] args) {
		Integer a,b,c;
		a = 4;
		b = 9;
		c = 2;
		List<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		list.add(c);
		System.out.println(getMin1(list));
	}

}
