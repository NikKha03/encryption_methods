package org.example.utils;

import java.lang.*;

public class CipherUtils {
    private CipherUtils() {
    }

    public static String cipherPreparation(String data) {
        // обрабатываю данные
        return data.trim()
                .replaceAll(" ", "")
                .replaceAll(",", "")
                .replaceAll(";", "")
                .replaceAll("\\.", "")
                .replaceAll("!", "")
                .replaceAll("\\?", "")
                .replaceAll("\"", "")
                .replaceAll("\n", "")
                .replaceAll("-", "")
                .replaceAll(" ", "")
                .toUpperCase();
    }

    public static String myAlphabet(String key, String symbols) {
        // склеиваю ключ и алфавит
        String cipherKeyAndOtherSymbols = cipherPreparation(key) + symbols;
        // посимвольно расскладываю в массив
        char[] charArr = cipherKeyAndOtherSymbols.toCharArray();
        // удаляю повторения
        for (int i = 0; i < charArr.length; i++) {
            for (int j = i + 1; j < charArr.length; j++) {
                if (charArr[j] == charArr[i]) {
                    charArr[j] = '\u0000';
                }
            }
        }

        // преобразую массив в строку
        StringBuilder result = new StringBuilder();
        for (char i : charArr) {
            if (i != '\u0000') {
                result.append(i);
            }
        }

        return result.toString();
    }
}
