import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * The `Combo` class represents a simple Java Swing application.
 * It implements the `ActionListener` interface to handle button click events.
 */
public class combo extends Component implements ActionListener {
    private JFrame jFrame;
    private JLabel jLabel;
    private JButton jButton;
    @SuppressWarnings("rawtypes")
    private JComboBox jComboBox;
    

    /**
     * Constructor to set up the Swing components and layout.
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public combo() {
        jFrame = new JFrame();
        jFrame.setTitle("This is my first swing application.");

        String city[] = {"Mumbai", "Surat", "Goa", "Udaipur"};
        jComboBox = new JComboBox(city);
        jComboBox.setBounds(50, 50, 90, 20);

        jButton = new JButton("Order");
        jButton.setBounds(50, 100, 100, 20);

        jLabel = new JLabel("Select City:");
        jLabel.setBounds(50, 10, 200, 40);

        jFrame.add(jComboBox);
        jFrame.add(jButton);
        jFrame.add(jLabel);

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
        new combo();
    }

    /**
     * Handles button click events.
     * 
     * @param e the action event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        jLabel.setText("You selected: " + jComboBox.getItemAt(jComboBox.getSelectedIndex()));
    }
}
