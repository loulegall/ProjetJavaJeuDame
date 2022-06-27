import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class Damier extends JPanel implements MouseListener{

<<<<<<< HEAD
    ImageIcon img;
    private JButton boutonCase;
=======
    ArrayList<Pion> ListePion = new ArrayList<>();
    int nbLigne = 10;
    int nbColonne = 10;
    boolean isWhite = true;

    boolean checkBouton = false;
>>>>>>> f3aa06cb067075c5e10fd545cb92b015677ad3af

    Damier(){
        this.construireDamier();
    }

<<<<<<< HEAD
    protected void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;

        //g.setColor(Color.black);
        g.fillRect(50, 50, 50, 50);
=======
    private void construireDamier(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(nbLigne, nbColonne));
>>>>>>> f3aa06cb067075c5e10fd545cb92b015677ad3af

        for (int i=0; i<nbLigne; i++){
            for (int j=0; j<nbColonne; j++){
                Pion Bcase = new Pion();
                if (isWhite){
<<<<<<< HEAD

                    //________Bouton case________//
                    this.boutonCase = new JButton();
                    this.boutonCase.setLocation((j+1)*DIM, (i+1)*DIM);
                    this.boutonCase.setSize(DIM, DIM);
                    //this.boutonCase.addActionListener(new FenetreLogin.MonEcouteur(this));
                    this.boutonCase.setBackground(Color.white);
                    this.add(this.boutonCase);
                    //g2.setPaint(Color.white);

                }else{
                    //________Bouton case________//
                    this.boutonCase = new JButton();
                    this.boutonCase.setLocation((j+1)*DIM, (i+1)*DIM);
                    this.boutonCase.setSize(DIM, DIM);
                    //this.boutonCase.addActionListener(new FenetreLogin.MonEcouteur(this));
                    this.boutonCase.setBackground(Color.lightGray);
                    this.add(this.boutonCase);
                    //g2.setPaint(Color.lightGray);
=======
                    Bcase.setBackground(Color.white);
                }else{
                    Bcase.setBackground(Color.gray);
>>>>>>> f3aa06cb067075c5e10fd545cb92b015677ad3af
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
