package Rekusion;

public class algo7 {

	public static int algo7_itv(int[] a) {
		
		int s = 0;
		for (int i = 0; i < a.length-1; i++) {
			for(int j = i; j<a.length;j++) {
				//System.out.println("a[i]="+a[i]+" and a[j]="+a[j]);

				if(a[i]>a[j]) {
					s += a[i]*a[j];
				}
			}
		}
		return s;
	}
	
	public static int algo7_rek(int[] a,int left, int rigth, int durchlauf, int erg) {
		if(durchlauf<=rigth) {
			if(left==rigth) return erg;
			else if(a[left]>a[durchlauf]) {
				return erg=erg+(a[left]*a[durchlauf])+algo7_rek(a,left,rigth,durchlauf+1,erg);
			}else {
				 return algo7_rek(a,left,rigth,durchlauf+1,erg);
			}
		}else {
			left+=1;
			durchlauf=1;
			return algo7_rek(a, left, rigth, durchlauf, erg);
		}
	}

	public static void main(String[] args) {
		int[] a = {3,4,2};
		//System.out.println(algo7_itv(a));
		int l = 0;
		int r = 2;
		int lauf = l;
		int erg = 0;
		//System.out.println(algo7_rek(a, l, r, lauf, erg));
		System.out.println(algo7_itv(a));
	}

}
