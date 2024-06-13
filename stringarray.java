import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * The `stringarray` class represents a simple Java Swing application.
 * It implements the `ActionListener` interface to handle button click events.
 */
public class stringarray extends Component implements ActionListener {
    public JFrame jFrame;
    public JButton jButton;
    public JTable jTable;

    /**
     * Constructor to set up the Swing components and layout.
     */
    public stringarray() {
        jFrame = new JFrame();
        jFrame.setTitle("This is my first swing application.");

        String data[][] = {
            { "1", "Mahendra", "Singh" },
            { "2", "Rahul", "Yadav" }
        };
        String column[] = { "ID", "Name", "Surname" };

        jTable = new JTable(data, column);
        jTable.setCellSelectionEnabled(true);
        ListSelectionModel selectionModel = jTable.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        selectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int row = jTable.getSelectedRow();
                    int column = jTable.getSelectedColumn();
                    if (row != -1 && column != -1) {
                        String data = (String) jTable.getValueAt(row, column);
                        System.out.println("Table element selected is: " + data);
                    }
                }
            }
        });

        JScrollPane sp = new JScrollPane(jTable);
        sp.setBounds(20, 20, 350, 400);

        JButton jButton = new JButton("Click Me");
        jButton.setBounds(150, 130, 100, 30);
        jButton.addActionListener(this);

        jFrame.add(sp);
        jFrame.add(jButton);

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Main method to launch the application.
     */
    public static void main(String[] args) {
        new stringarray();
    }

    /**
     * Handles button click events.
     * 
     * @param e the action event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(jFrame, "Button Clicked!");
    }
}
