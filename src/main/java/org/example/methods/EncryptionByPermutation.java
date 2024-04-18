package org.example.methods;

import org.example.utils.AlphabetVocabulary;
import org.example.utils.CipherUtils;
import org.example.utils.MatrixUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class EncryptionByPermutation implements Method {
    @Override
    public String ciphering(String symbols, String key, String text) throws Exception {
        // обработанный ключ и текст
        String processedKey = CipherUtils.cipherPreparation(key);
        String processedText = CipherUtils.cipherPreparation(text);

        // длина ключа
        int keyLength = processedKey.length();

        // посимвольно вписанный текст в матрицу
        char[][] textInMatrix = MatrixUtils.textInMatrix(processedText, keyLength);
        // массив строк по столбцам
        String[] columnMatrix = MatrixUtils.getColumMatrix(textInMatrix, keyLength, processedText.length());
        // словарь, где key - порядковый номер, value - id символа в ключе
        Map<Integer, Integer> consistency = AlphabetVocabulary.positionAndIndex(processedKey, symbols);

        // зашифрованный текст
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= keyLength; i++) {
            result.append(columnMatrix[consistency.get(i)]);
        }

        return result.toString().replaceAll(" ", "");
    }

    @Override
    public String deciphering(String symbols, String key, String text) throws Exception {
        String processedKey = CipherUtils.cipherPreparation(key);
        String processedText = CipherUtils.cipherPreparation(text);

        // словарь, где key - порядковый номер, value - id символа в ключе
        Map<Integer, Integer> consistency = AlphabetVocabulary.positionAndIndex(processedKey, symbols);

        int matrixWight = processedKey.length();
        int matrixHeight = (int) Math.ceil((double) processedText.length() / matrixWight);

        String[] columns = new String[consistency.size()];

        // количество столбцов с пустой ячейкой
        int countEmptyCells = matrixWight * matrixHeight - processedText.length();
        // список id столбцов с пустой ячейкой
        ArrayList<Integer> idCharWithEmptyCells = new ArrayList<>();
        while (countEmptyCells > 0) {
            idCharWithEmptyCells.add(matrixWight - countEmptyCells);
            countEmptyCells -= 1;
        }

        // разбил зашифрованный текст по столбцам в последовательном порядке
        int a = 0;
        for (int i = 1; i <= matrixWight; i++) {
            // если столбец имеет путую ячейку, то...
            if (Arrays.asList(idCharWithEmptyCells.toArray()).contains(consistency.get(i))) {
                int ex = matrixHeight - 1;

                columns[i - 1] = processedText.substring(a, a + ex);
                a += ex;
            } else {
                columns[i - 1] = processedText.substring(a, a + matrixHeight);
                a += matrixHeight;
            }
        }

        return MatrixUtils.columInText(columns, consistency, matrixWight, matrixHeight);
    }
}
