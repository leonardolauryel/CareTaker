package trab.caretaker.control;

import trab.caretaker.view.Window;

public class Watch {
    private Boolean dropped;
    private Boolean onArm;
    Window window;

    public Boolean isOnArm(){
        return onArm;
    }

    public void updateMotionSensorStatus(Boolean dropped, Boolean onArm){
        if(dropped)
            this.dropped = dropped;
        if(onArm)
            this.onArm = onArm;
    }

    public Boolean fallDetect(){
        return dropped && onArm;
    }

}
