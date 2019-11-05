import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI {

    private JFrame frame;
    private JPanel panel;
    private JTextField text;
    private ArrayList<JButton> numberButtonArray;
    private ArrayList<JButton> signButtonArray;


    public void go() {
        // create main frame //
        frame = new JFrame("Simple Calculator");
        // create panel of number buttons and set its color //
        JPanel numberButtonsPanel = new JPanel();
        numberButtonsPanel.setBackground(Color.LIGHT_GRAY);
        // create number buttons (array of buttons) //
        numberButtonArray = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numberButtonArray.add(new JButton("" + i));
            numberButtonsPanel.add(numberButtonArray.get(i));
        }
        // set it on the frame //
        frame.getContentPane().add(numberButtonsPanel, BorderLayout.CENTER);
        // create panel of sign buttons and set its color
        JPanel signButtonsPanel = new JPanel();
        signButtonsPanel.setBackground(Color.darkGray);
        signButtonsPanel.setLayout(new BoxLayout(signButtonsPanel, BoxLayout.Y_AXIS));
        // create sigh buttons //
        signButtonArray = new ArrayList<>();

        char[] chars = new char[]{'+', '-', '*', '/', '%'};
        for (int i = 0; i < 5; i++) {
            signButtonArray.add(new JButton("" + chars[i]));
            signButtonsPanel.add(signButtonArray.get(i));

        }

        frame.getContentPane().add(signButtonsPanel, BorderLayout.EAST);
        // frame settings //
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450);
        frame.setVisible(true);
    }


}
