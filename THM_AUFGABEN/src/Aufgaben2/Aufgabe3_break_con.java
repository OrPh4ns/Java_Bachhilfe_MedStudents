package Aufgaben2;
public class Aufgabe3_break_con {
    public static void main(String[] args) {
    	
    	for(int i = 0 ; i < 5; i++) {
    		if(i==2) {
    			continue;
    			
    		}    			System.out.println(i);

    	}
        for(int i = 0 ; i < 4; i++){
            /*
            if(i==2){
                continue;
            }
             */
            if(i==2){
                break;
            }
           // System.out.println(i);
        }
    }
}
