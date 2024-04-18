package org.example.methods;

import org.example.utils.AlphabetVocabulary;
import org.example.utils.CipherUtils;

import java.util.Map;

public class MonoAlphabeticReplacement implements Method {
    @Override
    public String ciphering(String symbols, String key, String text) throws Exception {
        // мой алфавит
        String myAlphabet = CipherUtils.myAlphabet(key, symbols);

        // передаю текст для шифрования, словарь, где key - символ стандартного алфавита, value - символ моего алфавита
        return cipherAndDecipher(text, AlphabetVocabulary.alphabetVocabulary(symbols, myAlphabet));
    }

    @Override
    public String deciphering(String symbols, String key, String text) throws Exception {
        // мой алфавит
        String myAlphabet = CipherUtils.myAlphabet(key, symbols);

        // передаю текст для расшифровки, словарь, где key - символ моего алфавита, value - символ стандартого алфавита
        return cipherAndDecipher(text, AlphabetVocabulary.alphabetVocabulary(myAlphabet, symbols));
    }

    public String cipherAndDecipher(String str, Map<Character, Character> vocabulary) {
        StringBuilder result = new StringBuilder();

        char[] charArray = CipherUtils.cipherPreparation(str).toCharArray();

        // прохожу по тексту и шифрую в соответствии со словарем
        for (char i : charArray) {
            result.append(vocabulary.get(i));
        }

        return result.toString();
    }
}
