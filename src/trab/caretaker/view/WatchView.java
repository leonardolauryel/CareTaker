package trab.caretaker.view;

import trab.caretaker.control.Watch;

import javax.swing.*;

public class WatchView extends JFrame {

    private JPanel panelMain;

    public WatchView(){
        super("Relógio");
        setContentPane(panelMain);
        pack();
        setSize(640,480);
        setVisible(true);
    }

}
