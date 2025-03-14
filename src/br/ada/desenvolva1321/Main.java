package br.ada.desenvolva1321;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
//        for (int index = 1; index < 101; index++) {
//            if (index % 2 == 0) {
//                System.out.println("O número é " + index);
//            }
//        }

        // [tipo] [nome] [atribuição de valor]
        String name = "William";

        IntFunction<String> converter = new ConversorDeInteiro();
        System.out.println(converter.apply(5));

        IntFunction<String> converter2 = new IntFunction<String>() {
            // Implementação anonima
            @Override
            public String apply(int numero) {
                return "O numero é: " + numero;
            }
        };
        System.out.println(converter2.apply(5));

        // [tipo]           [nome]       [atribução de valor]
        // função = [(variaveis) -> código executável]
        IntFunction<String> converter3 = (numero) -> "O numero é: " + numero;
        System.out.println(converter3.apply(5));

        IntPredicate par = numero -> numero % 2 == 0;

        IntStream.range(1, 101)
                .filter(par)
                .mapToObj(converter3)
                .forEach(System.out::println);
    }

}
