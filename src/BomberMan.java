import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BomberMan {
    private JFrame frame;
    private World world;

    public BomberMan(){
        initFrame();
        world = new World();
        addKeyListenerToFrame();
        frame.add(world);
        frame.setVisible(true);
    }

    private void initFrame(){
        frame = new JFrame("BomberMan");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(956, 680);
        frame.setResizable(false);
    }

    private void addKeyListenerToFrame(){
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_UP){
                    world.movePlayer(0, -1);
                }
                if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                    world.movePlayer(1, 0);
                }
                if(e.getKeyCode()==KeyEvent.VK_LEFT){
                    world.movePlayer(-1, 0);
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN){
                    world.movePlayer(0, 1);
                }
                frame.repaint();
            }
            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new BomberMan();
    }
}
