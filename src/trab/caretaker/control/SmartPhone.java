package trab.caretaker.control;

import java.util.HashMap;
import java.util.Map;

public class SmartPhone {
    private String emergencyNumber;
    private Map<String,String> contacts;
    private String screen;
    private String emergencyMessage;

    public SmartPhone(){
        contacts = new HashMap<String, String>();
        emergencyMessage = "Socorro! Eu caí! (mensagem enviada automaticamente pelo CareTaker)";
    }

    public void setEmergencyNumber(String emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
        screen = "Telefone de emergência adicionado\n";
    }

    public void addContact(String name, String phone) {
        this.contacts.put(name,phone);
        screen = "Contato adicionado\n";
    }

    public void callEmergency(){

    }

    public void showContactList(){
        if (contacts.size() > 0) {
            screen = "Lista de contatos:\n";
            contacts.forEach((k, v) -> screen = screen.concat(k + ": " + v + "\n"));
        }
        else
            screen = "Você não possui contatos\n";
    }

    public void showEmergencyNumber(){
        screen = (emergencyNumber != null ? "Telefone de emergência: " + emergencyNumber : "Nenhum número de emergência foi cadastrado" )+ "\n";
    }

    public Map<String, String> getContacts() {
        return contacts;
    }

    public String getEmergencyNumber() {
        return emergencyNumber;
    }

    public String getScreen() {
        return screen;
    }

    public void setEmergencyMessage(String emergencyMessage) {
        if(emergencyMessage != null) {
            this.emergencyMessage = emergencyMessage;
            screen = "Mensagem de emergência cadastrada";
        }
    }

    public String getEmergencyMessage() {
        return emergencyMessage;
    }
}
