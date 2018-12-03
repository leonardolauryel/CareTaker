package trab.caretaker.control;

import java.util.Map;

public class Computer {
    private String screen;

    public void sendMessageTo(String message, Map<String,String> contacts){
        screen = "Enviando mensagem " + message + " para:\n";
        if (contacts.size() > 0) {
            contacts.forEach((k, v) -> screen = screen.concat(k + "\n"));
        }
        else {
            screen = screen.concat("Ninguém, pois o usuário não possui contatos\n");
            int a = 2;
        }
    }

    public void callToEmergencyNumber(String number){
        screen = "Ligando para ";
        if (number != null) {
             screen = screen.concat(number + "\n");
        }
        else
            screen = screen.concat("ninguém, pois o usuário não cadastrou um número de emergência");
    }

    public String getScreen() {
        return screen;
    }
}
