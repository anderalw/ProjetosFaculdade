package dicionario;

public class ControleDicionario {

    public boolean salvar(Dicionario d, boolean anexar) {

        Arquivo arq = new Arquivo("dicionario.txt");

        if (arq.abrirEscrita(anexar)) {

            String registro = d.getCodigo()
                    + ";"
                    + d.getTermo()
                    + ";"
                    + d.getSignificado()
                    + ";"
                    + d.getFonte();

            arq.escreverLinha(registro);

            arq.fecharArquivo();

            return true;
        } else {
            return false;
        }
    }

    public String consultar(String codigo, String termo, String significado, String fonte) {
        Arquivo arq = new Arquivo("dicionario.txt");

        String retorno = "";

        if (arq.abrirLeitura()) {

            String linha = arq.lerLinha();

            while (linha != null) {
                String linhaSplit[] = linha.split(";");
                if (linhaSplit[1].toLowerCase().contains(termo.toLowerCase())) {
                    retorno = retorno + linha + "\n";
                }

                if ((codigo.isEmpty()) && (linhaSplit[0].equals(codigo))) {
                    retorno = "X";
                    return retorno;
                }

                if (linhaSplit[1].equalsIgnoreCase(termo.toLowerCase())) {
                    retorno = "X";
                    return retorno;
                }

                linha = arq.lerLinha();
            }
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
