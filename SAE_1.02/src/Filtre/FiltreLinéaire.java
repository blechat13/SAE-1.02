package Filtre;

public class FiltreLinéaire {
	
	public static String [] filtreLinéaire (String [] tab, String ele) {
		
		String [] res = new String [tab.length];
		int j =0;
		
		
		for (int i = 0; i <= tab.length; i++) {
			if (tab[i].toLowerCase().startsWith(ele.toLowerCase())) {
				res[j] = tab[i];
				j++;
			}
		}
		return res;
	}

}
