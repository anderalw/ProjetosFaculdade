package pessoasidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PessoaIdade {

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String nome = Entrada.leiaString("Informe o nome da " + (i + 1) + "º pessoa:");
            int idade = Entrada.leiaInt("Informe a idade da " + (i + 1) + "º pessoa:");
            Pessoa pessoa = new Pessoa(nome, idade);

            pessoas.add(pessoa);

        }
        pessoas.forEach(pessoa -> {
            System.out.println("Nome: " + pessoa.getNome() + " Idade: " + pessoa.getIdade());
        });

        Optional<Pessoa> idadeMaior = pessoas.stream()
                .max((p1, p2) -> p1.getIdade() - p2.getIdade());
        if (idadeMaior.isPresent()) {
            Pessoa maisVelho = idadeMaior.get();
            System.out.println("Pessoa mais velha: " + maisVelho.getNome() + " Idade: "
                    + maisVelho.getIdade());
        }
        Optional<Pessoa> idadeMenor = pessoas.stream()
                .min((p1, p2) -> p1.getIdade() - p2.getIdade());
        if (idadeMenor.isPresent()) {
            Pessoa maisNova = idadeMenor.get();
            System.out.println("Pessoa mais nova: " + maisNova.getNome() + " Idade: "
                    + maisNova.getIdade());

        }

    }
}
