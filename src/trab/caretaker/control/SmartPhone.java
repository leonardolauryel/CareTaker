package trab.caretaker.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartPhone {
    private String emergencyNumber;
    private Map<String,String> contacts;

    public SmartPhone(){
        contacts = new HashMap<String, String>();
    }

    public void setEmergencyNumber(String emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
    }

    public void addContact(String name, String phone) {
        this.contacts.put(name,phone);
    }

    public void sendMessage(){

    }

    public void callEmergency(){

    }

    public Map<String, String> getContacts() {
        return contacts;
    }

    public String getEmergencyNumber() {
        return emergencyNumber;
    }
}
