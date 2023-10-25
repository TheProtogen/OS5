package view;

import control.ArquivoMaker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        AMinterface AM = new ArquivoMaker();

        String path = "C:\\TEMP";
        String nome = "generic_food.csv";

        try {
            AM.verificarArquivo(path,nome);
            AM.lerFile(path,nome);
        } catch (IOException e) {
            System.err.println("[ERRO] Nuh-uh, o arquivo não foi encontrado");
        }

    }
}
