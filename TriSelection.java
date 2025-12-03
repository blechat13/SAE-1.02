public class TriSelection {
    	public static void triSelection(int[] tableau){
		int i, j, mini, temp;
		
		for(i=0;i<=tableau.length-2;i++) {
			mini=i;
			for (j=i+1;j<=tableau.length-1; j++) {
				if (tableau[j]<tableau[mini]) {
					mini=j;
				}
			}
			temp=tableau[mini];
			tableau[mini]=tableau[i];
			tableau[i]=temp;
		}
	}
}
