import javax.swing.*;
import java.awt.*;

public class FenetrePlateau extends JFrame{

    private JButton boutonJeu;

    public FenetrePlateau (String titre ){
        this.setTitle(titre);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo((Component)null);
        this.setMinimumSize(new Dimension(300, 300));
        this.setLayout((LayoutManager)null);
        this.construireFenetre();
    }

    public void construireFenetre(){

    }
}
