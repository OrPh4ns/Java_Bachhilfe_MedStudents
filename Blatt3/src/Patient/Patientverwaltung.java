package Patient;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Patientverwaltung {

	public static void main(String[] args) {
		Patient max = new Patient("Max", "Miau", 30);
		Patient lisa = new Patient("Lisa", "hübsche", 22);
		Patient hilde = new Patient("Hilde", "Chung", 56);
		Patient klaus = new Patient("Klaus", "Corona", 30);
		
		ArrayList<Patient> patients = new ArrayList<>();
		patients.add(max);
		patients.add(lisa);
		patients.add(hilde);
		patients.add(klaus);
		
		Stream<Patient> s = patients.stream().filter(c -> c.getAge() == 30);
		s.forEach(System.out::println);


		Stream<Patient> st = patients.stream().filter(new Predicate<Patient>() {

			@Override
			public boolean test(Patient patient) {
				return patient.getAge()==30;
			}
		}
		
				);
		
		//st.forEach(System.out::println);
		
		
		
		patients.forEach(patient->{ if(patient.getAge()==30)
		{ 
				//System.out.println(patient.toString());
				
			}
		});
		
		
		//patients.forEach(patient->System.out.println(patient.getAge()));
		// so nicht gefragt


		
		
	}
}
