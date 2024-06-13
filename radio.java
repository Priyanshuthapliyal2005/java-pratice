import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * The `radio` class represents a simple Java Swing application.
 * It implements the `ActionListener` interface to handle button click events.
 */
public class radio implements ActionListener {
    JFrame jFrame;
    JLabel jLabel;
    JTextField jTextField;
    JTextArea jTextArea;
    JButton jButton;
    JRadioButton RadioButton1,RadioButton2,RadioButton3,RadioButton4;

    /**
     * Constructor to set up the Swing components and layout.
     */
    public radio() {
        jFrame = new JFrame();
        jFrame.setTitle("This is my first swing application.");

        jLabel=new JLabel("Add food Items:");
        jLabel.setBounds(50, 50, 300, 40);

        RadioButton1=new JRadioButton("Pizza : Ruppes 100");
        RadioButton1.setBounds(100,100,150,20);

        RadioButton2=new JRadioButton("Burger : Ruppes 50");
        RadioButton2.setBounds(100,150,150,20);

        RadioButton3=new JRadioButton("Pasta : Ruppes 80");
        RadioButton3.setBounds(100,200,150,20);


        RadioButton4=new JRadioButton("Coke : Ruppes 30");
        RadioButton4.setBounds(100,250,150,20);

        jButton = new JButton("Order");
        jButton.setBounds(100, 300, 100, 20);
        
        jFrame.add(RadioButton1); 
        jFrame.add(RadioButton2);
        jFrame.add(RadioButton3);
        jFrame.add(RadioButton4);

        jFrame.add(jButton);

        jButton.addActionListener(this);

        jFrame.setLayout(null);
        jFrame.setSize(400, 600);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Main method to launch the application.
     */
    public static void main(String[] args) {
        new radio();
    }

    /**
     * Handles button click events.
     * 
     * @param e the action event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        float amount=0;
        String msg="";
        if(RadioButton1.isSelected()){
            amount+=100;
            msg+="Pizza: 100\n";
        }
        if(RadioButton2.isSelected()){
            amount+=50;
            msg+="Burger: 50\n";
        }
        if(RadioButton3.isSelected()){
            amount+=80;
            msg+="Pasta: 80\n";
        }
        if(RadioButton4.isSelected()){
            amount+=30;
            msg+="Coke: 30\n";
        }
        msg+="-----------------\n";
        msg+="Total: "+amount;
        JOptionPane.showMessageDialog(jFrame,msg);
        
    }
}
