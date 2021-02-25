package Phone;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Pixels extends JFrame {

    private final int row;
    private final int col;
    private final int pixelSize;
    private final int pixelX;
    private final int pixelY;


    public Pixels(int row, int col){

        this.row        = row;
        this.col        = col;
        this.pixelSize  = 10;

        this.pixelX = this.col * this.pixelSize;
        this.pixelY = this.row * this.pixelSize;

    }

    public void renderPixels(Graphics g) {

        setPixelColor(pixelX, pixelY, g);

    }

    public void setPixels(Graphics g){
        renderPixels(g);
    }


    /**
     * Sets color for every pixel and randomises them on the screen
     */
    void setPixelColor (int x, int y , Graphics g){
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0 -> {
                g.setColor(Color.RED);
                g.fillRect(x, y, this.pixelSize, this.pixelSize);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, this.pixelSize, this.pixelSize);
            }
            case 1 -> {
                g.setColor(Color.BLUE);
                g.fillRect(x, y, this.pixelSize, this.pixelSize);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, this.pixelSize, this.pixelSize);
            }
            case 2 -> {
                g.setColor(Color.GREEN);
                g.fillRect(x, y, this.pixelSize, this.pixelSize);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, this.pixelSize, this.pixelSize);
            }
        }
    }


}
