import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class keyPressed extends JPanel implements ActionListener {


    private final int B_WIDTH = 600;
    private final int B_HEIGHT = 600;
    private final int DOT_SIZE = 10;
    private final int ALL_DOTS = 900;
    private final int RAND_POS = 29;
    private final int FINAL_DELAY = 140;

    private int dots;
    private int // IMAGE TIL SPIL "X CORDINAT"
    private int // IMAGE TIL SPIL "Y CORDINAT"


    private boolean rightDirection = false;
    private boolean leftDirection = true;
    private boolean downDirection = false;
    private boolean upDirection = false;



    public void keyPress(KeyEvent e     x) {

        int key = e.getKeyCode();

        if ((key ==  KeyEvent.VK_LEFT) && (!rightDirection)){

            leftDirection = true;
            upDirection = false;
            downDirection = false;
        }

        if ((key == keyEvent.VK_RIGHT) && (!leftDirection)){

            rightDirection = true;
            upDirection = false;
            downDirection = false;

        }

        if ((key == keyEvent.VK_UP) && (!downDirection)){

            upDirection = true;
            rightDirection = false;
            leftDirection = false;

        }

        if ((key == keyEvent.VK_DOWN) && (!upDirection)){

            downDirection = true;
            rightDirection = false;
            leftDirection = false;

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
