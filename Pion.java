import javax.swing.*;

public class Pion extends JButton {

    private int ligne;
    private int colonne;
    String couleur;
    protected String[][] positions = {
            {null,"1",null,"1",null,"1",null,"1",null,"1"},
            {"1",null,"1",null,"1",null,"1",null,"1",null},
            {null,"1",null,"1",null,"1",null,"1",null,"1"},
            {"1",null,"1",null,"1",null,"1",null,"1",null},
            {null, "", null, "", null, "" ,null, "",null, ""},
            {"", null, "", null, "", null ,"", null,"", null},
            {null,"0",null,"0",null,"0",null,"0",null,"0"},
            {"0",null,"0",null,"0",null,"0",null,"0",null},
            {null,"0",null,"0",null,"0",null,"0",null,"0"},
            {"0",null,"0",null,"0",null,"0",null,"0",null},
    };

    private boolean mouv;


    public Pion() {

    }

    public Pion(int ligne, int colonne) {
        this.ligne = ligne;
        this.colonne = colonne;
    }
}
