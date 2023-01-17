
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import  java.util.Random;
import  javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH=600;
    static final int SCREEN_HEIGHT=600;

    /*size of game objects*/
    static final int UNIT_SIZE=25;

    /*elements that fit on the screen*/
    static final int GAME_UNITS= (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;

    /*timer*/
    static final int DELAY=75;

    /*matrices that will have the coordinates where the snake will move through*/
    final int x[]= new int[GAME_UNITS]; //body parts
    final int y[] = new int[GAME_UNITS]; // has all the coordinates

    int bodyParts =6;
    int applesEaten;
    int appleX; // random apples
    int appleY; // positioning of the apples
    char direction = 'R'; // start of movement
    boolean running = false;
    Timer timer;
    Random random;
    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    /* Methods to be used*/

    //start game
    public void startGame(){

    }

    // paint component
    public void paintComponent(Graphics g){

    }

    // draw
    public void draw(Graphics g){

    }

    public void newApple(){
        
    }
    //move
    public void move(){

    }

    // points
    public void checkApple(){

    }

    public void checkCollisions(){

    }

    public void gameOver(Graphics g){

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public class myKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){

        }
    }
}
