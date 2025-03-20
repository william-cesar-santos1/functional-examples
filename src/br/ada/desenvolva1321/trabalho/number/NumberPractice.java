package br.ada.desenvolva1321.trabalho.number;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NumberPractice {

    private static final Integer[] NUMBERS = {4, 1, 1, 8, 1, 7, 3, 2, 3, 4};

    public List<Integer> numbersLessThan5() {
        // Filtre todos os números que são menores que 5
        Arrays.stream(NUMBERS);
        return null;
    }

    public Set<Integer> removeRepeatNumbers() {
        // Remova os números repetidos
        Arrays.stream(NUMBERS);
        return null;
    }

    public Integer sumAllNumbers() {
        // Calcule a soma total dos números.
        Arrays.stream(NUMBERS);
        return null;
    }

    public Integer sumNumbersWithoutRepeats() {
        // Some todos os números, porém não utilize os repetidos
        Arrays.stream(NUMBERS);
        return null;
    }

    public Map<Integer, Long> countRepeatedNumber() {
        // EXTRA
        // Conte quantas vezes cada número aparece na lista. Exemplo de retorno: 4 -> 2, 1 -> 3
        Arrays.stream(NUMBERS);
        return null;
    }

}
