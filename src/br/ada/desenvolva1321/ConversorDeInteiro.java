package br.ada.desenvolva1321;

import java.util.function.IntFunction;

public class ConversorDeInteiro implements IntFunction<String> {

    @Override
    public String apply(int value) {
        return "O número é: " + value;
    }

}
