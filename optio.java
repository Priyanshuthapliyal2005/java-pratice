import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

/**
 * The `Optio` class represents a simple Java Swing application.
 * It implements the `ActionListener` interface to handle button click events.
 */
public class optio extends Component implements ActionListener {
    public JFrame jFrame;

    /**
     * Constructor to set up the Swing components and layout.
     */
    public optio() {
        jFrame = new JFrame();
        jFrame.setTitle("This is my first swing application.");
        
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int a = JOptionPane.showConfirmDialog(jFrame, "Are you sure you want to exit?");
                if (a == JOptionPane.YES_OPTION) {
                    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });
       
        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        jFrame.setVisible(true);
    }

    /**
     * Main method to launch the application.
     */
    public static void main(String[] args) {
        new optio();
    }
}
