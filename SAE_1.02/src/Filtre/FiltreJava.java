package Filtre;
import java.util.*;

public class FiltreJava {
	
	public static String[] filtreJava (String [] tab, String ele) {

		String[] res = Arrays.stream(tab)
				
				
		    .filter(s -> s.toLowerCase().startsWith(ele))
		    .toArray(String[]::new);
		
		return res;
	}
}
