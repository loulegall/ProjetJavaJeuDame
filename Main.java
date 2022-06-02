public class Main {

    public static void main(String[] args) {

        Joueur J1 = new Joueur("jiji");
        Joueur J2 = new Joueur("jojo");

        FenetreLogin l = new FenetreLogin("Noms des joueurs");
        FenetreJeu f = new FenetreJeu(J1, J2);

        l.setVisible(true);
        f.setVisible(true);
    }
}
