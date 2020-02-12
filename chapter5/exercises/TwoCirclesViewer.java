package chapter5.exercises;

import javax.swing.*;

/**
 * @author LanXue
 * @date 2020-02-12 22:13
 */
public class TwoCirclesViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Circle Viewer");
        frame.setSize(900, 900);
        frame.setLocation(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String input = JOptionPane.showInputDialog("The radius of first circle: ");
        double radius1 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("The radius of second circle: ");
        double radius2 = Double.parseDouble(input);

        if (radius1 >= 0 && radius2 >= 0) {
            TwoCirclesComponent component = new TwoCirclesComponent(radius1, radius2);
            frame.add(component);
        }

        frame.setVisible(true);
    }
}
