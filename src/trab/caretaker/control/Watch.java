package trab.caretaker.control;

import trab.caretaker.view.DropSensorSimulatorView;
import trab.caretaker.view.WatchView;

public class Watch extends WatchView{
    private Boolean dropped;
    private Boolean onArm;
    WatchView watchView;
    DropSensorSimulatorView dropSensorSimulatorView;

    public void run(){
        dropSensorSimulatorView = new DropSensorSimulatorView();
    }

    public Boolean isOnArm(){
        return onArm;
    }

    public void updateMotionSensorStatus(){
        dropped = dropSensorSimulatorView.getItFellToTheGround();
        onArm = dropSensorSimulatorView.getItIsInArm();
    }


    public Boolean fallDetect(){
        return dropped;
    }


}
