package view;

import java.io.IOException;

public interface AMinterface {
    void verificarArquivo(String path, String nome) throws IOException;

    void lerFile(String path, String nome) throws IOException;

}
