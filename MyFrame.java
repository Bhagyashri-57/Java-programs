import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
class MyFrame extends JFrame{
public MyFrame(){
    super("Swing Button Example ");
    JButton button = new JButton("Click Me");
    add(button);
    setSize(300,200);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
}
public static void main(String[] args) {
    SwingUtilities.invokeLater(()->new MyFrame());
}
}
