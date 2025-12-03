public class TriFusion {
    public static void triFusion(int []tab, int g, int d){
		int m;
		
		if (g<d) {
			m =(g+d)/2;
			triFusion(tab, g, m);
			triFusion(tab, m+1, d);
			fusionner(tab, g, m, d);
		}
	}
	
	public static void fusionner(int [] tab, int d, int m, int f) {
		int i=d, j=m+1, k=0;
		int []temp=new int[f-d+1];
		while (i<=m && j<=f) {
			if (tab[i]>tab[j]) {
				temp[k]=tab[j];
				j = j + 1;
			}
			else {
				temp[k]=tab[i];
				i = i + 1;
			}
			k = k + 1 ;
		}
		while (i<=m) {
			temp[k]=tab[i];
			i = i + 1;
			k = k + 1 ;
		}
		while (j<=f) {
			temp[k]=tab[j];
			j = j + 1;
			k = k + 1 ;
		}
		i=0;
		for(int l=d;l<=f; l++) { 
			tab[l]=temp[i];
			i = i + 1;
		}
	}
}

