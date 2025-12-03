public class RechercheLinéaire {
    public static Boolean RechercheLinéaire (int[] tab, int elem) {
		int i, iteration = 0;
		for (i=0; i < tab.length; i++) {
			if (tab[i]==elem) {
				//System.out.println("Itérations : " + iteration);
				return true;
			}
			iteration++;
		}
		//System.out.println("Itérations : " + iteration);
		return false;
		}
}
