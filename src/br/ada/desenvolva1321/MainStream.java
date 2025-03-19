package br.ada.desenvolva1321;

import br.ada.desenvolva1321.exercises.Pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream {

    public static void main(String[] args) {
        var nomesLista = pessoas().stream()
                .map(Pessoa::getName)
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(nomesLista);

        var nomesString = pessoas().stream()//[1, alice]; [2, bob]; [11, alice]
                .map(Pessoa::getName)// [alice]; [bob]; [alice]
                .filter(name -> name.startsWith("A"))// [alice]; [alice]
                .reduce((nome1, nome2) -> nome1 + ", " + nome2)// [alice, alice]
                .orElse("Vazio");
        System.out.println(nomesString);

        // Dado que possuo a lista de pessoas calcule a soma total das idades
        // idade = ano atual - ano de nascimento
        // reduce = idade1, idade2 -> idade1 + idade2
        var currentYear = LocalDate.now().getYear();
        var somaIdade = pessoas().stream()
                .map(pessoa -> currentYear - pessoa.getDateBirth().getYear())
                .reduce((idade1, idade2) -> idade1 + idade2)
                .orElse(0);
        System.out.println("A soma de todas as idades é: " + somaIdade);

        // Dado que possuo a lista de pessoas, encontre a pessoa mais nova na lista
        var pessoaMaisNova = pessoas().stream()
                .max(Comparator.comparing(Pessoa::getDateBirth))
                .orElse(null);
        System.out.println(pessoaMaisNova);

        // Dado que possuo a lista de pessoas, encontre a pessoa mais idosa da lista


        // Dado que possuo a lista de pessoas, conte quantas letras cada nome possui
        // Exemplo de resultado: Alice Johnson - 12, Bob Smith - 8
    }

    public static List<Pessoa> pessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1L, "Alice Johnson", "1234567890", LocalDate.of(1985, 11, 15)));
        pessoas.add(new Pessoa(2L, "Bob Smith", "9876543210", LocalDate.of(1990, 5, 20)));
        pessoas.add(new Pessoa(3L, "Bob Brown", "5555555555", LocalDate.of(1975, 9, 30)));
        pessoas.add(new Pessoa(4L, "David Lee", "4444444444", LocalDate.of(1995, 2, 10)));
        pessoas.add(new Pessoa(5L, "Emily Davis", "3333333333", LocalDate.of(1988, 7, 25)));
        pessoas.add(new Pessoa(6L, "Frank Wilson", "2222222222", LocalDate.of(1970, 12, 5)));
        pessoas.add(new Pessoa(7L, "Grace Miller", "1111111111", LocalDate.of(1992, 3, 18)));
        pessoas.add(new Pessoa(8L, "Henry Baker", "0000000000", LocalDate.of(1982, 8, 7)));
        pessoas.add(new Pessoa(9L, "Isabella Green", "9999999999", LocalDate.of(1997, 4, 12)));
        pessoas.add(new Pessoa(10L, "Jack Taylor", "8888888888", LocalDate.of(1978, 6, 23)));
        pessoas.add(new Pessoa(11L, "Alice Cooper", "156143541695", LocalDate.of(1978, 6, 23)));
        return pessoas;
    }

}
