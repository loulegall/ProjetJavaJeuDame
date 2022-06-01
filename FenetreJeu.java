package Projet.ProjetJavaJeuDame;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;

public class FenetreJeu extends JFrame {

    private String pseudo1;
    private String pseudo2;
    private JPanel panelPrincipal, panelJoueur;


    public FenetreJeu(String P1, String P2) {
        this.pseudo1 = P1;
        this.pseudo2 = P2;
    }

    public void construireFenetre() {
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(4,1,2,2));

        panelJoueur = new JPanel();
        panelPrincipal.setLayout(new GridLayout(1,2,2,2));
        panelPrincipal.add(panelJoueur);

    }


}