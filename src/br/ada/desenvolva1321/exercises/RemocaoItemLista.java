package br.ada.desenvolva1321.exercises;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RemocaoItemLista {

    public static void main(String[] args) {
        List<Pessoa> pessoas = pessoas();
        // Filtre as pessoas com menos de 4 caracteres no primeiro nome
        // e as remova da lista.
        pessoas.removeIf(pessoa -> {
            var primeiroNome = pessoa.getName().split(" ")[0];
            return primeiroNome.length() < 4;
        });

        pessoas.forEach(System.out::println);
        pessoas.forEach(pessoa -> System.out.println(pessoa.getName()));
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
        return pessoas;
    }

}
