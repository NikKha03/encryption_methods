package org.example.utils;

import java.util.HashMap;
import java.util.Map;

public class Utils {
    private Utils() {}

    // для разбивания текста по n количеству символов
    public static String numCharString(String text, int n) {
        String[] textArr = text.split("(?<=\\G.{" + n + "})");
        for (int i = 1; i < textArr.length; i++) {
            textArr[i] = " " + textArr[i];
        }
        StringBuilder modText = new StringBuilder();
        for (String i : textArr) {
            modText.append(i);
        }
        return modText.toString();
    }

    public static char[] sortBySymbols(char[] charArrayKey, char[] charArrayKeySymbols) {
        Map<Integer, Character> consistency = new HashMap<>();
        int count = 0;
        while (count < charArrayKeySymbols.length) {
            for (int i = 0; i < charArrayKey.length; i++) {
                if (charArrayKey[i] == charArrayKeySymbols[count]) {
                    consistency.put(count + 1, charArrayKey[i]);
                }
            }
            count += 1;
        }
        return null;
    }
}
