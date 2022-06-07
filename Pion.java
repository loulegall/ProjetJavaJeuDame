import java.awt.*;

public class Pion {
    private Integer colonne;
    private Integer ligne;
    private String couleurPion;

    private String[][] pions = {
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

    public String getPions(int x, int y) {
        return pions[x][y];
    }

    public Pion() {

    }


    private void paintComponent(Graphics g){
        int DIM=50;

        Graphics2D g2 =(Graphics2D) g;

        if (this.couleurPion == "1"){
            g2.setColor(Color.BLACK);
        }else if (this.couleurPion == "0"){
            g2.setColor(Color.WHITE);
        }

        //g2.fillOval(5+(this.positionX+1)*DIM,5+(this.positionY+1)*DIM,30,30);

    }

}
