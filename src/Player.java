import blocks.Block;
import java.awt.*;

public class Player {
    private int x, y;
    private final static int SPEED = 5;
    private final static int WIDTH = 30, HEIGHT = 40;
    private int numberOfBombs = 1;

    public Player(int x, int y){
        this.x=x*Block.WIDTH +10;
        this.y=y*Block.WIDTH+5;
    }

    public void move(int dx, int dy){
        x+=dx*SPEED;
        y+=dy*SPEED;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(x, y, WIDTH, HEIGHT);
    }
    public Rectangle getBounds(){
        return new Rectangle(x, y, WIDTH, HEIGHT);
    }
    public int getNumberOfBombs(){
        return numberOfBombs;
    }
}