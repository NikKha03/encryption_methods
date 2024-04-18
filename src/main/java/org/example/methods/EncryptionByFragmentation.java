package org.example.methods;

import org.example.utils.ArrayListContainer;
import org.example.utils.CipherUtils;
import org.example.utils.MatrixUtils;

import java.util.ArrayList;

public class EncryptionByFragmentation implements Method {
    @Override
    public String ciphering(String symbols, String key, String text) throws Exception {
        // обработанный ключ и текст
        String processedKey = CipherUtils.cipherPreparation(key);
        String processedText = CipherUtils.cipherPreparation(text);

        // мой алфавит
        String myAlphabet = CipherUtils.myAlphabet(processedKey, symbols)
                .replace('J', ' ')
                .replace('Ё', ' ')
                .replace('Ъ', ' ')
                .replaceAll(" ", "");

        // полибианский квадрат
        char[][] polybianQuadrant = {};
        if (symbols.equals("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ")) {
            polybianQuadrant = MatrixUtils.textInMatrix(myAlphabet, 6);
            polybianQuadrant[5][2] = 1;
            polybianQuadrant[5][3] = 2;
            polybianQuadrant[5][4] = 3;
            polybianQuadrant[5][5] = 4;
        } else if (symbols.equals("ABCDEFGHIJKLMNOPQRSTUVWXYZ")) {
            polybianQuadrant = MatrixUtils.textInMatrix(myAlphabet, 5);
        }

        char[] chars = processedText.toCharArray();
        ArrayListContainer listContainer = MatrixUtils.findСoordinate(polybianQuadrant, chars);

        // массив координат строк
        ArrayList<Integer> line = listContainer.getList1();
        // массив координат столбцов
        ArrayList<Integer> colum = listContainer.getList2();
        // все вместе
        ArrayList<Integer> integers = new ArrayList<>();
        integers.addAll(line);
        integers.addAll(colum);

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < integers.size(); i += 2) {
            s.append(polybianQuadrant[integers.get(i)][integers.get(i + 1)]);
        }

        return s.toString().replaceAll(" ", "");
    }

    @Override
    public String deciphering(String symbols, String key, String text) throws Exception {
        // обработанный ключ и текст
        String processedKey = CipherUtils.cipherPreparation(key);
        String processedText = CipherUtils.cipherPreparation(text);

        // мой алфавит
        String myAlphabet = CipherUtils.myAlphabet(processedKey, symbols)
                .replace('J', ' ')
                .replace('Ё', ' ')
                .replaceAll(" ", "");

        // полибианский квадрат
        char[][] polybianQuadrant = {};
        if (symbols.equals("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ")) {
            polybianQuadrant = MatrixUtils.textInMatrix(myAlphabet, 6);
            polybianQuadrant[5][2] = 1;
            polybianQuadrant[5][3] = 2;
            polybianQuadrant[5][4] = 3;
            polybianQuadrant[5][5] = 4;
        } else if (symbols.equals("ABCDEFGHIJKLMNOPQRSTUVWXYZ")) {
            polybianQuadrant = MatrixUtils.textInMatrix(myAlphabet, 5);
        }
//        printCharArray(polybianQuadrant);

        char[] chars = processedText.toCharArray();
        // массив координат строк и столбцов
        ArrayList<Integer> coordinateInOneLine = MatrixUtils.coordinateInOneLine(polybianQuadrant, chars);
        // разбил на две части
        var firstPart = coordinateInOneLine.subList(0, coordinateInOneLine.size() / 2);
        var secondPart = coordinateInOneLine.subList(coordinateInOneLine.size() / 2, coordinateInOneLine.size());

//        System.out.println(firstPart);
//        System.out.println(secondPart);

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < firstPart.size(); i++) {
            s.append(polybianQuadrant[firstPart.get(i)][secondPart.get(i)]);
        }

        return s.toString();
    }
    public static void printCharArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
