package blocks;

import java.awt.*;

public class DestructibleBlock extends Block {
    public DestructibleBlock(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(x*WIDTH, y*WIDTH, WIDTH, WIDTH);
        g.setColor(Color.BLACK);
        g.drawRect(x*WIDTH, y*WIDTH, WIDTH, WIDTH);
        g.drawLine(x*WIDTH, y*WIDTH, (x+1)*WIDTH, (y+1)*WIDTH);
        g.drawLine((x+1)*WIDTH, y*WIDTH, x*WIDTH, (y+1)*WIDTH);
    }
    @Override
    public String toString(){
        return String.format("Destructible Block; x = %d; y = %d", x, y);
    }
}
