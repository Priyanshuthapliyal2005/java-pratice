import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * The `listin` class represents a simple Java Swing application.
 * It implements the `ActionListener` interface to handle button click events.
 */
public class listin extends Component implements ActionListener {
    public JFrame jFrame;
    public JButton jButton;
    public JLabel jLabel;
    public JList<String> nameList;
    public JList<String> surnameList;

    /**
     * Constructor to set up the Swing components and layout.
     */
    public listin() {
        jFrame = new JFrame();
        jFrame.setTitle("This is my first swing application.");
        
        jLabel = new JLabel();
        jLabel.setText("Select Name and Surname");
        jLabel.setBounds(50, 50, 300, 30);
        
        jButton = new JButton("Show Name");
        jButton.setBounds(150, 300, 100, 30);

        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Mahendra");
        l1.addElement("Rahul");
        l1.addElement("Suru");
        l1.addElement("Raj");

        DefaultListModel<String> l2 = new DefaultListModel<>();
        l2.addElement("Raawat");
        l2.addElement("Negi");
        l2.addElement("Yadav");
        l2.addElement("Singh");

        nameList = new JList<>(l1);
        nameList.setBounds(50, 100, 100, 100);

        surnameList = new JList<>(l2);
        surnameList.setBounds(200, 100, 100, 100);

        jButton.addActionListener(this);

        jFrame.add(jLabel);
        jFrame.add(nameList);
        jFrame.add(surnameList);
        jFrame.add(jButton);

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameList.getSelectedValue();
        String surname = surnameList.getSelectedValue();
        String data = "Your name is " + name + " and your surname is " + surname;
        jLabel.setText(data);
    }

    /**
     * Main method to launch the application.
     */
    public static void main(String[] args) {
        new listin();
    }
}
