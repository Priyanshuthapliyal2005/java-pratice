import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * The `javaswing` class represents a simple Java Swing application.
 * It implements the `ActionListener` interface to handle button click events.
 */
public class javaswing implements ActionListener {
    JFrame jFrame;
    JLabel jLabel;
    JLabel jLabel1;
    JTextField jTextField;
    JTextArea jTextArea;

    /**
     * Constructor to set up the Swing components and layout.
     */
    public javaswing() {
        jFrame = new JFrame();
        jFrame.setTitle("This is my first swing application.");

        JButton jButton = new JButton("Count Words");
        jButton.setBounds(130, 300, 120, 40);

        jLabel = new JLabel("This is java swing application.");
        jLabel.setBounds(50, 50, 300, 40);

        jTextField = new JTextField();
        jTextField.setBounds(50, 150, 300, 40);

        jTextArea = new JTextArea();
        jTextArea.setBounds(50, 200, 300, 80);
        jTextArea.setBackground(Color.cyan);
        jTextArea.setForeground(Color.red);

        jLabel1 = new JLabel("Enter the text:");
        jLabel1.setBounds(50, 10, 100, 40);

        // Adding components to the JFrame
        jFrame.add(jTextField);
        jFrame.add(jButton);
        jFrame.add(jLabel);
        jFrame.add(jTextArea);
        jFrame.add(jLabel1);

        // Adding action listener to the button
        jButton.addActionListener(this);

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Main method to launch the application.
     */
    public static void main(String[] args) {
        new javaswing();
    }

    /**
     * Handles button click events.
     * 
     * @param e the action event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = jTextArea.getText();
        String[] words = text.split("\\s+");  // Split on one or more whitespace characters
        jLabel.setText("Total words are: " + words.length);
    }
}
