package com.example.wordlegui;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ChooseWord {
    public static String selectWord() throws IOException {
        boolean alreadyUsedWord = false;
        String word = "";
        File file = new File("Words.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] bytesArray = new byte[(int) file.length()];
        fis.read(bytesArray);
        String s = new String(bytesArray);
        String[] data = s.split("\n");


        ArrayList<String> usedWordsArray = new ArrayList<>();

        Scanner scan = new Scanner(new FileReader("usedWords.txt"));
        while (scan.hasNext()) {
            usedWordsArray.add(scan.nextLine());
        }

        do {
            word = data[getRandom()];

            for (int i = 0; i < usedWordsArray.size(); i++) {
                if (word.equals(usedWordsArray.get(i))) {
                    alreadyUsedWord = true;
                    break;
                }
                if (i == usedWordsArray.size() - 1 && !(word.equals(usedWordsArray.get(i)))) {
                    alreadyUsedWord = false;
                }
            }

        } while (alreadyUsedWord);

        writeFile("usedWords.txt", word);


        return word;
    }


    public static int getRandom(){
        return (int) ((Math.random() * (2309)) + 0);
        }

    public static void writeFile(String file, String text) throws IOException {
        FileWriter myWriter = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(myWriter);
        bw.write(text);
        bw.newLine();
        bw.close();
    }


}
