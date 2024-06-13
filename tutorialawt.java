import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// public class tutorialawt extends Frame{
// public class tutorialawt implements WindowListener{
/**
 * The `tutorialawt` class is a simple Java class that demonstrates the use of AWT (Abstract Window Toolkit) to create a basic GUI application.
 * It creates a frame with a label and a button, and updates the label text when the button is clicked.
 */
public class tutorialawt implements ActionListener {
    // Frame frame;
    Label label;
    public tutorialawt() {

        // Commented-out code from the original snippet
        // Button button =new Button("click me");
        // button.setBounds(30, 100, 80, 30);
        // add(button);

        // setLayout(null);
        // setSize(400, 500);
        // setVisible(true);

        // addWindowListener(new WindowAdapter() {
        // @Override
        // public void windowClosing(WindowEvent e){
        // Frame frame= (Frame)e.getSource();
        // frame.dispose();
        // }
        // });

        // Frame frame = new Frame("hello first gui");
        Frame frame = new Frame("hello first gui");

        // TextArea textArea=new TextArea("");
        // textArea.setBounds(300, 60, 200, 200);

        // TextField textfield = new TextField();
        // textfield.setBackground(Color.blue);
        // textfield.setBounds(20, 30, 100, 30);

        label = new Label("hello world");
        label.setBackground(Color.cyan);
        label.setBounds(20, 90, 150, 30);

        Button button = new Button("click me");
        button.setBackground(Color.red);
        button.setForeground(Color.white);
        button.setBounds(20, 60, 80, 30);


        Checkbox checkbox=new Checkbox("java");
        checkbox.setBounds(100, 100, 50, 50);

        Checkbox checkbox2=new Checkbox("python");
        checkbox2.setBounds(100, 150, 50, 50);

        // button.addActionListener(new ActionListener() {
        //     /**
        //      * This method is called when an action event occurs, such as a button click.
        //      * It updates the text of the label to indicate that the button click was
        //      * successful.
        //      *
        //      * @param e the action event that occurred
        //      */
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         label.setText("button click succesfully");
        //     }
        // });

        button.addActionListener(this);


        // frame.add(textArea); // Adding TextArea to frame
        // frame.add(textfield);
        frame.add(label);
        frame.add(button);
        frame.add(checkbox);
        frame.add(checkbox2);

        frame.setSize(700, 500);
        frame.setLayout(null);
        frame.setVisible(true);

        // Commented-out code from the original snippet
        frame.addWindowListener((WindowListener) new WindowAdapter() {
            /**
             * Invoked when the user attempts to close the window
             * by clicking the close button.
             * This method is responsible for disposing the frame.
             */
            @Override
            public void windowClosing(WindowEvent e) {
                // System.exit(0);
                frame.dispose();
            }
        });

        // frame.addWindowListener(this);

    }
    // @Override
    // public void windowClosing(WindowEvent e) {
    // Frame frame = (Frame) e.getSource();
    // frame.dispose();
    // System.out.println("window closing");
    // }

    // @Override
    // public void windowOpened(WindowEvent e) {
    // System.out.println("window opened");
    // }

    // @Override
    // public void windowClosed(WindowEvent e) {
    // System.out.println("window closed");
    // }

    // @Override
    // public void windowIconified(WindowEvent e) {
    // System.out.println("window iconified");
    // }

    // @Override
    // public void windowDeiconified(WindowEvent e) {
    // System.out.println("window deiconified");
    // }

    // @Override
    // public void windowActivated(WindowEvent e) {
    // System.out.println("window activated");
    // }

    // @Override
    // public void windowDeactivated(WindowEvent e) {
    // System.out.println("window deactivated");
    // }

    public static void main(String[] args) {
        new tutorialawt();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("button click succesfully");
    }
}