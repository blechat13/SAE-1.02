import java.io.*;
import java.util.*;

import Musique.*;
import Tri.*;
import Recherche.*;


public class AppliMusique {
	
	public static void main(String[] args) throws IOException {
		
		List<Musique> listeMusique = new LinkedList<>();
		
		
		int id_fichier, num_action = -1, id_tri;
		String fichier = null, action;
		
		System.out.println("Quelle fichier voulez-vous ?");
		System.out.println("1 - Fichier de 100 musiques");
		System.out.println("2 - Fichier de 1 000 musiques");
		System.out.println("3 - Fichier de 10 000 musiques");
		System.out.println("4 - Fichier de 100 000 musiques");
		System.out.println("5 - Fichier de 438 948 musiques");
		id_fichier=Clavier.lireInt();
		 
		switch(id_fichier) {
		
		  case 1:
			  
		      fichier="spotify_100.csv";
		      
		      break;
		      
		  case 2:
			  
		      fichier="spotify_1000.csv";
		      
		      break;
		      
		  case 3:
			  
		      fichier="spotify_10000.csv";
		      
		  break;
		  
		  case 4:
			  
		      fichier="spotify_100000.csv";
		      
		  break;
		  
		  case 5:
			  
		      fichier="spotify_FULL.csv";
		 
		  break;
		}
		
		BufferedReader f = new BufferedReader(new FileReader(fichier));
		String ligne;
	      
		while ((ligne = f.readLine()) != null) {
            boolean firstLine = true; 

            while ((ligne = f.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                }
                
                String[] elements = ligne.split(",");
                Musique musique = new Musique(elements[0],elements[13],elements[14],elements[15],elements[16],elements[17],elements[18],elements[19],elements[20],elements[21],elements[22],elements[23],elements[24], elements[7],elements[4], elements[8].toString(),elements[25].toString(), elements[10].toString());
                listeMusique.add(musique);
            }
		}
		
		
		while (num_action != 0) { 
			System.out.println("Que voulez-vous faire ?");
			System.out.println("1 - Afficher les données");
			System.out.println("2 - Trier les données");
			System.out.println("3 - Filtrer les données");
			System.out.println("4 - Recherche de donnée via un titre");
			System.out.println("0 - Quitter");
			num_action=Clavier.lireInt();
			 
			switch(num_action) {
			
			  case 1:
				  
				if (fichier == "spotify_100.csv" || fichier == "spotify_1000.csv" ) {
				  	for (Musique m : listeMusique) {
		                  System.out.println(m);
					}
				}
				else if (fichier == "spotify_10000.csv" || fichier == "spotify_100000.csv" ) {
					for (int i = 0; i <= listeMusique.size()-1; i = i+100) {
						System.out.println(listeMusique.get(i));
					}
				}
				else {
					for (int i = 0; i <= listeMusique.size()-1; i = i + 1000) {
						System.out.println(listeMusique.get(i));
					}
				}
			  break;
			      
			  case 2:
				  
				  System.out.println("Comment voulez-vous trier le fichier ?");
				  System.out.println("1 - selon un année");
				  System.out.println("2 - selon le titre d’une chanson");
				  System.out.println("3 - selon le titre d’album");
				  System.out.println("4 - selon le type d’album");
				  System.out.println("5 - selon un artiste");
				  id_tri = Clavier.lireInt();
				  
				  switch (id_tri) {
				  case 1:
					  
					  String[] tab = new String[listeMusique.size()];
					  String[] titre = new String[listeMusique.size()];
	
					  for (int i = 0; i < listeMusique.size(); i++) {
						  tab[i] = listeMusique.get(i).getDateSortie().toString();
						  titre[i] = listeMusique.get(i).getTitre();
					  }
					  
					  String tri = "";
					  
					  while (!tri.equals("Selection") && !tri.equals("Fusion") && !tri.equals("Java")) {
						  System.out.println("Qu'elle tri voulez vous faire");
						  tri = Clavier.lireString();
						  
						  if (tri.equals("Selection")) {
							  TriSelection.triSelection(tab);
						  }
						  else if (tri.equals("Fusion")) {
							  TriFusion.triFusion(tab, 0, tab.length - 1);
						  }
						  else if (tri.equals("Java")) {
							  TriJava.triJava(tab);
						  }
					  }
					  
					  for (int i = 0; i <= tab.length - 1; i++) {
						  System.out.println("Date de sortie : " + tab[i].format("%-40s", tab[i]) + " | Titre de la chanson : " + titre[i]);
					  }
					  
					  
					  break;
					  
				  case 2:
					  
					  String[] tab2 = new String[listeMusique.size()];
					  
					  for (int i = 0; i <= listeMusique.size()-1; i++) {
						  tab2[i] = listeMusique.get(i).getTitre();
					  }
					  
					  String tri2 = "";
					  
					  while (!tri2.equals("Selection") && !tri2.equals("Fusion") && !tri2.equals("Java")) {
						  System.out.println("Qu'elle tri voulez vous faire");
						  tri2 = Clavier.lireString();
						  
						  if (tri2.equals("Selection")) {
							  TriSelection.triSelection(tab2);
						  }
						  else if (tri2.equals("Fusion")) {
							  TriFusion.triFusion(tab2, 0, tab2.length - 1);
						  }
						  else if (tri2.equals("Java")) {
							  TriJava.triJava(tab2);
						  }
					  }
					  
					  for (int i = 0; i <= tab2.length - 1; i++) {
						  System.out.println(tab2[i]);
					  }
					  
					  break;
					  
					  
					  
				  case 3:
					  
					  String[] tab3 = new String[listeMusique.size()];
					  
					  for (int i = 0; i <= listeMusique.size()-1; i++) {
						  tab3[i] = listeMusique.get(i).getAlbum();
					  }
					  
					  String tri3 = "";
					  
					  while (!tri3.equals("Selection") && !tri3.equals("Fusion") && !tri3.equals("Java")) {
						  System.out.println("Qu'elle tri voulez vous faire");
						  tri3 = Clavier.lireString();
						  
						  if (tri3.equals("Selection")) {
							  TriSelection.triSelection(tab3);
						  }
						  else if (tri3.equals("Fusion")) {
							  TriFusion.triFusion(tab3, 0, tab3.length - 1);
						  }
						  else if (tri3.equals("Java")) {
							  TriJava.triJava(tab3);
						  }
					  }
					  
					  for (int i = 0; i <= tab3.length - 1; i++) {
						  System.out.println(tab3[i]);
					  }
					  
					  break;
					  
					  
					  
				  case 4:
					  
					  String[] tab4 = new String[listeMusique.size()];
					  String[] titres = new String[listeMusique.size()];
					  
					  for (int i = 0; i <= listeMusique.size()-1; i++) {
						  tab4[i] = listeMusique.get(i).getTypeAlbum();
						  titres[i] = listeMusique.get(i).getTitre();
					  }
					  
					  String tri4 = "";
					  
					  while (!tri4.equals("Selection") && !tri4.equals("Fusion") && !tri4.equals("Java")) {
						  System.out.println("Qu'elle tri voulez vous faire");
						 tri4 = Clavier.lireString();
						  
						  if (tri4.equals("Selection")) {
							  TriSelection.triSelection(tab4);
						  }
						  else if (tri4.equals("Fusion")) {
							  TriFusion.triFusion(tab4, 0, tab4.length - 1);
						  }
						  else if (tri4.equals("Java")) {
							  TriJava.triJava(tab4);
						  }
					  }
					  
					  for (int i = 0; i <= tab4.length - 1; i++) {
						  System.out.println("Type : " + tab4[i].format("%-30s", tab4[i]) + " | Titre : " + titres[i]);
					  }
					  break;
					  
					  
					  
				  case 5: 
					  
					  String[] tab5 = new String[listeMusique.size()];
					  
					  for (int i = 0; i <= listeMusique.size()-1; i++) {
						  tab5[i] = listeMusique.get(i).getArtiste();
					  }
					  
					  String tri5 = "";
					  
					  while (!tri5.equals("Selection") && !tri5.equals("Fusion") && !tri5.equals("Java")) {
						  System.out.println("Qu'elle tri voulez vous faire");
						 tri5 = Clavier.lireString();
						  
						  if (tri5.equals("Selection")) {
							  TriSelection.triSelection(tab5);
						  }
						  else if (tri5.equals("Fusion")) {
							  TriFusion.triFusion(tab5, 0, tab5.length - 1);
						  }
						  else if (tri5.equals("Java")) {
							  TriJava.triJava(tab5);
						  }
					  }
					  
					  for (int i = 0; i <= tab5.length - 1; i++) {
						  System.out.println(tab5[i]);
					  }
					  
					  break;
				  }
			      break;
			      
			  case 3:
				  
				  int id_filtre = 0;
				  
			      switch (id_filtre) {
			      case 1: 
			    	  
			    	  String [] tab = new String [listeMusique.size()];
			    	  String [] titres = new String [listeMusique.size()];
			    	  
			    	  
			    	  for (int i = 0; i <= listeMusique.size()-1; i++) {
						  tab[i] = listeMusique.get(i).getDateSortie();
						  titres[i] = listeMusique.get(i).getTitre();
					  }
			    	  
			    	  

			    	  break;
			    	  
			      case 2:
			      
			      case 3:
			      }
				  break;
			  
			  case 4:
				  
			      // Fonction rechercher
				  break;
			}
		}
	}
	
}
