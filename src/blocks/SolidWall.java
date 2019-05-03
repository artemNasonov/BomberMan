package blocks;

import java.awt.*;

public class SolidWall extends Block {
    public SolidWall(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(x*WIDTH, y*WIDTH, WIDTH, WIDTH);
    }
    @Override
    public String toString(){
        return String.format("Solid Wall; x = %d; y = %d", x, y);
    }
}
