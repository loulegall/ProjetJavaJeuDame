public class Joueur {
    private String pseudo;
    private int nbButton;

    public Joueur(String unPseudo) {
        this.pseudo = unPseudo;
    }

    public String getPseudo() {
        return this.pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
}