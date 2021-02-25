package Phone;

import javax.swing.*;
import java.awt.*;

public class Pixels extends JFrame {

    int row;
    int col;
    int tileSize;
    int tileX;
    int tileY;

    String RED = "RED";

    public void Pixels(int row, int col, Graphics g) {

        this.row = row;
        this.col = col;
        this.tileSize = 100;

        this.tileX = this.col * this.tileSize;
        this.tileY = this.row * this.tileSize;

        for(this.row = 0; this.row < 64; this.row++){
            for(this.col = 0; this.col < 64; this.col++){

                g.setColor(Color.RED);
                g.fillRect(tileX,tileY,tileSize,tileSize);

            }
        }


    }
 //  public Pixels(Graphics g){

 //      for(int row = 0; row < 64; row++){
 //          for(int col = 0; col < 64; col++){

 //              g.setColor(Color.RED);
 //              g.fillRect(tileX,tileY,tileSize,tileSize);

 //          }
 //      }

 //  }
 //  public void setPixels(Graphics g){
 //      Pixels(g);
 //  }


    // Sets every red pixel
    void setTileColor (int x, int y , Graphics g, String color) {
        switch (color) {
            case "RED":
                g.setColor(Color.RED);
                g.fillRect(x, y, this.tileSize, this.tileSize);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, this.tileSize, this.tileSize);
                break;


        }
    }

}


