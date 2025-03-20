package br.ada.desenvolva1321.trabalho.word;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class WordPractice {

    private static final String[] WORDS = {"Arroz", "Feijão", "Ovo", "Frito", "Radar", "Osso"};

    public List<String> wordsLessThan5Characters() {
        //Filtre apenas palavras que possuem menos de 5 caracteres
        Arrays.stream(WORDS);
        return null;

    }

    public List<String> words5Characters() {
        // Filtre apenas palavras que possuem 5 caracteres
        Arrays.stream(WORDS);
        return null;
    }

    public List<String> wordsGreaterThan5Characters() {
        // Filtre apenas palavras que possuem mais de 5 caracteres
        Arrays.stream(WORDS);
        return null;
    }

    public List<String> wordsArePalindromes() {
        // Identifique e retorne as palavras que sejam palíndromos(são iguais de trás para frente, exemplo: Radar)
        Arrays.stream(WORDS);
        return null;
    }

    public Map<String, Integer> countLetterEachWord() {
        //EXTRA
        //Calcule quantos caracteres cada palavra têm, o retorno deve ser a palavra -> quantidade de carateres. Exemplo: Osso -> 4
        Arrays.stream(WORDS);
        return null;
    }


    public Integer countLettersAllWordHave() {
        // EXTRA
        // Calcule quantos caracteres tem todas as palavras têm juntas.
        Arrays.stream(WORDS);
        return null;
    }

}
