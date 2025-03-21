package br.ada.desenvolva1321;

import br.ada.desenvolva1321.exercises.Pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MainStream2 {

    public static void main(String[] args) {
//        pessoas().stream()
//                .map(pessoa -> pessoa.getName())
//                .forEach(nome -> System.out.println(nome));

//        pessoas().stream()
//                .map(pessoa -> pessoa.getName())
//                .distinct()
//                .forEach(nome -> System.out.println(nome));

        // Filtrar todas as pessoas que nasceram depois de 1985
        pessoas().stream()
                .filter(pessoa -> pessoa.getDateBirth().getYear() > 1985)
                .map((pessoa) -> pessoa.getName() + " - " + pessoa.getDateBirth())
                .forEach(System.out::println);

//        List<String> nomes = new ArrayList<>();
//        for (Pessoa pessoa : pessoas()) {
//            if (!nomes.contains(pessoa.getName())) {
//                nomes.add(pessoa.getName());
//            }
//        }
//        System.out.println(nomes);

//        for (Pessoa pessoa : pessoas()) {
//            String name = converter.apply(pessoa);
//            System.out.println(name);
//        }
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
