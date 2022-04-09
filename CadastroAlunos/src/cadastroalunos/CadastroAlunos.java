package cadastroalunos;

/**
 *
 * @author ander
 */
public class CadastroAlunos {

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[10];

        for (int i = 0; i < alunos.length; i++) {
            String nome = Entrada.leiaString("Informe o nome do " + (i + 1) + "º aluno:");
            String dataNascimento = Entrada.leiaString("Informe a data de nascimento do " + (i + 1) + "º aluno:");

            String cidDescricao = Entrada.leiaString("Informe a cidade do " + (i + 1) + "º aluno:");
            String cep = Entrada.leiaString("Informe o CEP da cidade do " + (i + 1) + "º aluno:");

            String relDescricao = Entrada.leiaString("Informe a Religião do " + (i + 1) + "º aluno:");
            String estCivDescri = Entrada.leiaString("Informe o estado civil do " + (i + 1) + "º aluno:");

            Cidade cidade = new Cidade(cidDescricao, cep);
            Religiao religiao = new Religiao(relDescricao);
            EstadoCivil estadoCivil = new EstadoCivil(estCivDescri);

            alunos[i] = new Aluno(nome, dataNascimento, religiao,estadoCivil,cidade);

        }
        for ( Aluno aluno : alunos){
            System.out.println("\nNome: " + aluno.getNome() + "\nData de nascimento: "
            + aluno.getDataNascimento() + "\nEstado civil: " + aluno.getEstadoCivil() 
            + "\nReligião: " + aluno.getReligiao() + "\nCidade: " + aluno.getCidade().getDescricao()
            + " - CEP: ");
        }
    }

}
