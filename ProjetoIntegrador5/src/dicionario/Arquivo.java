package dicionario;

import java.io.*;

public class Arquivo {

    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private final String nomeArquivo;
    private char status;

    // Construtor
    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        status = 'C'; // Closed, Read, Write
    }

    // Abre arquivo para leitura
    public boolean abrirLeitura() {
        boolean sucesso = true;
        FileReader fileReader = null;
        if (status != 'C') {
            System.err.println("-- Arquivo \"" + nomeArquivo + "\" já está aberto");
            sucesso = false;
        } else {
            try {
                
                // A classe FileReader recebe como argumento o objeto File do arquivo a ser lido
                // construtor que recebe o objeto do tipo arquivo
                fileReader = new FileReader(nomeArquivo);
            } catch (FileNotFoundException e) {
                System.err.println("-- Arquivo \"" + nomeArquivo + "\" não encontrado");
                sucesso = false;
            }
            if (sucesso) {
                status = 'R';
                // A classe BufferedReader, fornece o método readLine() para leitura do arquivo
                // construtor que recebe o objeto do tipo FileReader                
                bufferedReader = new BufferedReader(fileReader);
            }
        }
        return (sucesso);
    }

    // Abre arquivo para escrita
    // anexar = false -> substitui conteudo existente no arquivo
    // anexar = true  -> preserva conteudo existente, adicionando no final
    public boolean abrirEscrita(boolean anexar) {
        boolean sucesso = true;
        FileWriter fileWriter = null;
        if (status != 'C') {
            System.err.println("-- Arquivo \"" + nomeArquivo + "\" já está aberto");
            sucesso = false;
        } else {
            try {
                fileWriter = new FileWriter(nomeArquivo, anexar);
            } catch (IOException e) {
                System.err.println("-- Erro de escrita no arquivo \"" + nomeArquivo + "\"");
                sucesso = false;
            }
            if (sucesso) {
                status = 'W';
                // A classe BufferedWriter serve para escrever diretamente no arquivo
                // construtor que recebe o objeto do tipo arquivo                
                bufferedWriter = new BufferedWriter(fileWriter);
            }
        }
        return (sucesso);
    }

    // Lê linha por linha do arquivo aberto
    public String lerLinha() {
        String linha = null;
        if (status == 'R') {
            try {
                // A classe BufferedReader, fornece o método readLine() para leitura do arquivo
                linha = bufferedReader.readLine();
            } catch (IOException e) {
                System.err.println("-- Erro de leitura no arquivo \"" + nomeArquivo + "\"");
            }
        } else {
            System.err.println("-- Arquivo \"" + nomeArquivo + "\" não está pronto para leitura");
        }
        // Retorna uma linha do arquivo texto
        return (linha);
    }

    // Escreve uma linha no arquivo aberto
    public void escreverLinha(String linha) {
        if (status == 'W') {
            try {
                // BufferedWriter escreve conteúdo no arquivo através do método write():
                bufferedWriter.write(linha + "\n");
            } catch (IOException e) {
                System.err.println("Erro de escrita no arquivo \"" + nomeArquivo + "\"");
            }
        } else {
            System.err.println("-- Arquivo \"" + nomeArquivo + "\" não está pronto para escrita");
        }
    }

    // Fecha arquivo
    public void fecharArquivo() {
        if (status == 'R') // estava aberto para leitura
        {
            try {
                bufferedReader.close();
                status = 'C';
            } catch (IOException e) {
                System.err.println("Erro ao fechar o arquivo \"" + nomeArquivo + "\"");
            }
        }
        if (status == 'W') // estava aberto para gravação
        {
            try {
                bufferedWriter.close();
                status = 'C';
            } catch (IOException e) {
                System.err.println("Erro ao fechar o arquivo \"" + nomeArquivo + "\"");
            }
        }
    }
}
