public class Main {

    public static void main(String[] args) {

        FenetreLogin l = new FenetreLogin("Noms des joueurs", "Joueur 1", "Joueur 2");
        FenetreJeu f = new FenetreJeu("joueur1", "joueur2");

        l.setVisible(true);
        f.setVisible(true);
    }
}
