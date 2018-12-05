package trab.caretaker.control;

import java.util.List;
import java.util.Map;

public class Computer {
    private String screen;

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

