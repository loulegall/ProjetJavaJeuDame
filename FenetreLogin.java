import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreLogin extends JFrame {

   // private Joueur joueur1;
    //private Joueur joueur2;
    private JLabel labelPseudo1;
    private JLabel labelPseudo2;
    private JTextField textPseudo1;
    private JTextField textPseudo2;
    private JButton boutonStart;

    public FenetreLogin (String titre /*,Joueur joueur1, Joueur joueur2*/){
        //this.joueur1 = joueur1;
        //this.joueur2 = joueur2;
        this.setTitle(titre);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo((Component)null);
        this.setMinimumSize(new Dimension(300, 300));
        this.setLayout((LayoutManager)null);
        this.construireFenetre();
    }

    public void construireFenetre() {

        //________Label pseudo1________//
        this.labelPseudo1 = new JLabel("Joueur 1 :");
        this.labelPseudo1.setLocation(10, 30);
        this.labelPseudo1.setSize(80, 20);
        this.add(this.labelPseudo1);

        //________Text pseudo1________//
        this.textPseudo1 = new JTextField(100);
        this.textPseudo1.setText(" ");
        this.textPseudo1.setLocation(90, 30);
        this.textPseudo1.setSize(140, 20);
        this.add(this.textPseudo1);

        //________Label pseudo2________//
        this.labelPseudo2 = new JLabel("Joueur 2 :");
        this.labelPseudo2.setLocation(10, 60);
        this.labelPseudo2.setSize(80, 20);
        this.add(this.labelPseudo2);

        //________Text pseudo2________//
        this.textPseudo2 = new JTextField(100);
        this.textPseudo2.setText(" ");
        this.textPseudo2.setLocation(90, 60);
        this.textPseudo2.setSize(140, 20);
        this.add(this.textPseudo2);

        //________Bouton start________//
        this.boutonStart = new JButton("Start");
        this.boutonStart.setLocation(90, 210);
        this.boutonStart.setSize(140, 50);
        this.boutonStart.addActionListener(new MonEcouteur(this));
        this.add(this.boutonStart);

        this.pack();
    }

    public class MonEcouteur implements ActionListener {
        FenetreLogin unefenetre;
        public MonEcouteur(FenetreLogin f){
            this.unefenetre = f;
        }
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==boutonStart){

                String pseudoj1 = textPseudo1.getText();
                Joueur joueur1 = new Joueur(pseudoj1);

                String pseudoj2 = textPseudo2.getText();
                Joueur joueur2 = new Joueur(pseudoj2);

                FenetreJeu f = new FenetreJeu(joueur1, joueur2);
                f.setVisible(true);
            }
        }
    }
}
