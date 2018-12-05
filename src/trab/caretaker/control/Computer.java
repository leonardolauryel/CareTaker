package trab.caretaker.control;

import java.util.List;
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
            screen = screen.concat("ninguém, pois o usuário não cadastrou um número de emergência\n");
    }

    public String getScreen() {
        return screen;
    }

    public void sendReport(List<String> heartBeatsList){
        int i;
        int soma=0;
        screen = "Relatório:\n";
        for (i=0;i<heartBeatsList.size();i++){
            screen = screen.concat("Média semana " + String.valueOf(i+1) + ": " + heartBeatsList.get(i) + " bpm\n");
        }
        screen = screen.concat("Enviando para o médico responsável...\nRelatório enviado");
    }
}

