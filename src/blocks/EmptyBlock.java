package blocks;

import java.awt.*;

public class EmptyBlock extends Block{
    public EmptyBlock(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(x*WIDTH, y*WIDTH, WIDTH, WIDTH);
        g.setColor(Color.BLACK);
    }
    @Override
    public String toString(){
        return String.format("Empty Block; x = %d; y = %d", x, y);
    }
}
