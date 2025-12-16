package Recherche;

public class RechercheDichotomique {
    public static int rechercheDichotomie (int tab [], int gauche, int droite, int ele) {
		
		if (gauche == droite) {
			return -1;
		}
		
		int milieu = (droite + gauche) / 2;
		
		if (tab[milieu] == ele) {
			return milieu; 
		}
		else if (tab[milieu] < ele){
			return rechercheDichotomie(tab,milieu+1,droite,ele);
		}
		else {
			return rechercheDichotomie(tab,gauche,milieu-1,ele);
		}
	}
    
}
