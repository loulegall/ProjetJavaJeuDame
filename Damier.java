import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class Damier extends JPanel implements MouseListener{

    ArrayList<Pion> ListePion = new ArrayList<>();
    int nbLigne = 10;
    int nbColonne = 10;
    boolean isWhite = true;

    boolean checkBouton = false;

    Damier(){
        this.construireDamier();
    }

    private void construireDamier(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(nbLigne, nbColonne));

        for (int i=0; i<nbLigne; i++){
            for (int j=0; j<nbColonne; j++){
                Pion Bcase = new Pion();
                if (isWhite){
                    Bcase.setBackground(Color.white);
                }else{
                    Bcase.setBackground(Color.gray);
                }
                isWhite = !isWhite;

                for(int x=0; x!=Bcase.positions.length; x++){
                    if(Bcase.positions[i][j] == "1"){
                        Bcase.couleur = "N";
                        Bcase.ligne = i;
                        Bcase.colonne = j;
                        ListePion.add(Bcase);

                    }else if (Bcase.positions[i][j] == "0"){
                        Bcase.couleur = "B";
                        Bcase.ligne = i;
                        Bcase.colonne = j;
                        ListePion.add(Bcase);

                    }else if (Bcase.positions[i][j] == ""){
                        Bcase.couleur = "";
                        Bcase.ligne = i;
                        Bcase.colonne = j;
                        ListePion.add(Bcase);
                    }
                }
                Bcase.setText(Bcase.couleur);
                panel.add(Bcase);
            }
            isWhite = !isWhite;
        }
        for (int i=0; i!=ListePion.size(); i++) {
            ListePion.get(i).addMouseListener(this);
        }
        this.add(panel);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if(checkBouton == true){
            checkBouton = false;
            for (int i=0; i!=ListePion.size(); i++) {
                if(ListePion.get(i).couleur!="B" || ListePion.get(i).couleur!="N"){
                    ListePion.get(i).setBackground(Color.gray);
                }
            }
        }

        for (int i=0; i!=ListePion.size(); i++) {
            if (ListePion.get(i).couleur!=""){
                if (mouseEvent.getSource() == ListePion.get(i)){
                    if (ListePion.get(i).couleur=="B"){
                        if (ListePion.get(i-45).couleur!="B"){
                            ListePion.get(i-45).setBackground(Color.red);
                            checkBouton =true;
                        }
                        if (ListePion.get(i-40).couleur!="B"){
                            ListePion.get(i-40).setBackground(Color.red);
                            checkBouton = true;
                        }
                    }
                    if (ListePion.get(i).couleur=="N"){
                        if (ListePion.get(i+45).couleur!="N"){
                            ListePion.get(i+45).setBackground(Color.red);
                            checkBouton = true;
                        }
                        if (ListePion.get(i+40).couleur!="N"){
                            ListePion.get(i+40).setBackground(Color.red);
                            checkBouton = true;
                        }
                    }
                }
            }
        }


    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
