package exam;


	public class Vektor {
		
		public static int[] vektorAdd(int[] x, int[] y) { 
			
			return new int[] { x[0] + y[0], x[1] + y[1] };
}
	public static int[] vektorSub(int[] x, int[] y) { 
		return new int[] { x[0] - y[0], x[1] - y[1] };
	} public static int[] vektorSkalarMult(int s, int[] x) { 
		return new int[] { s * x[0], s * x[1] };
	} 



}
