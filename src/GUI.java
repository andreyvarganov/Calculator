import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUI {

    private JFrame frame;
    private JPanel panel;
    private JLabel text;
    private ArrayList<JButton> numberButtonArray;
    private ArrayList<JButton> signButtonArray;
    public static String result = "";
    private static String curr = "";

    public void go() {
        // create main frame //
        frame = new JFrame("Simple Calculator");

        text = new JLabel("Result: ");
        Font font = new Font("Tahoma", Font.BOLD, 30);
        text.setFont(font);
        frame.getContentPane().add(text, BorderLayout.NORTH);

        // create panel of number buttons and set its color //
        JPanel numberButtonsPanel = new JPanel();
        numberButtonsPanel.setBackground(Color.LIGHT_GRAY);

        // create number buttons (array of buttons) //
        numberButtonArray = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton("" + i);
            numberButtonArray.add(button);
            button.setPreferredSize(new Dimension(50, 50));
            numberButtonsPanel.add(numberButtonArray.get(i));
            int finalI = i;
            numberButtonArray.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    curr += finalI;
                    text.setText(curr);
                    result += curr;
                }
            });
        }

        // set it on the frame //
        frame.getContentPane().add(numberButtonsPanel, BorderLayout.CENTER);

        // create panel of sign buttons and set its color
        JPanel signButtonsPanel = new JPanel();
        signButtonsPanel.setBackground(Color.LIGHT_GRAY);
        signButtonsPanel.setLayout(new BoxLayout(signButtonsPanel, BoxLayout.X_AXIS));

        // create sign buttons (array of buttons) //
        signButtonArray = new ArrayList<>();
        char[] chars = new char[]{'+', '-', '*', '/', '%', '='};
        for (int i = 0; i < chars.length; i++) {
            JButton button = new JButton("" + chars[i]);
            signButtonArray.add(button);
            button.setPreferredSize(new Dimension(75, 75));
            signButtonsPanel.add(signButtonArray.get(i));
            int finalI = i;
            signButtonArray.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    curr = "";
                    curr += chars[finalI];
                    text.setText(curr);
                    curr = "";
                }
            });
        }

        // add singPanel on frame //
        frame.getContentPane().add(signButtonsPanel, BorderLayout.SOUTH);

        // frame settings //
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width /2 - 150, dimension.height / 2 - 150, 300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}
