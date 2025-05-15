// Q: How can we display a Hello message using Swing with specific font and color using JFrame and JLabel?
package others;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class HelloSwing {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Swing Hello Program");

        // Create a JLabel with the desired message
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", JLabel.CENTER);

        // Set font: Plain style, size 32
        label.setFont(new Font("SansSerif", Font.PLAIN, 32));

        // Set text color to blue
        label.setForeground(Color.BLUE);

        // Optional: Set background color and make it visible
        label.setOpaque(true);
        label.setBackground(Color.WHITE);

        // Add label to frame
        frame.add(label);

        // Set frame size and default close operation
        frame.setSize(800, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the frame on screen and make it visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
