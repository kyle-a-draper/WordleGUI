package com.example.wordlegui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Validate {
        public static boolean validate(String guess) throws FileNotFoundException {

            ArrayList<String> wordsArray = new ArrayList<>();

            Scanner scan = new Scanner(new FileReader("GuessWords.txt"));
            while (scan.hasNext()) {
                wordsArray.add(scan.nextLine());
            }
            for(int temp = 0; temp < wordsArray.size(); temp++){
                if(guess.equals(wordsArray.get(temp))){
                    return true;
                }
            }
            return false;
        }

}
