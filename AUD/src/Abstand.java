
public class Abstand {


	public static boolean abstand(int[] a) {

		  for (int i = 0; i < a.length - 1; i++) {
			  for(int j = i+1;j<a.length -1 ;j++) {
				  if(a[i]> a[j]) {
					  if(a[j]+200 > a[i]) {
						  return false;
					  }
				  }
			  }
		    }
		return true;
	}

	public static boolean abstand2(int[] a) {

          for(int i=0;i<a.length;i++){
              for(int j=i+1;j<a.length;j++){
            	  System.out.println("j = "+a[j]+" i = "+a[i]);
            	    if(a[i] - a[j] < 200 && a[i]-a[j] >= 0||(a[j]-a[i]<200 && a[j]-a[i] >=0)) {
            	    //if(a[i] - a[j] < 200 && a[i]-a[j] >= 0||(a[j]-a[i]<200 && a[j]-a[i] >=0)) {
            		  return false; 
            		  }
               }
            	   
          }
          return true;
          }
	public static boolean abstand6(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] - a[j] < 200 && a[i] - a[j]>= 0 || (a[j] - a[i] <200 && a[j]-a[i] >=0)) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static void abstand3(int[] a) {

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
             //System.out.println("distance between station "+i+" and station "+j+" is "+ (a[j] - a[i]));   
          	  if(a[j]-a[i]>=200||a[j]-a[i]<=-200) {
          		//if(a[i]-a[j]>=200||a[i]-a[j]<=-200) {
          			System.out.println(true);
          	 }else {
          		 System.out.println(false);
          	 } }  } }
	
	public static boolean abstand5(int[] a) {

		  for (int i = 0; i < a.length - 1; i++) {
			  for(int j = i+1;j<a.length ;j++) {
				  if(a[i]>= a[j]) {
					  if(a[j]+200 > a[i]) {
						  return false;  }
				  }else {
					  if(a[i]+200 > a[j]) {
						  return false;
					  }
				  }
			  }
		    }
		return true;
	}
	
	public static boolean abs(int[] a) {
		for(int i = 0 ; i < a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]-a[j]>=200 && a[i]-a[j]<=0 || a[j]-a[i]>=200 && a[j]-a[i]<=0) {
					return true;
				}
			}
		}
		return false;
	}

	
	
	public static void main(String[] args) {
		int[] a = {5000, 210, 10, 2000};
		int[] b = {70, 1000, 50};
		int[] c = {100,100};
		int[] d = {5000, 10, 210, 2000};
		//System.out.println(abstand2(a));
		//System.out.println(abstand2(a));
		//abstand3(a);
		//System.out.println(abstand2(a));
		System.out.println(abstand5(b));
	}

}
