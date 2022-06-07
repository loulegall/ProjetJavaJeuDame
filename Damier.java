import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;


public class Damier extends JPanel implements MouseListener{

    ImageIcon img;
    String[][] pions = {
            {null,"1",null,"1",null,"1",null,"1",null,"1"},
            {"1",null,"1",null,"1",null,"1",null,"1",null},
            {null,"1",null,"1",null,"1",null,"1",null,"1"},
            {"1",null,"1",null,"1",null,"1",null,"1",null},
            {null, null, null, null, null, null ,null, null,null, null,},
            {null, null, null, null, null, null ,null, null,null, null,},
            {null,"0",null,"0",null,"0",null,"0",null,"0"},
            {"0",null,"0",null,"0",null,"0",null,"0",null},
            {null,"0",null,"0",null,"0",null,"0",null,"0"},
            {"0",null,"0",null,"0",null,"0",null,"0",null},

    };

    Damier(){
       //img = new ImageIcon("/home/maxime/Documents/1A/PA3/Dev objet/PARTIE 2/ProjetJavaJeuDame/pion.png");
    }

    protected void paintComponent(Graphics g){
        //super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g.setColor(Color.black);
        g.fillRect(50, 50, 50, 50);


        int DIM = 40;
        int NBligne = 10;
        int NBcolone = 10;
        boolean isWhite = true;

        //cases
        for (int i=0; i<NBligne; i++){
            for (int j=0; j<NBcolone; j++){
                if (isWhite){
                    g2.setPaint(Color.white);

                }else{
                    g2.setPaint(Color.lightGray);
                }
                g2.fill(new Rectangle2D.Double((j+1)*DIM, (i+1)*DIM, DIM, DIM));
                isWhite = !isWhite;
            }
            isWhite = !isWhite;
        }

        //cadre
        g2.setPaint(Color.BLACK);
        g2.setStroke(new BasicStroke(2));
        g2.draw(new Rectangle2D.Double(DIM, DIM, NBcolone*DIM, NBligne*DIM));

        //Légendes
        int c;
        for(int i=0; i<NBligne; i++){
            c = i+'0';
            g2.drawString(""+(char)c, 2.0f / 3*DIM, (i+1.5f)*DIM+6);
        }
        for(int j=0; j<NBcolone; j++){
            c = 'A' + j ;
            g2.drawString(""+(char)c, (j+ 1.5f) * DIM-5, 2.0f / 3*DIM+6);
        }

        for(int i=0; i<NBligne; i++){
            for(int j=0; j<NBcolone; j++){
                if(pions[i][j]!=null){
                    if(pions[i][j]=="1"){
                        g2.setColor(Color.BLACK);
                        g2.fillOval(5+(j+1)*DIM,5+(i+1)*DIM,30,30);
                        //pion p = new pion(j, i, "1");
                        //g2.draw(p);
                    }else{
                        g2.setColor(Color.white);
                        g2.fillOval(5+(j+1)*DIM,5+(i+1)*DIM, 30, 30);
                        //pion p = new pion(j, i, "0");
                        //g2.draw(p);
                    }
                }
            }
        }

        g2.dispose();


    }


    public void mouseClicked(MouseEvent arg0) {

    }

    public void mouseEntered(MouseEvent arg0) {

    }

    public void mouseExited(MouseEvent arg0) {

    }

    public void mousePressed(MouseEvent arg0) {

    }

    public void mouseReleased(MouseEvent arg0) {

    }



}
