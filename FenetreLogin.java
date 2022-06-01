import javax.swing.*;
import java.awt.*;

public class FenetreLogin extends JFrame {

    private JLabel labelPseudo1;
    private JLabel labelPseudo2;
    private JTextField textPseudo1;
    private JTextField textPseudo2;

    public FenetreLogin (String titre){
        this.setTitle(titre);
        this.setResizable(false);

        //this.setSize(500, 500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo((Component)null);
        this.setMinimumSize(new Dimension(300, 300));
        this.setLayout((LayoutManager)null);
        this.setDefaultCloseOperation(2);
        this.construireFenetre();
    }

    public void construireFenetre() {

        //________Label pseudo1________//
        this.labelPseudo1 = new JLabel("Joueur 1 :");
        this.labelPseudo1.setLocation(10, 60);
        this.labelPseudo1.setSize(80, 20);
        this.add(this.labelPseudo1);

        //________Text pseudo1________//
        this.textPseudo1 = new JTextField(100);
        //this.textPseudo1.setText(this.emp.getFirstName());
        this.textPseudo1.setLocation(90, 60);
        this.textPseudo1.setSize(140, 20);
        this.add(this.textPseudo1);

        //________Label pseudo2________//
        this.labelPseudo2 = new JLabel("Joueur 2 :");
        this.labelPseudo2.setLocation(10, 60);
        this.labelPseudo2.setSize(80, 20);
        this.add(this.labelPseudo2);

        //________Text pseudo2________//
        this.textPseudo2 = new JTextField(100);
        //this.textPseudo2.setText(this.emp.getFirstName());
        this.textPseudo2.setLocation(90, 60);
        this.textPseudo2.setSize(140, 20);
        this.add(this.textPseudo2);
    }
}
