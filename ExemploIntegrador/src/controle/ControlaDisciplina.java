package controle;

// Imports apoio.Arquivo e entidade.Disciplina
import apoio.Arquivo;
import entidade.Disciplina;

public class ControlaDisciplina {   
    // Método salvar, parâmetros 'd' do tipo Disciplina e boolean 'anexar'
    // Faz referência a Arquivo.abrirEscrita, Arquivo.escreverLinha, Arquivo.fecharArquivo
    // anexar = false -> substitui conteudo existente no arquivo
    // anexar = true  -> preserva conteudo existente, adicionando no final    
    public boolean salvar(Disciplina d, boolean anexar) {

        // Cria arquivo ou acessa arquivo existente
        Arquivo arq = new Arquivo("disciplinas.txt");
        
        // Abre para escrita, adicionando ao final = parametro TRUE
        if (arq.abrirEscrita(anexar)) {

            // String registro que concatena cada atributo da classe com ;       
            String registro = d.getCodigo()
                    + ";"
                    + d.getNome()
                    + ";"
                    + d.getEmenta();

            arq.escreverLinha(registro);

            // Necessário fechar o arquivo para finalizar o processo
            arq.fecharArquivo();

            return true;
        } else {
            return false;
        }
    }

    // Método consultar, parâmetro String 'descricao'
    // Faz referência a Arquivo.abrirLeitura, Arquivo.lerLinha, Arquivo.fecharArquivo    
    public String consultar(String codigo, String descricao) {
        Arquivo arq = new Arquivo("disciplinas.txt");

        String retorno = "";

        // Verifica se é possivel abrir arquivo para leitura
        if (arq.abrirLeitura()) {

            String linha = arq.lerLinha();
                     
            while (linha != null) {
                // O método split quebra String em várias substrings a partir de caracter definido                                                   
                String linhaSplit[] = linha.split(";");             
                // linhaSplit[1] - Verifica se Nome da Disciplina contém descricao
                if (linhaSplit[1].toLowerCase().contains(descricao.toLowerCase())) {                
                    // Vai concatenando na String "retorno" o conteúdo do arquivo Texto               
                    retorno = retorno + linha + "\n";                              
                }
                // Verifica se ou Codigo ou Nome da Disciplina já estão cadastrados
                // para evitar que duas disciplinas iguais sejam cadastradas.     
                if ((codigo.isEmpty()) && (linhaSplit[0].equals(codigo))) {
                    // retorno recebe "X" e encerra o método aqui
                    retorno = "X"; // vou usar "X" para dizer que a disciplina já está cadastrada
                    return retorno;                 
                }
                if (linhaSplit[1].equalsIgnoreCase(descricao.toLowerCase())) {
                    // retorno recebe "X" e encerra o método aqui
                    retorno = "X"; // vou usar "X" para dizer que a disciplina já está cadastrada               
                    return retorno;
                }
                linha = arq.lerLinha();  
            }
            
            // Necessario fechar o arquivo para finalizar o processo
            arq.fecharArquivo();
   
            if (retorno.isEmpty()) {
                return null;
            } else {
                return retorno;
            }            
        } else {
            return null;
        }
    }

}
