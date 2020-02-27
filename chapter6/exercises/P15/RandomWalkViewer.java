package chapter6.exercises.P15;

import javax.swing.*;
import java.util.Random;

/**
 * @author LanXue
 * @date 2020-02-27 21:03
 */
public class RandomWalkViewer {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(800, 700);
        frame.setLocation(300, 100);
        frame.setTitle("RandomWalk Stimulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RandomWalkComponent component = new RandomWalkComponent();

        frame.add(component);
        frame.setVisible(true);

    }
}
