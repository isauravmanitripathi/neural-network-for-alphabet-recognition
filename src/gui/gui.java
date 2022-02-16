//https://github.com/MajewskiKrzysztof/Neural-Network-Handwriting-Recognition-Java/blob/master/src/gui/MainGui.java
// first commit from personal computer
package gui;
import data.outputs;
import data.pixels;
import data.writefiles;
import gui.components.panel;
import gui.components.draw;
import neural.train;
import neural.trainingset;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Dictionary;


public class gui {

    private final int resolution = 20;
    private train netwroktrainer;
    private JPanel mainPanel;
    private draw drawingpanel;
    private panel results;

    private JButton clearButton;
    private JButton trainbutton;
    private JButton transforButton;
    private JButton helpbutton;
    private JButton tariningnetworkbutton;
    private JButton drawLetterbutton;
    private JTextField trainingsetsamount;
    private JComboBox<String> drawletter;
    private JComboBox<String> trainingascombo;
    private JTextArea outputTextArea;

    public static void main(String [] args) {
        new gui();
    }

    public gui(){
        super("Draw the letters here");
        netwroktrainer = new train();
        setmainpanel();
        setleftside();
        setcentrearea();
        setrightside();
        setoutputpanel();

        setonclicks();
        setdefaultcloseoperations(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(new Dimension(1260, 600));
        setLocationRelativeTo(null);
        setResizable(false);

    }

    private void setmainpanel(){
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.cyan);
        setLocationRelativeTo(null);
        setcentrearea(false);

    }
    private void setleftside(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize(new Dimension(410,440));

        drawLetterbutton = new JButton("draw");
        drawletter = new JComboBox<>(new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Z", "Y"});

        drawingpanel = new draw(400, 400, RESOLUTION);

        panel.add(drawLetterbutton);
        panel.add(drawletter);
        panel.add(drawingpanel);

        mainPanel.add(panel);


    }
    private void setcentrearea(){
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setPreferredSize(new Dimension(200,400));
        GridBagConstraints

    }
    private void setrightside(){

    }
    private void setoutputpanel(){

    }
    private void setonclicks(){

    }
    private void setdefaultcloseoperations(){

    }
    private void setVisible(){

    }
    private void setSize(){

    }
    private void setLocationRelativeTo(){

    }
    private void setResizable(){

    }


}
