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
    private JTextField trainingsetsamount;
    private JComboBox<String> drawletter;
    private JComboBox<String> trainingascombo;
    private JTextArea outputTextArea;

    public static void main(String [] args) {
        new gui();
    }
}
