package funzionale;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import model.Studente;

class Predicatore implements Predicate<Studente>{

	@Override
	public boolean test(Studente t) {
		return t.getCognome().startsWith("z");
	}
	
}

public class Funzionale2 {

	public static void main(String[] args) {
		
		Studente s1 = new Studente("Fabio", "zamoruso");
		Studente s2 = new Studente("Matteo", "agamba");
		
		Studente[] studenti = {s1,s2};
		
		List<Studente> studentiList = Arrays.asList(studenti);
		
		//studentiList.stream().filter(t -> t.getCognome().toLowerCase().startsWith("z")).forEach(System.out::println);
		
		studentiList.forEach(System.out::println);
		
		//studentiList.sort((s4, s5)-> s4.getCognome().compareTo(s5.getCognome()));
		
		
		
		//System.out.println(studentiList);
		
		
	}
	
}
