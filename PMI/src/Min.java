import java.util.List;

public class Min {

	
	public <T extends Comparable<T>> T getMin(List<T> list) {
		T min = list.get(0);
		for(T m : list) {
			if(m.compareTo(min) >= 0) {
				min = m;
			}
		}
		return min;
		
	}
	public static void main(String[] args) {

	}

}
