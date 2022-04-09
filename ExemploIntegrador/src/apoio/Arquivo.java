package apoio;

/* As classes FileWriter e BufferedWriter servem para escrever em arquivos de texto.
A classe FileWriter serve para escrever diretamente no arquivo, enquanto a classe
BufferedWriter, além de ter um desempenho melhor, possui alguns métodos que
são independentes de sistema operacional, como quebra de linhas.

As classes FileReader e BufferedReader servem para ler arquivos em formato texto.

java.io para FileReader, FileWriter, BufferedReader e BufferedWriter
*/
import java.io.*;

public class Arquivo {

    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String nomeArquivo;
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
                // FileReader - Classe para leitura de arquivos texto
                // Construtor FileReader, recebe como parâmetro nomeArquivo
                fileReader = new FileReader(nomeArquivo);
            } catch (FileNotFoundException e) {
                System.err.println("-- Arquivo \"" + nomeArquivo + "\" não encontrado");
                sucesso = false;
            }
            if (sucesso) {
                status = 'R'; // Closed, Read, Write            
                // Construtor BufferedReader, recebe como parâmetro fileReader                
                bufferedReader = new BufferedReader(fileReader);
            }
        }
        return (sucesso);
    }

    // Abre arquivo para escrita
    // anexar = false -> substitui conteúdo existente no arquivo
    // anexar = true  -> preserva conteúdo existente, adicionando no final
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
                status = 'W'; // Closed, Read, Write              
                bufferedWriter = new BufferedWriter(fileWriter);
            }
        }
        return (sucesso);
    }

    // Lê uma linha do arquivo texto
    public String lerLinha() {
        String linha = null;
        if (status == 'R') {
            try {
                // Lê uma linha do arquivo texto
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

    // Escreve uma linha no arquivo texto
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

    // Fecha arquivo texto
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
