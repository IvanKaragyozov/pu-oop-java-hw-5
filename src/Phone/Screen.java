package Phone;

import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame {

    /**
     *  Visualises a window with 640 by 640 pixels
     */

    public Screen() {
        this.setSize(660,685);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    // Visualises every pixel 1 by 1
    public void paint(Graphics g){

        g.translate(10,35); // Corrects the size of the window

        for(int row = 0; row < 64; row++){
            for(int col = 0; col < 64; col++){

                 Pixels pixels = new Pixels(row, col);
                 pixels.setPixels(g);



            }
        }
    }

}
