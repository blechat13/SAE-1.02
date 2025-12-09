
public class AppliMusique {
    public static void main(String[] args){
        
        List<Musique> listeMusique = new ArrayList<>();


        BufferedReader Musique = new BufferedReader(new InputStreamReader(spotify_100.csv));

        Musique m = new Musique("caca", "trou" ,150000000);

        listeMusique.add(m);

        System.out.println(listeMusique.get(0));
    }
}
