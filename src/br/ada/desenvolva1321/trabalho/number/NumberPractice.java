package br.ada.desenvolva1321.trabalho.number;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class NumberPractice {

    private static final Integer[] NUMBERS = {4, 1, 1, 8, 1, 7, 3, 2, 3, 4};

    public List<Integer> numbersLessThan5() {
        // Filtre todos os números que são menores que 5
        return Arrays.stream(NUMBERS)
                .filter(number -> number < 5)
                .collect(Collectors.toList());
    }

    public Set<Integer> removeRepeatNumbers() {
        // Remova os números repetidos
        return Arrays.stream(NUMBERS)
                .collect(Collectors.toSet());
    }

    public Integer sumAllNumbers() {
        // Calcule a soma total dos números.
        return Arrays.stream(NUMBERS)
                .reduce((first, second) -> first + second)
                //.reduce(Integer::sum) //mesma coisa que o de cima
                .orElse(0);
    }

    public Integer sumNumbersWithoutRepeats() {
        // Some todos os números, porém não utilize os repetidos
        return Arrays.stream(NUMBERS)
                .distinct()
                .reduce(0, (first, second) -> first + second);
    }

    public Map<Integer, Long> countRepeatedNumber() {
        // EXTRA
        // Conte quantas vezes cada número aparece na lista. Exemplo de retorno: 4 -> 2, 1 -> 3
        return Arrays.stream(NUMBERS)
                .collect(
                        Collectors.groupingBy(
                            number -> number,
                            Collectors.counting()
                        )
                );
    }

}
