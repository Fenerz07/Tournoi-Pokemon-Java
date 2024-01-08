import java.util.Random;

class Pokemon {
    private String nom;
    private int vie;
    private int puissance;
    private String cri;
    private String criVictoire;
    private String criDefaite;

    public Pokemon(String nom, int vie, int puissance, String cri, String criVictoire, String criDefaite) {
        this.nom = nom;
        this.vie = vie;
        this.puissance = puissance;
        this.cri = cri;
        this.criVictoire = criVictoire;
        this.criDefaite = criDefaite;
    }

    public String getNom() {
        return nom;
    }

    public int getVie() {
        return vie;
    }

    public void attaquer(Pokemon adversaire) {
        Random rand = new Random();
        int degats = rand.nextInt(puissance);
        adversaire.vie -= degats;
        System.out.println(nom + " attaque " + adversaire.getNom() + " et lui inflige " + degats + " dégâts !");
    }

    public void crier() {
        System.out.println(cri);
    }

    public void crierVictoire() {
        System.out.println(criVictoire);
    }

    public void crierDefaite() {
        System.out.println(criDefaite);
    }
}
