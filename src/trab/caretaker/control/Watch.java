package trab.caretaker.control;

import trab.caretaker.view.Window;

import java.util.Random;

public class Watch {
    private Boolean dropped;
    private Boolean onArm;
    private int heartBeats;

    public Watch(){
        dropped = false;
        onArm = false;
    }

    public Boolean isOnArm(){
        return onArm;
    }

    public void updateMotionSensorStatus(Boolean dropped, Boolean onArm){
        if(dropped != null)
            this.dropped = dropped;
        if(onArm != null)
            this.onArm = onArm;
    }

    public Boolean fallDetect(){
        return dropped && onArm;
    }

    public void updateHeartBeats(){
        Random r = new Random();
        this.heartBeats = r.nextInt(80) + 70;
    }

    public int getHeartBeats() {
        return heartBeats;
    }
}
