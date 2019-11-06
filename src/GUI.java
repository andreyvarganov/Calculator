import javax.swing.*;
import java.awt.*;
import java.util.*;

public class GUI {

    private ArrayList<JButton> signButtonArray;

    public void createGUI() {

        // create main frame //
        JFrame frame = new JFrame("Simple Calculator");

        // create output window //
        JTextField output = new JTextField();
        output.setToolTipText("Result");
        output.setFont(new Font("Times New Roman", Font.BOLD, 30));
        frame.getContentPane().add(output, BorderLayout.NORTH);

        // create panel of buttons//
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setBackground(Color.LIGHT_GRAY);

        // create array of buttons and adding it on the panel //
        ArrayList<JButton> buttonArray = new ArrayList<>();
        char[] operations = {'+', '-', '*', '/', '%', '='};
        JButton button;
        int j = 0;

        for (int i = 0; i < 16; i++) {
            if (i < 9) {
                button = new JButton("" + (i + 1));
                buttonArray.add(button);
            }
            else if (i == 9) {
                button = new JButton("" + 0);
                buttonArray.add(button);
            }
            else {
                button = new JButton("" + operations[j++]);
                buttonArray.add(button);
            }
            button.setPreferredSize(new Dimension(50, 50));
            buttonsPanel.add(buttonArray.get(i));
        }

        // set our panel on the frame //
        frame.getContentPane().add(buttonsPanel, BorderLayout.CENTER);

        // frame settings //
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width /2 - 150, dimension.height / 2 - 150, 300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
