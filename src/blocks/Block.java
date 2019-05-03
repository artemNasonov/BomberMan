package blocks;

import java.awt.*;

public class Block {
    protected int x, y;
    public final static int WIDTH = 50;
    public void draw(Graphics g){
    }
    public String toString(){
        return null;
    }
    public Rectangle getBounds(){
        return new Rectangle(x*WIDTH, y*WIDTH, WIDTH, WIDTH);
    }
}
