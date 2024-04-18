package org.example.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// класс для взаимодействия с файловой системой, не имеет отношение к шифрованию
public class File {
    Scanner console = new Scanner(System.in);
    private final static Map<String, String> repo = new HashMap<>();

    public void readFile() {
        try {
            String filePath = console.nextLine();
            Scanner scanner = new Scanner(new java.io.File(filePath));
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String[] part = line.split("=");
                repo.put(part[0], part[1]);
            }
            scanner.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    public String getSymbols() {
        return repo.get("symbols");
    }

    public String getKey() {
        return repo.get("key");
    }

    public String getText() {
        return repo.get("text");
    }
}
