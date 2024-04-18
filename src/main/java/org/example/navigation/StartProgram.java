package org.example.navigation;

import org.example.methods.Method;

import java.util.Scanner;

public class StartProgram implements Runnable {
    private final Method method;

    public StartProgram(Method method) {
        this.method = method;
    }

    @Override
    public void run() {
        System.out.println("""      
                \n======================= ОПИСАНИЕ =======================\n
                Программа принимает на вход файл с данными для шиврования, \nа на выходе создает новый файл с зашифрованным текстом.
                """);
        System.out.println("""      
                ====================== ФУНКЦИОНАЛ ======================\n
                Что вы хотите сделать?\n
                1: зашифровать файл,
                2: расшифровать файл.
                """);
        System.out.print("Введите цифру: ");
        Scanner scanner = new Scanner(System.in);
        int getNum = Integer.parseInt(scanner.nextLine());
        try {
            if (getNum == 1) {
                Thread thread = new Thread(new CipherFile(method));
                thread.start();
            }
            if (getNum == 2) {
                Thread thread = new Thread(new DecipherFile(method));
                thread.start();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
