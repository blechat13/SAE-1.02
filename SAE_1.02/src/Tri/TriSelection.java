package Tri;

public class TriSelection {
	public static void triSelection(String[] tableau){
	int i, j, mini;
	String temp;
	
	for(i=0;i<=tableau.length-2;i++) {
		mini=i;
		for (j=i+1;j<=tableau.length-1; j++) {
			if (tableau[j].compareTo(tableau[mini]) < 0) {
				mini=j;
			}
		}
		temp=tableau[mini];
		tableau[mini]=tableau[i];
		tableau[i]=temp;
	}
}
}
