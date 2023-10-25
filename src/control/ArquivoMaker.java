package control;

import view.AMinterface;

import java.io.*;

public class ArquivoMaker implements AMinterface {

    @Override
    public void verificarArquivo(String path, String nome) throws IOException {
        File file = new File(path,nome);
        if(file.exists() && file.isFile()){
            System.out.println("""
                    Arquivo detectado, lendo informações...
                    ========================================
                    """);
        } else {
            throw new IOException();
        }
    }

    @Override
    public void lerFile(String path, String nome) throws IOException {
        File file = new File(path,nome);
        FileInputStream fluxo = new FileInputStream(file);
        InputStreamReader leitor = new InputStreamReader(fluxo);
        BufferedReader buffer = new BufferedReader(leitor);

        String linhaAtual = buffer.readLine();
        while (linhaAtual != null){
            tratamento(linhaAtual);
            //System.out.println(linhaAtual);
            linhaAtual = buffer.readLine();
        }

        fluxo.close();
        leitor.close();
        buffer.close();

    }

    private void tratamento(String linha) {
        String[] elementos = linha.split(",");
        if(elementos[2].contains("Fruit")){
            System.out.println(elementos[0]+"\t"+elementos[1]+"\t"+
                    elementos[3]);
        }
        //esses outputs NÃO QUEREM SAIR ALINHADOS AAAAAAAAAA
    }


}
