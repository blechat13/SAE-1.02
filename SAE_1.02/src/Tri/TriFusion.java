package Tri;

public class TriFusion {

    public static void triFusion(String[] tab, int g, int d) {
        int m;

        if (g < d) {
            m = (g + d) / 2;
            triFusion(tab, g, m);
            triFusion(tab, m + 1, d);
            fusionner(tab, g, m, d);
        }
    }

    public static void fusionner(String[] tab, int d, int m, int f) {
        int i = d, j = m + 1, k = 0;
        String[] temp = new String[f - d + 1];

        while (i <= m && j <= f) {
            if (tab[i].compareTo(tab[j]) > 0) { 
                temp[k] = tab[j];
                j = j + 1;
            } else {
                temp[k] = tab[i];
                i = i + 1;
            }
            k = k + 1;
        }

        while (i <= m) {
            temp[k] = tab[i];
            i = i + 1;
            k = k + 1;
        }

        while (j <= f) {
            temp[k] = tab[j];
            j = j + 1;
            k = k + 1;
        }

        i = 0;
        for (int l = d; l <= f; l++) {
            tab[l] = temp[i];
            i = i + 1;
        }
    }
}