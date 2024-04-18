package org.example.utils;

import java.util.HashMap;
import java.util.Map;

public class AlphabetVocabulary {
    private static final Map<Character, Character> alphabet = new HashMap<>();

    private AlphabetVocabulary() {
    }

    // создаю словарь открытого алфавита и закрытого, где ключ это символ открытого алфавита, а значение это символ закрытого алфавита
    public static Map<Character, Character> alphabetVocabulary(String standardAlphabet, String myAlphabet) throws Exception {
        if (standardAlphabet.length() == myAlphabet.length()) {
            for (int i = 0; i < standardAlphabet.length(); i++) {
                alphabet.put(standardAlphabet.charAt(i), myAlphabet.charAt(i));
            }
        } else {
            throw new Exception("ОШИБКА! ДЛИНА АЛФАВИТОВ НЕ СОВПАДАЕТ!");
        }

        return alphabet;
    }

    // словарь, где ключь порядковый номер, а значение индекс в строке
    public static Map<Integer, Integer> positionAndIndex(String key, String symbols) {
        Map<Integer, Integer> consistency = new HashMap<>();

        char[] charArrayProcessedKey = key.toCharArray();
        // символ ключа, числовая последовательность
        int i = 0;
        int index = 1;
        while (i < symbols.toCharArray().length) {
            for (int idInKey = 0; idInKey < charArrayProcessedKey.length; idInKey++) {
                if (charArrayProcessedKey[idInKey] == symbols.toCharArray()[i]) {
                    consistency.put(index, idInKey);
                    index++;
                }
            }
            i++;
        }
        return consistency;
    }
}
