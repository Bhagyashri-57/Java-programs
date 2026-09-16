import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

class MyFrame1 extends JFrame{
    public MyFrame1(){
        super("Swing Button Example ");
        JButton button = new JButton("Click Me");
        add(button);
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[]args){
        SwingUtilities.invokeLater(()->new MyFrame1());
    }

}