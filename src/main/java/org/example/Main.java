package org.example;

import org.example.methods.EncryptionByFragmentation;
import org.example.methods.EncryptionByPermutation;
import org.example.methods.MonoAlphabeticReplacement;
import org.example.navigation.StartProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("================== ДОБРО ПОЖАЛОВАТЬ ====================\n");
        System.out.println("В консольное приложение для шифровки и расшифровки текста!\n");
        System.out.println("Каким методом вы хотите воспользоваться?\n");
        System.out.println("1: методом моноалфавитной замены, \n2: методом перестановок, \n3: методом дробления.\n");
        System.out.print("Введите цифру метода: ");

        Scanner method = new Scanner(System.in);
        int numMethod = Integer.parseInt(method.nextLine());

        if (numMethod == 1) {
            StartProgram start = new StartProgram(new MonoAlphabeticReplacement());
            Thread thread = new Thread(start);
            thread.start();
        }
        if (numMethod == 2) {
            StartProgram start = new StartProgram(new EncryptionByPermutation());
            Thread thread = new Thread(start);
            thread.start();
        }
        if (numMethod == 3) {
            StartProgram start = new StartProgram(new EncryptionByFragmentation());
            Thread thread = new Thread(start);
            thread.start();
        }

    }
}