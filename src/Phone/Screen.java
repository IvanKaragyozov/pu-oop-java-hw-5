package Phone;

import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame {

    /**
     *  Visualises a window with 640 by 640 pixels
     */

    public Screen() {
        this.setSize(640,640);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
    }

    @Override
    // Visualises every pixel 1 by 1
    public void paint(Graphics g){

        super.paint(g);

        for(int row = 0; row < 64; row++){
            for(int col = 0; col < 64; col++){

                






            }
        }
    }

}
