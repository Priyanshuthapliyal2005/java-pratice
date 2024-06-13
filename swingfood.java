import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * The `swingfood` class represents a simple Java Swing application.
 * It implements the `ActionListener` interface to handle button click events.
 */
public class swingfood implements ActionListener {
    JFrame jFrame;
    JLabel jLabel;
    JTextField jTextField;
    JTextArea jTextArea;
    JButton jButton;
    JCheckBox checkBox1,checkBox2,checkBox3,checkBox4;

    /**
     * Constructor to set up the Swing components and layout.
     */
    public swingfood() {
        jFrame = new JFrame();
        jFrame.setTitle("This is my first swing application.");

        jLabel=new JLabel("Add food Items:");
        jLabel.setBounds(50, 50, 300, 40);

        checkBox1=new JCheckBox("Pizza : Ruppes 100");
        checkBox1.setBounds(100,100,150,20);

        checkBox2=new JCheckBox("Burger : Ruppes 50");
        checkBox2.setBounds(100,150,150,20);

        checkBox3=new JCheckBox("Pasta : Ruppes 80");
        checkBox3.setBounds(100,200,150,20);


        checkBox4=new JCheckBox("Coke : Ruppes 30");
        checkBox4.setBounds(100,250,150,20);

        jButton = new JButton("Order");
        jButton.setBounds(100, 300, 100, 20);
        
        jFrame.add(checkBox1); 
        jFrame.add(checkBox2);
        jFrame.add(checkBox3);
        jFrame.add(checkBox4);

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
        new swingfood();
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
        if(checkBox1.isSelected()){
            amount+=100;
            msg+="Pizza: 100\n";
        }
        if(checkBox2.isSelected()){
            amount+=50;
            msg+="Burger: 50\n";
        }
        if(checkBox3.isSelected()){
            amount+=80;
            msg+="Pasta: 80\n";
        }
        if(checkBox4.isSelected()){
            amount+=30;
            msg+="Coke: 30\n";
        }
        msg+="-----------------\n";
        msg+="Total: "+amount;
        JOptionPane.showMessageDialog(jFrame,msg);
        
    }
}
