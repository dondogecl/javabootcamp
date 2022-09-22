import javax.swing.JFrame;

public class GameFrame extends JFrame{
    
    // Constructor
    GameFrame(){
        // GamePanel panel = new GamePanel();
        // this.add(panel);
        // shortcut
        this.add(new GamePanel());
        this.setTitle("Snake 4K");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

}
}
