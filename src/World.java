import blocks.*;
import javax.swing.*;
import java.awt.*;

public class World extends JPanel {
    private Block[][] map = new Block[13][19];
    private Player player = new Player(1, 1);

    World(){
        generateMap();
    }

    public void movePlayer(int dx, int dy){
        player.move(dx, dy);
        if(checkCollisionPlayerAndBlocks()){
            player.move(-dx, -dy);
        }
    }
    private boolean checkCollisionPlayerAndBlocks(){
        int blockX = player.getX()/50, blockY=player.getY()/50;
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                if(!(map[blockY+i][blockX+j] instanceof EmptyBlock)){
                    Rectangle blockBounds = map[blockY+i][blockX+j].getBounds();
                    Rectangle playerBounds = player.getBounds();
                    if(playerBounds.intersects(blockBounds)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void generateMap(){
        for(int i=0; i<19; i++) {
            map[0][i] = new SolidWall(i, 0);
            map[12][i] = new SolidWall(i, 12);
        }
        for(int i=0; i<13; i++){
            if(i%2==0){
                for(int j=0; j<19; j+=2){
                    map[i][j] = new SolidWall(j, i);
                }
            } else {
                map[i][0]= new SolidWall(0, i);
                map[i][18]= new SolidWall(18, i);
            }
        }
        map[1][1] = new EmptyBlock(1, 1);
        map[1][2] = new EmptyBlock(2, 1);
        map[2][1] = new EmptyBlock(1, 2);
        for(int i=0; i<13; i++){
            for(int j=0; j<19; j++){
                if(map[i][j]==null){
                    map[i][j] = (Math.round(Math.random())==1)?new DestructibleBlock(j, i):new EmptyBlock(j, i);
                }
            }
        }
    }
    @Override
    public void paintComponent(Graphics g){
        drawMap(g);
        player.draw(g);
    }
    private void drawMap(Graphics g){
        for(int i=0; i<13; i++){
            for(int j=0; j<19; j++){
                map[i][j].draw(g);
            }
        }
    }
}
