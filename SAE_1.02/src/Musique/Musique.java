package Musique;

import java.time.LocalDate;

public class Musique {
	String titre, album, artiste, artiste2, artiste3, artiste4, artiste5, artiste6, artiste7, artiste8, artiste9, artiste10, artiste11, artiste12, typeAlbum, dateSortie, dureeMusique, popularite;
	
	
	public Musique (String t, String ar, String a2, String a3, String a4, String a5, String a6, String a7, String a8, String a9, String a10, String a11, String a12, String al, String ta, String ds, String dm, String p) {
		titre = t;
		artiste = ar;
		artiste2 = a2;
		artiste3 = a3;
		artiste4 = a4;
		artiste5 = a5;
		artiste6 = a6;
		artiste7 = a7;
		artiste8 = a8;
		artiste9 = a9;
		artiste10 = a10;
		artiste11 = a11;
		artiste12 = a12;
		album = al;
		typeAlbum = ta;
		dateSortie = ds;
		dureeMusique = dm;
		popularite = p;
	}
	
	public String getTitre() {
        return titre;
    }
	
	public String getArtiste() {
        return artiste;
    }

    public String getAlbum() {
        return album;
    }
    
    public String getTypeAlbum() {
        return typeAlbum;
    }
    
    public String getDateSortie() {
        return dateSortie;
    }
    
    public String getDureeMusique() {
        return dureeMusique;
    }
    public String getPopularite() {
        return popularite;
    }

    @Override
    public String toString() {
        return "Titre : " + titre.format("%-100s",titre) + " | Artiste 1 : " + artiste.format("%-40s", artiste) + " | Artiste 2 : " + artiste2.format("%-40s", artiste2) + " | Artiste 3 : " + artiste3.format("%-40s", artiste3) + " | Artiste 4 : " + artiste4.format("%-40s", artiste4) + " | Artiste 5 : " + artiste5.format("%-40s", artiste) + " | Artiste 6 : " + artiste6.format("%-40s", artiste6) + " | Artiste 7 : " + artiste7.format("%-40s", artiste7) + " | Artiste 8 : " + artiste8.format("%-40s", artiste8) + " | Artiste 9 : " + artiste9.format("%-40s", artiste9) + " | Artiste 10 : " + artiste10.format("%-40s", artiste10) + " | Artiste 11 : " + artiste11.format("%-40s", artiste11) + " | Artiste 12 : " + artiste4.format("%-40s", artiste12) + " | Album : " + album.format("%-110s", album) + " | Type d'album : " + typeAlbum.format("%-20s", typeAlbum) + " | Date sortie : " + dateSortie.format("%-20s", dateSortie) + " | Durée Musique : " + dureeMusique.format("%-10s", dureeMusique) + " | Popularité : " + popularite.format("%-5s", popularite) ;
    }
    
}
