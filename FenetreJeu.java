import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import java.awt.BorderLayout;

import static java.awt.Color.blue;
import static java.awt.Color.red;

public class FenetreJeu extends JFrame {

    private JPanel panelPrincipal, panelJoueur, panelTitre;
    private JPanel panelPlato, panelBoutton;
    private int NbJetonJ1, NbJetonJ2;
    private JLabel t1, t2, LabelImgPlato ,pseudo1, LabelJetonJ1,pseudo2, LabelJetonJ2;
    private JButton restart, exit;

    private Pion pionN, pionR;

    private enum Couleur {
        BLANC,
        NOIR
        ;
    }

    public FenetreJeu (Joueur J1, Joueur J2){
        this.setTitle("Jeu de Dame");
        this.setResizable(false);

        this.setLayout(null);
        this.setDefaultCloseOperation(2);
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(700, 700));
        this.setLayout(null);
        this.construireFenetre(J1, J2);
    }

    public void construireFenetre(Joueur J1, Joueur J2) {
        panelJoueur = construirePanelJoueur(J1,J2);
        panelTitre = construirePanelTitre();
        panelPlato = construirePanelPlato();
        panelBoutton = construirePanelBoutton();

        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridy= 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0,50,20,0);
        panelPrincipal.add(panelJoueur, c);

        c.gridy= 1;
        c.insets = new Insets(0,0,5,0);
        panelPrincipal.add(panelTitre,c);

        c.gridy= 2;
        c.insets = new Insets(0,0,5,0);
        panelPrincipal.add(panelPlato, c);

        c.gridy= 3;
        panelPrincipal.add(panelBoutton,c);

        this.setContentPane(panelPrincipal);
    }

    public JPanel construirePanelJoueur(Joueur J1, Joueur J2) {

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,2));

        JPanel panelJ1 = new JPanel();
        panelJ1.setLayout(new GridLayout(2,1));
        pseudo1 = new JLabel();
        pseudo1.setText(""+J1.getPseudo());
        panelJ1.add(pseudo1);

        NbJetonJ1 = 4;
        LabelJetonJ1 = new JLabel();
        LabelJetonJ1.setText("Jeton : "+NbJetonJ1);
        panelJ1.add(LabelJetonJ1);

        JPanel panelJ2 = new JPanel();
        panelJ2.setLayout(new GridLayout(2,1));
        pseudo2 = new JLabel();
        pseudo2.setText(""+J2.getPseudo());
        panelJ2.add(pseudo2);

        NbJetonJ2 = 3;
        LabelJetonJ2 = new JLabel();
        LabelJetonJ2.setText("Jeton : "+NbJetonJ2);
        panelJ2.add(LabelJetonJ2);

        panel.add(panelJ1);
        panel.add(panelJ2);

        return panel;
    }

    public JPanel construirePanelTitre() {

        JPanel panel = new JPanel();

        t1 = new JLabel();
        t1.setText("JEU DE DAME");
        panel.add(t1);

        return panel;
    }

    public JPanel construirePanelPlato() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));

        Damier damier = new Damier();
        damier.setBounds(10, 10, 400, 400);

        damier.setPreferredSize(new Dimension(500, 500));

        panel.add(damier);
        return panel;
    }

    public JPanel construirePanelBoutton() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,2));

        restart = new JButton("RESTART");
        restart.addActionListener(new FenetreJeu.MonEcouteur(this));
        panel.add(restart);

        exit = new JButton("EXIT");
        exit.addActionListener(new FenetreJeu.MonEcouteur(this));
        panel.add(exit);

        return panel;
    }

    public class MonEcouteur implements ActionListener {
        FenetreJeu unefenetre;
        public MonEcouteur(FenetreJeu f){
            this.unefenetre = f;
        }
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==restart){
                NbJetonJ1 = 10;
                LabelJetonJ1.setText("Jeton : "+NbJetonJ1);
                NbJetonJ2 = 10;
                LabelJetonJ2.setText("Jeton : "+NbJetonJ2);

            }
            if (e.getSource()==exit){
                unefenetre.dispose();
            }
        }
    }

}