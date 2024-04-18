package org.example.navigation;

import org.example.methods.Method;
import org.example.utils.File;
import org.example.utils.Utils;

import java.io.FileWriter;
import java.util.Scanner;

public class CipherFile implements Runnable {
    private final Method method;
    private final File file = new File();
    Scanner console = new Scanner(System.in);

    public CipherFile(Method method) {
        this.method = method;
    }

    @Override
    public void run() {
        System.out.print("Пропишите полный путь к файлу с данными для шифрования: ");
        file.readFile();

        System.out.print("Укажите полный путь к дериктории в которой будет лежать файл: ");
        String dirPath = console.nextLine();

        System.out.print("Придумайте имя зашифрованного файла: ");
        String nameFile = console.nextLine();

        String text;
        try {
            text = method.ciphering(file.getSymbols(), file.getKey(), file.getText());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter writer = new FileWriter(dirPath + "/" + nameFile, false);
            writer.write("symbols=" + file.getSymbols() + "\nkey=" + file.getKey() + "\ntext=" + Utils.numCharString(text, 5));
            writer.write("\n");
            writer.close();
            System.out.println("\nЗашифрованный текст записан в файл " + nameFile + "!");
        } catch (Exception e) {
            System.out.println("Возникла ошибка во время записи, проверьте данные.");
        }
    }
}
