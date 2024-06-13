import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * The `javaswing1` class represents a simple Java Swing application.
 * It implements the `ActionListener` interface to handle button click events.
 */
public class javaswing1 implements ActionListener {
    JFrame jFrame;
    JLabel jLabel;
    JLabel jLabel1;
    JTextField jTextField;
    JTextArea jTextArea;
    JButton jButton;
    JPasswordField jPasswordField;

    /**
     * Constructor to set up the Swing components and layout.
     */
    public javaswing1() {
        jFrame = new JFrame();
        jFrame.setTitle("This is my first swing application.");

        jLabel = new JLabel("Password:");
        jLabel.setBounds(40, 10, 100, 20);

        jPasswordField = new JPasswordField();
        jPasswordField.setBounds(150, 10, 150, 20);

        jButton = new JButton("Login");
        jButton.setBackground(Color.blue);
        jButton.setForeground(Color.white);
        jButton.setBounds(150, 40, 100, 20);

        jLabel1 = new JLabel();
        jLabel1.setBounds(40, 70, 300, 20);

        jFrame.add(jPasswordField);
        jFrame.add(jLabel);
        jFrame.add(jButton);
        jFrame.add(jLabel1);

        jButton.addActionListener(this);

        jFrame.setLayout(null);
        jFrame.setSize(400, 200);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Main method to launch the application.
     */
    public static void main(String[] args) {
        new javaswing1();
    }

    /**
     * Handles button click events.
     * 
     * @param e the action event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        jLabel1.setText("Entered Password: " + new String(jPasswordField.getPassword()));
    }
}
