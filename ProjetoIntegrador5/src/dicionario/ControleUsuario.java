package dicionario;

public class ControleUsuario {

    public boolean salvar(Usuario u) {

        Arquivo arq = new Arquivo("usuario.txt");

        if (arq.abrirEscrita(true)) {

            String registro = u.getUsuario()
                    + ";"
                    + u.getSenha();

            arq.escreverLinha(registro);

            arq.fecharArquivo();

            return true;
        } else {
            return false;
        }
    }

    public boolean verifica(String usuario, String senha) {
        Arquivo arq = new Arquivo("usuario.txt");

        if (arq.abrirLeitura()) {

            String linha = arq.lerLinha();

            while (linha != null) {

                String[] conteudo = linha.split(";");
                if (conteudo[0].equalsIgnoreCase(usuario)
                        && conteudo[1].equalsIgnoreCase(senha)) {
                    return true;
                }

                linha = arq.lerLinha();
            }

            arq.fecharArquivo();

            return false;
        } else {
            return false;
        }
    }
}
