package org.example.utils;

import java.util.ArrayList;
import java.util.Map;

public class MatrixUtils {
    private MatrixUtils() {
    }

    // преобразую текст в матрицу символов
    public static char[][] textInMatrix(String text, int keyLength) {
        char[][] matrix = new char[(int) Math.ceil((double) text.length() / keyLength)][keyLength];
        int textCharId = 0;
        for (int x = 0; x < (int) Math.ceil((double) text.length() / keyLength); x++) {
            for (int y = 0; y < keyLength; y++) {
                if (textCharId <= text.toCharArray().length - 1) {
                    matrix[x][y] = text.toCharArray()[textCharId];
                    textCharId++;
                } else {
                    matrix[x][y] = ' ';
                }
            }
        }
        return matrix;
    }

    // создаю массив строк по столбцам
    public static String[] getColumMatrix(char[][] matrix, int keyLength, int textLength) {
        StringBuilder s = new StringBuilder();
        int k = 0;
        while (k < keyLength) {
            for (int j = 0; j < (int) Math.ceil((double) textLength / keyLength); j++) {
                s.append(matrix[j][k]);
            }
            s.append("/");
            k++;
        }

        return s.toString().split("/");
    }

    // преобразую массив строк по столбцам в преждний вид (для расшифровки 2-ого метода)
    public static String columInText(String[] columns, Map<Integer, Integer> consistency, int matrixWight, int matrixHeight) {
        StringBuilder s = new StringBuilder();
        String[] sortByKeyIndex = new String[columns.length];
        for (int i = 0; i < matrixWight; i++) {
            for (int j = 1; j <= matrixWight; j++) {
                if (consistency.get(j) == i)
                    sortByKeyIndex[i] = columns[j - 1];
            }
        }

        for (int i = 0; i < matrixHeight; i++) {
            for (String item : sortByKeyIndex) {
                if (i < item.length())
                    s.append(item.charAt(i));
            }
        }

        return s.toString();
    }

    // ищу координаты символов в полибианском квадрате
    public static ArrayListContainer findСoordinate(char[][] array, char[] chars) {
        ArrayList<Integer> line = new ArrayList<>();
        ArrayList<Integer> colum = new ArrayList<>();

        for (char ch : chars) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == ch) {
                        line.add(i);
                        colum.add(j);
                    }
                }
            }
        }

        return new ArrayListContainer(line, colum);
    }

    public static  ArrayList<Integer> coordinateInOneLine(char[][] array, char[] chars) {
        ArrayList<Integer> line = new ArrayList<>();

        for (char ch : chars) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == ch) {
                        line.add(i);
                        line.add(j);
                    }
                }
            }
        }

        return line;
    }
}