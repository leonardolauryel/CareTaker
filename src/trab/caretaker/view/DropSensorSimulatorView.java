package trab.caretaker.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DropSensorSimulatorView extends JFrame implements Runnable {
    private JPanel fallSimulator;
    private JLabel lblFallSimulator;
    private JCheckBox cboxOnPulse;
    private JButton btnFall;
    private Boolean itFellToTheGround = false;
    private Boolean itIsInArm = false;

    public DropSensorSimulatorView(){
        super("Simulador de quedas");
        setContentPane(fallSimulator);
        pack();
        setVisible(true);
        btnFall.addActionListener(new ActionListener() {
            @Override
            public synchronized void actionPerformed(ActionEvent e) {
                itFellToTheGround = true;
                notifyAll();
            }
        });
        cboxOnPulse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                itIsInArm = !itIsInArm;
            }
        });
        run();
    }

    public Boolean getItFellToTheGround(){
        return itFellToTheGround;
    }

    public void setItFellToTheGround(Boolean itFellToTheGround){
        this.itFellToTheGround = itFellToTheGround;
        notifyAll();
    }

    public Boolean getItIsInArm(){
        return itIsInArm;
    }

    public void run(){
        try{
            verifyFall();
        }
        catch (InterruptedException e){}

    }

    private synchronized void verifyFall() throws InterruptedException{
        while(!itFellToTheGround){
            wait();
        }
    }

}
