/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kg2019examples_task4threedimensions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

/**
 *
 * @author Alexey
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        DrawPanel dp = new DrawPanel();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        dp.setPreferredSize(new Dimension(600, 400));
        panel.add(dp);
        JButton buttonControllerModel = new JButton("Модель");
        JButton buttonRound = new JButton("Скруглить");
        JLabel labelRoundPer = new JLabel("Введите процент сркугления");
        JTextField textFieldRoundPer = new JTextField("100");
        buttonControllerModel.setPreferredSize(new Dimension(300, 50));
        buttonRound.setPreferredSize(new Dimension(300, 50));
        panel.add(labelRoundPer);
        panel.add(textFieldRoundPer);
        panel.add(buttonControllerModel);
        panel.add(buttonRound);
        buttonControllerModel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dp.setControllerCamera(false);
                dp.clearModels();
            }
        });
        buttonRound.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dp.roundParl(parseInt(textFieldRoundPer.getText()));
            }
        });
        frame.setVisible(true);
    }
}
