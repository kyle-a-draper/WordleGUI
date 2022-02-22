package com.example.wordlegui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class HelloApplication extends Application  {
    public static int count = -1;
    public static String Wordle;

    static {
        try {
            Wordle = ChooseWord.selectWord();
            System.out.println("Wordle word is: " + Wordle);
        } catch (IOException e) {
            System.out.println("Couldn't Generate Wordle");
        }
    }

    public void start(Stage stage){
        Group root = new Group();
        Scene scene = new Scene(root, 350, 600);
        String[] array = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",};


        stage.setTitle("Wordle!");



        Rectangle r1 = new Rectangle(60, 60);
        r1.setArcHeight(20);
        r1.setArcWidth(20);
        r1.setStroke(Color.BLACK);
        r1.setStrokeWidth(6);
        r1.setFill(Color.GRAY);
        r1.setX(5);
        r1.setY(200);


        Text t1 = new Text();
        t1.setText(array[0]);
        t1.setX(22.5);
        t1.setY(247.5);
        t1.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t1.setFill(Color.WHITE);
        t1.setStroke(Color.BLACK);
        t1.setStrokeWidth(2.5);
        t1.setTextAlignment(TextAlignment.CENTER);

        Rectangle r2 = new Rectangle(60, 60);
        r2.setArcHeight(20);
        r2.setArcWidth(20);
        r2.setStroke(Color.BLACK);
        r2.setStrokeWidth(6);
        r2.setFill(Color.GRAY);
        r2.setX(75);
        r2.setY(200);

        Text t2 = new Text();
        t2.setText(array[1]);
        t2.setX(91);
        t2.setY(247.5);
        t2.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t2.setFill(Color.WHITE);
        t2.setStroke(Color.BLACK);
        t2.setTextAlignment(TextAlignment.CENTER);
        t2.setStrokeWidth(2.5);

        Rectangle r3 = new Rectangle(60, 60);
        r3.setArcHeight(20);
        r3.setArcWidth(20);
        r3.setStroke(Color.BLACK);
        r3.setStrokeWidth(6);
        r3.setFill(Color.GRAY);
        r3.setX(145);
        r3.setY(200);

        Text t3 = new Text();
        t3.setText(array[2]);
        t3.setX(160);
        t3.setY(247.5);
        t3.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t3.setFill(Color.WHITE);
        t3.setStroke(Color.BLACK);
        t3.setStrokeWidth(2.5);
        t3.setTextAlignment(TextAlignment.CENTER);

        Rectangle r4 = new Rectangle(60, 60);
        r4.setArcHeight(20);
        r4.setArcWidth(20);
        r4.setStroke(Color.BLACK);
        r4.setStrokeWidth(6);
        r4.setFill(Color.GRAY);
        r4.setX(215);
        r4.setY(200);

        Text t4 = new Text();
        t4.setText(array[3]);
        t4.setX(231);
        t4.setY(247.5);
        t4.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t4.setFill(Color.WHITE);
        t4.setStroke(Color.BLACK);
        t4.setStrokeWidth(2.5);
        t4.setTextAlignment(TextAlignment.CENTER);

        Rectangle r5 = new Rectangle(60, 60);
        r5.setArcHeight(20);
        r5.setArcWidth(20);
        r5.setStroke(Color.BLACK);
        r5.setStrokeWidth(6);
        r5.setFill(Color.GRAY);
        r5.setX(285);
        r5.setY(200);

        Text t5 = new Text();
        t5.setText(array[4]);
        t5.setX(304);
        t5.setY(247.5);
        t5.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t5.setFill(Color.WHITE);
        t5.setStroke(Color.BLACK);
        t5.setStrokeWidth(2.5);
        t5.setTextAlignment(TextAlignment.CENTER);

        root.getChildren().addAll(r1,r2,r3,r4,r5);

        Rectangle r6 = new Rectangle(60, 60);
        r6.setArcHeight(20);
        r6.setArcWidth(20);
        r6.setStroke(Color.BLACK);
        r6.setStrokeWidth(6);
        r6.setFill(Color.GRAY);
        r6.setX(5);
        r6.setY(270);

        Text t6 = new Text();
        t6.setText(array[5]);
        t6.setX(22.5);
        t6.setY(318.5);
        t6.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t6.setFill(Color.WHITE);
        t6.setStroke(Color.BLACK);
        t6.setStrokeWidth(2.5);
        t6.setTextAlignment(TextAlignment.CENTER);

        Rectangle r7 = new Rectangle(60, 60);
        r7.setArcHeight(20);
        r7.setArcWidth(20);
        r7.setStroke(Color.BLACK);
        r7.setStrokeWidth(6);
        r7.setFill(Color.GRAY);
        r7.setX(75);
        r7.setY(270);

        Text t7 = new Text();
        t7.setText(array[6]);
        t7.setX(91);
        t7.setY(318.5);
        t7.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t7.setFill(Color.WHITE);
        t7.setStroke(Color.BLACK);
        t7.setStrokeWidth(2.5);
        t7.setTextAlignment(TextAlignment.CENTER);

        Rectangle r8 = new Rectangle(60, 60);
        r8.setArcHeight(20);
        r8.setArcWidth(20);
        r8.setStroke(Color.BLACK);
        r8.setStrokeWidth(6);
        r8.setFill(Color.GRAY);
        r8.setX(145);
        r8.setY(270);

        Text t8 = new Text();
        t8.setText(array[7]);
        t8.setX(160);
        t8.setY(318.5);
        t8.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t8.setFill(Color.WHITE);
        t8.setStroke(Color.BLACK);
        t8.setStrokeWidth(2.5);
        t8.setTextAlignment(TextAlignment.CENTER);

        Rectangle r9 = new Rectangle(60, 60);
        r9.setArcHeight(20);
        r9.setArcWidth(20);
        r9.setStroke(Color.BLACK);
        r9.setStrokeWidth(6);
        r9.setFill(Color.GRAY);
        r9.setX(215);
        r9.setY(270);

        Text t9 = new Text();
        t9.setText(array[8]);
        t9.setX(231);
        t9.setY(318.5);
        t9.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t9.setFill(Color.WHITE);
        t9.setStroke(Color.BLACK);
        t9.setStrokeWidth(2.5);
        t9.setTextAlignment(TextAlignment.CENTER);

        Rectangle r10 = new Rectangle(60, 60);
        r10.setArcHeight(20);
        r10.setArcWidth(20);
        r10.setStroke(Color.BLACK);
        r10.setStrokeWidth(6);
        r10.setFill(Color.GRAY);
        r10.setX(285);
        r10.setY(270);

        Text t10 = new Text();
        t10.setText(array[9]);
        t10.setX(304);
        t10.setY(318.5);
        t10.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t10.setFill(Color.WHITE);
        t10.setStroke(Color.BLACK);
        t10.setStrokeWidth(2.5);
        t10.setTextAlignment(TextAlignment.CENTER);

        root.getChildren().addAll(r6,r7,r8,r9,r10);

        Rectangle r11 = new Rectangle(60, 60);
        r11.setArcHeight(20);
        r11.setArcWidth(20);
        r11.setStroke(Color.BLACK);
        r11.setStrokeWidth(6);
        r11.setFill(Color.GRAY);
        r11.setX(5);
        r11.setY(340);

        Text t11 = new Text();
        t11.setText(array[10]);
        t11.setX(22.5);
        t11.setY(389.5);
        t11.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t11.setFill(Color.WHITE);
        t11.setStroke(Color.BLACK);
        t11.setStrokeWidth(2.5);
        t11.setTextAlignment(TextAlignment.CENTER);

        Rectangle r12 = new Rectangle(60, 60);
        r12.setArcHeight(20);
        r12.setArcWidth(20);
        r12.setStroke(Color.BLACK);
        r12.setStrokeWidth(6);
        r12.setFill(Color.GRAY);
        r12.setX(75);
        r12.setY(340);

        Text t12 = new Text();
        t12.setText(array[11]);
        t12.setX(91);
        t12.setY(389.5);
        t12.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t12.setFill(Color.WHITE);
        t12.setStroke(Color.BLACK);
        t12.setStrokeWidth(2.5);
        t12.setTextAlignment(TextAlignment.CENTER);

        Rectangle r13 = new Rectangle(60, 60);
        r13.setArcHeight(20);
        r13.setArcWidth(20);
        r13.setStroke(Color.BLACK);
        r13.setStrokeWidth(6);
        r13.setFill(Color.GRAY);
        r13.setX(145);
        r13.setY(340);

        Text t13 = new Text();
        t13.setText(array[12]);
        t13.setX(160);
        t13.setY(389.5);
        t13.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t13.setFill(Color.WHITE);
        t13.setStroke(Color.BLACK);
        t13.setStrokeWidth(2.5);
        t13.setTextAlignment(TextAlignment.CENTER);

        Rectangle r14 = new Rectangle(60, 60);
        r14.setArcHeight(20);
        r14.setArcWidth(20);
        r14.setStroke(Color.BLACK);
        r14.setStrokeWidth(6);
        r14.setFill(Color.GRAY);
        r14.setX(215);
        r14.setY(340);

        Text t14 = new Text();
        t14.setText(array[13]);
        t14.setX(231);
        t14.setY(389.5);
        t14.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t14.setFill(Color.WHITE);
        t14.setStroke(Color.BLACK);
        t14.setStrokeWidth(2.5);
        t14.setTextAlignment(TextAlignment.CENTER);

        Rectangle r15 = new Rectangle(60, 60);
        r15.setArcHeight(20);
        r15.setArcWidth(20);
        r15.setStroke(Color.BLACK);
        r15.setStrokeWidth(6);
        r15.setFill(Color.GRAY);
        r15.setX(285);
        r15.setY(340);

        Text t15 = new Text();
        t15.setText(array[14]);
        t15.setX(304);
        t15.setY(389.5);
        t15.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t15.setFill(Color.WHITE);
        t15.setStroke(Color.BLACK);
        t15.setStrokeWidth(2.5);
        t15.setTextAlignment(TextAlignment.CENTER);

        root.getChildren().addAll(r11, r12, r13, r14, r15);


        Rectangle r16 = new Rectangle(60, 60);
        r16.setArcHeight(20);
        r16.setArcWidth(20);
        r16.setStroke(Color.BLACK);
        r16.setStrokeWidth(6);
        r16.setFill(Color.GRAY);
        r16.setX(5);
        r16.setY(410);

        Text t16 = new Text();
        t16.setText(array[15]);
        t16.setX(22.5);
        t16.setY(460.5);
        t16.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t16.setFill(Color.WHITE);
        t16.setStroke(Color.BLACK);
        t16.setStrokeWidth(2.5);
        t16.setTextAlignment(TextAlignment.CENTER);

        Rectangle r17 = new Rectangle(60, 60);
        r17.setArcHeight(20);
        r17.setArcWidth(20);
        r17.setStroke(Color.BLACK);
        r17.setStrokeWidth(6);
        r17.setFill(Color.GRAY);
        r17.setX(75);
        r17.setY(410);

        Text t17 = new Text();
        t17.setText(array[16]);
        t17.setX(91);
        t17.setY(460.5);
        t17.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t17.setFill(Color.WHITE);
        t17.setStroke(Color.BLACK);
        t17.setStrokeWidth(2.5);
        t17.setTextAlignment(TextAlignment.CENTER);

        Rectangle r18 = new Rectangle(60, 60);
        r18.setArcHeight(20);
        r18.setArcWidth(20);
        r18.setStroke(Color.BLACK);
        r18.setStrokeWidth(6);
        r18.setFill(Color.GRAY);
        r18.setX(145);
        r18.setY(410);

        Text t18 = new Text();
        t18.setText(array[17]);
        t18.setX(160);
        t18.setY(460.5);
        t18.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t18.setFill(Color.WHITE);
        t18.setStroke(Color.BLACK);
        t18.setStrokeWidth(2.5);
        t18.setTextAlignment(TextAlignment.CENTER);

        Rectangle r19 = new Rectangle(60, 60);
        r19.setArcHeight(20);
        r19.setArcWidth(20);
        r19.setStroke(Color.BLACK);
        r19.setStrokeWidth(6);
        r19.setFill(Color.GRAY);
        r19.setX(215);
        r19.setY(410);

        Text t19 = new Text();
        t19.setText(array[18]);
        t19.setX(231);
        t19.setY(460.5);
        t19.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t19.setFill(Color.WHITE);
        t19.setStroke(Color.BLACK);
        t19.setStrokeWidth(2.5);
        t19.setTextAlignment(TextAlignment.CENTER);

        Rectangle r20 = new Rectangle(60, 60);
        r20.setArcHeight(20);
        r20.setArcWidth(20);
        r20.setStroke(Color.BLACK);
        r20.setStrokeWidth(6);
        r20.setFill(Color.GRAY);
        r20.setX(285);
        r20.setY(410);

        Text t20 = new Text();
        t20.setText(array[19]);
        t20.setX(304);
        t20.setY(460.5);
        t20.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t20.setFill(Color.WHITE);
        t20.setStroke(Color.BLACK);
        t20.setStrokeWidth(2.5);
        t20.setTextAlignment(TextAlignment.CENTER);

        root.getChildren().addAll(r16,r17,r18,r19,r20);

        Rectangle r21 = new Rectangle(60, 60);
        r21.setArcHeight(20);
        r21.setArcWidth(20);
        r21.setStroke(Color.BLACK);
        r21.setStrokeWidth(6);
        r21.setFill(Color.GRAY);
        r21.setX(5);
        r21.setY(480);

        Text t21 = new Text();
        t21.setText(array[20]);
        t21.setX(22.5);
        t21.setY(531.5);
        t21.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t21.setFill(Color.WHITE);
        t21.setStroke(Color.BLACK);
        t21.setStrokeWidth(2.5);
        t21.setTextAlignment(TextAlignment.CENTER);

        Rectangle r22 = new Rectangle(60, 60);
        r22.setArcHeight(20);
        r22.setArcWidth(20);
        r22.setStroke(Color.BLACK);
        r22.setStrokeWidth(6);
        r22.setFill(Color.GRAY);
        r22.setX(75);
        r22.setY(480);

        Text t22 = new Text();
        t22.setText(array[21]);
        t22.setX(91);
        t22.setY(531.5);
        t22.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t22.setFill(Color.WHITE);
        t22.setStroke(Color.BLACK);
        t22.setStrokeWidth(2.5);
        t22.setTextAlignment(TextAlignment.CENTER);

        Rectangle r23 = new Rectangle(60, 60);
        r23.setArcHeight(20);
        r23.setArcWidth(20);
        r23.setStroke(Color.BLACK);
        r23.setStrokeWidth(6);
        r23.setFill(Color.GRAY);
        r23.setX(145);
        r23.setY(480);

        Text t23 = new Text();
        t23.setText(array[22]);
        t23.setX(160);
        t23.setY(531.5);
        t23.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t23.setFill(Color.WHITE);
        t23.setStroke(Color.BLACK);
        t23.setStrokeWidth(2.5);
        t23.setTextAlignment(TextAlignment.CENTER);

        Rectangle r24 = new Rectangle(60, 60);
        r24.setArcHeight(20);
        r24.setArcWidth(20);
        r24.setStroke(Color.BLACK);
        r24.setStrokeWidth(6);
        r24.setFill(Color.GRAY);
        r24.setX(215);
        r24.setY(480);

        Text t24 = new Text();
        t24.setText(array[23]);
        t24.setX(229);
        t24.setY(531.5);
        t24.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t24.setFill(Color.WHITE);
        t24.setStroke(Color.BLACK);
        t24.setStrokeWidth(2.5);
        t24.setTextAlignment(TextAlignment.CENTER);

        Rectangle r25 = new Rectangle(60, 60);
        r25.setArcHeight(20);
        r25.setArcWidth(20);
        r25.setStroke(Color.BLACK);
        r25.setStrokeWidth(6);
        r25.setFill(Color.GRAY);
        r25.setX(285);
        r25.setY(480);

        Text t25 = new Text();
        t25.setText(array[24]);
        t25.setX(304);
        t25.setY(531.5);
        t25.setFont(Font.font("Impact", FontWeight.BOLD, 50));
        t25.setFill(Color.WHITE);
        t25.setStroke(Color.BLACK);
        t25.setStrokeWidth(2.5);
        t25.setTextAlignment(TextAlignment.CENTER);

        root.getChildren().add(r21);
        root.getChildren().add(r22);
        root.getChildren().add(r23);
        root.getChildren().add(r24);
        root.getChildren().add(r25);

        TextField textField = new TextField();
        textField.setMaxHeight(100);
        textField.setPrefHeight(100);
        textField.setMinHeight(100);
        textField.setMaxWidth(275);
        textField.setPrefWidth(275);
        textField.setMinWidth(275);
        textField.setAlignment(Pos.CENTER);
        textField.setFont(Font.font("Impact", FontWeight.BOLD, 50));

        ArrayList<String> Guesses = new ArrayList<>();


        textField.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ESCAPE) {
                textField.clear();
            }

            if (event.getCode() == KeyCode.ENTER) {
                boolean valid = false;
                String temp = textField.getText().toLowerCase(Locale.ROOT);
                textField.clear();
                if(temp.length() == 0){
                    temp = temp + "aaaaa";
                }
                if(temp.length() == 1){
                    temp = temp + "    ";
                }
                if(temp.length() == 2){
                    temp = temp + "   ";
                }
                if(temp.length() == 3){
                    temp = temp + "  ";
                }
                if(temp.length() == 4){
                    temp = temp + " ";
                }
                array[0] = String.valueOf(temp.charAt(0));
                array[1] = String.valueOf(temp.charAt(1));
                array[2] = String.valueOf(temp.charAt(2));
                array[3] = String.valueOf(temp.charAt(3));
                array[4] = String.valueOf(temp.charAt(4));
                System.out.println(temp);
                incrementCount();
                try {
                    if(Validate.validate(temp) && !(Guesses.contains(temp))){
                        valid = true;
                        Guesses.add(temp);
                        System.out.println("Valid Word");
                    } else {
                        System.out.println("Invalid Word");
                        valid = false;
                        decrementCount();
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("File not found");
                }
                if(temp.trim().equals(Wordle.trim())){
                    System.out.println("Got here " + temp);
                    textField.setText("WIN!!");
                }
                if(count == 0 && valid) {
                    update(t1, t2, t3, t4, t5, array);
                    if(array[0].equals(String.valueOf(Wordle.charAt(0)))){
                        r1.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[0]) && !(array[0].equals(String.valueOf(Wordle.charAt(0))))){
                        r1.setFill(Color.ORANGE);
                    }
                    if(array[1].equals(String.valueOf(Wordle.charAt(1)))){
                        r2.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[1]) && !(array[1].equals(String.valueOf(Wordle.charAt(1))))){
                        r2.setFill(Color.ORANGE);
                    }
                    if(array[2].equals(String.valueOf(Wordle.charAt(2)))){
                        r3.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[2]) && !(array[2].equals(String.valueOf(Wordle.charAt(2))))){
                        r3.setFill(Color.ORANGE);
                    }
                    if(array[3].equals(String.valueOf(Wordle.charAt(3)))){
                        r4.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[3]) && !(array[3].equals(String.valueOf(Wordle.charAt(3))))){
                        r4.setFill(Color.ORANGE);
                    }
                    if(array[4].equals(String.valueOf(Wordle.charAt(4)))){
                        r5.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[4]) && !(array[4].equals(String.valueOf(Wordle.charAt(4))))){
                        r5.setFill(Color.ORANGE);
                    }
                }
                if(count == 1 && valid) {
                    update(t6, t7, t8, t9, t10, array);
                    if(array[0].equals(String.valueOf(Wordle.charAt(0)))){
                        r6.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[0]) && !(array[0].equals(String.valueOf(Wordle.charAt(0))))){
                        r6.setFill(Color.ORANGE);
                    }
                    if(array[1].equals(String.valueOf(Wordle.charAt(1)))){
                        r7.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[1]) && !(array[1].equals(String.valueOf(Wordle.charAt(1))))){
                        r7.setFill(Color.ORANGE);
                    }
                    if(array[2].equals(String.valueOf(Wordle.charAt(2)))){
                        r8.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[2]) && !(array[2].equals(String.valueOf(Wordle.charAt(2))))){
                        r8.setFill(Color.ORANGE);
                    }
                    if(array[3].equals(String.valueOf(Wordle.charAt(3)))){
                        r9.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[3]) && !(array[3].equals(String.valueOf(Wordle.charAt(3))))){
                        r9.setFill(Color.ORANGE);
                    }
                    if(array[4].equals(String.valueOf(Wordle.charAt(4)))){
                        r10.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[4]) && !(array[4].equals(String.valueOf(Wordle.charAt(4))))){
                        r10.setFill(Color.ORANGE);
                    }
                }
                if(count == 2 && valid) {
                    update(t11, t12, t13, t14, t15, array);
                    if(array[0].equals(String.valueOf(Wordle.charAt(0)))){
                        r11.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[0]) && !(array[0].equals(String.valueOf(Wordle.charAt(0))))){
                        r11.setFill(Color.ORANGE);
                    }
                    if(array[1].equals(String.valueOf(Wordle.charAt(1)))){
                        r12.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[1]) && !(array[1].equals(String.valueOf(Wordle.charAt(1))))){
                        r12.setFill(Color.ORANGE);
                    }
                    if(array[2].equals(String.valueOf(Wordle.charAt(2)))){
                        r13.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[2]) && !(array[2].equals(String.valueOf(Wordle.charAt(2))))){
                        r13.setFill(Color.ORANGE);
                    }
                    if(array[3].equals(String.valueOf(Wordle.charAt(3)))){
                        r14.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[3]) && !(array[3].equals(String.valueOf(Wordle.charAt(3))))){
                        r14.setFill(Color.ORANGE);
                    }
                    if(array[4].equals(String.valueOf(Wordle.charAt(4)))){
                        r15.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[4]) && !(array[4].equals(String.valueOf(Wordle.charAt(4))))){
                        r15.setFill(Color.ORANGE);
                    }
                }
                if(count == 3 && valid) {
                    update(t16, t17, t18, t19, t20, array);
                    if(array[0].equals(String.valueOf(Wordle.charAt(0)))){
                        r16.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[0]) && !(array[0].equals(String.valueOf(Wordle.charAt(0))))){
                        r16.setFill(Color.ORANGE);
                    }
                    if(array[1].equals(String.valueOf(Wordle.charAt(1)))){
                        r17.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[1]) && !(array[1].equals(String.valueOf(Wordle.charAt(1))))){
                        r17.setFill(Color.ORANGE);
                    }
                    if(array[2].equals(String.valueOf(Wordle.charAt(2)))){
                        r18.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[2]) && !(array[2].equals(String.valueOf(Wordle.charAt(2))))){
                        r18.setFill(Color.ORANGE);
                    }
                    if(array[3].equals(String.valueOf(Wordle.charAt(3)))){
                        r19.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[3]) && !(array[3].equals(String.valueOf(Wordle.charAt(3))))){
                        r19.setFill(Color.ORANGE);
                    }
                    if(array[4].equals(String.valueOf(Wordle.charAt(4)))){
                        r20.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[4]) && !(array[4].equals(String.valueOf(Wordle.charAt(4))))){
                        r20.setFill(Color.ORANGE);
                    }
                }
                if(count == 4 && valid) {
                    update(t21, t22, t23, t24, t25, array);
                    if(array[0].equals(String.valueOf(Wordle.charAt(0)))){
                        r21.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[0]) && !(array[0].equals(String.valueOf(Wordle.charAt(0))))){
                        r21.setFill(Color.ORANGE);
                    }
                    if(array[1].equals(String.valueOf(Wordle.charAt(1)))){
                        r22.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[1]) && !(array[1].equals(String.valueOf(Wordle.charAt(1))))){
                        r22.setFill(Color.ORANGE);
                    }
                    if(array[2].equals(String.valueOf(Wordle.charAt(2)))){
                        r23.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[2]) && !(array[2].equals(String.valueOf(Wordle.charAt(2))))){
                        r23.setFill(Color.ORANGE);
                    }
                    if(array[3].equals(String.valueOf(Wordle.charAt(3)))){
                        r24.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[3]) && !(array[3].equals(String.valueOf(Wordle.charAt(3))))){
                        r24.setFill(Color.ORANGE);
                    }
                    if(array[4].equals(String.valueOf(Wordle.charAt(4)))){
                        r25.setFill(Color.GREEN);
                    } else if(Wordle.contains(array[4]) && !(array[4].equals(String.valueOf(Wordle.charAt(4))))){
                        r25.setFill(Color.ORANGE);
                    }

                }
                if(count == 4 && !temp.equals(Wordle) && valid){
                    textField.setText(Wordle);
                }

            }
        });




        int max = 5;
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.length() > max) {
                String copy;
                copy = textField.getText().substring(0, max);
                textField.setText(copy);
            }
        });

        HBox box = new HBox(5);
        box.setPadding(new Insets(30, 5, 5, 37.5));
        box.getChildren().add(textField);


        root.getChildren().add(box);
        //root.getChildren().add(button);


        root.getChildren().addAll(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    public static void update(Text t1, Text t2, Text t3,Text t4,Text t5, String array[]){
        t1.setText(String.valueOf(array[0]));
        t2.setText(String.valueOf(array[1]));
        t3.setText(String.valueOf(array[2]));
        t4.setText(String.valueOf(array[3]));
        t5.setText(String.valueOf(array[4]));
    }
    public static void incrementCount(){
        count++;
    }
    public static void decrementCount(){
        count--;
    }
}