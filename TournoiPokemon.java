import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TournoiPokemon {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", 80, 20, "Pika pika!", "Pikachu gagne!", "Pikachu perd...");
        Pokemon mewtwo = new Pokemon("Mewtwo", 120, 40, "Mewtwooooo!", "Mewtwo est invincible!", "Mewtwo est vaincu...");
        Pokemon tadmorv = new Pokemon("Tadmorv", 140, 15, "Morvv!", "Tadmorv est innarétable!", "Tadmorv succombe...");
        Pokemon leviathor = new Pokemon("Leviathor", 100, 25, "Thorr!", "Leviathor est immortel!", "Leviathor se noie...");
        Pokemon roucool = new Pokemon("Roucool", 70, 20, "Roucooool!", "Roucool domine!", "Roucool s'est envolé vers d'autres cieux...");
        Pokemon miaouss = new Pokemon("Miaouss", 60, 12, "Miaou!", "Miaouss a vaincu son adversaire!", "Miaouss fuit...");
        Pokemon tortank = new Pokemon("Tortank", 160, 30, "Torrtankk!", "Tortank l'écrase!", "Tortank n'arrive plus à se relever...");
        Pokemon florizard = new Pokemon("Florizard", 160, 25, "Florii Flori!", "Florizard sort victorieux!", "Florizard fanne...");

        List<Pokemon> listePokemon = new ArrayList<>();
        listePokemon.add(pikachu);
        listePokemon.add(mewtwo);
        listePokemon.add(tadmorv);
        listePokemon.add(leviathor);
        listePokemon.add(roucool);
        listePokemon.add(miaouss);
        listePokemon.add(tortank);
        listePokemon.add(florizard);

        while (listePokemon.size() > 1) {
            int indicePokemon1 = new Random().nextInt(listePokemon.size());
            int indicePokemon2 = new Random().nextInt(listePokemon.size());
            int a=0;
            if (indicePokemon1 != indicePokemon2) {
                Pokemon p1 = listePokemon.get(indicePokemon1);
                Pokemon p2 = listePokemon.get(indicePokemon2);
                p1.crier();
                p2.crier();
                while (a==0){
                    p1.attaquer(p2);
                    if (p2.getVie() <= 0) {
                        p1.crierVictoire();
                        p2.crierDefaite();
                        listePokemon.remove(p2);
                        a=1;
                    }
                    else {
                        p2.attaquer(p1);
                        if (p1.getVie() <= 0) {
                            p2.crierVictoire();
                            p1.crierDefaite();
                            listePokemon.remove(p1);
                            a=1;
                        }
                    }
                }
            }
        }
        System.out.println("Le gagnant du tournoi est : " + listePokemon.get(0).getNom());
    }
}
