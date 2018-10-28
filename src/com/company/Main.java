package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte userChoice = 0;
        while (true){
            System.out.println("Ввыберите задание 1 или 2 для отображение резльтата.");
            System.out.println("1. Подсчитать количество сдвоенных символов во введенном тексте (например \"нн\", \"сс\", \"лл\").");
            System.out.println("2. Выполнить задание №1 с использованием класса StringBuffer.");
            System.out.println("___________________________________________________________________________");
            System.out.println();
            userChoice = in.nextByte();
            switch (userChoice){
                case 1:
                    dualSymbols();
                    break;
                case 2:
                    dualSymbolsSecondVariant();
                    break;
                default:
                    System.out.println("Введено неверное число!");
                    System.out.println("Попробуйте снова.");
                    break;
            }
        }
    }

    public static void dualSymbols(){
        Scanner in = new Scanner(System.in);
        short counter = 0;
        System.out.println("Введите текст.");
        String text = in.nextLine();
        text = text.toLowerCase();
        char [] textToChar = text.toCharArray();
        for (int i = 0; i < text.length()-1; i++) {
            if (textToChar[i] == textToChar[i+1] && (int)textToChar[i] >= 1040 && (int)textToChar[i] <= 1103){
                counter++;
            }
        }
        if(counter > 0)
            System.out.println("Количество последовательных пар кириллических символов в тексте - " + counter);
        else
            System.out.println("В тексте нет сдвоенных символов (например \"нн\", \"сс\", \"лл\").");
        System.out.println("___________________________________________________________________________");
        System.out.println();
    }

    public static void dualSymbolsSecondVariant(){
        Scanner in = new Scanner(System.in);
        short counter = 0;
        System.out.println("Введите текст.");
        String text = in.nextLine();
        text = text.toLowerCase();
        StringBuffer textBuff = new StringBuffer(text.length());
        textBuff = textBuff.append(text);
        char[] textToChar = new char[textBuff.length()];
        textBuff.getChars(0, textBuff.length(), textToChar, 0);
        for (int i = 0; i < text.length()-1; i++) {
            if (textToChar[i] == textToChar[i+1] && (int)textToChar[i] >= 1040 && (int)textToChar[i] <= 1103){
                counter++;
            }
        }
        if(counter > 0)
            System.out.println("Количество последовательных пар кириллических символов в тексте - " + counter);
        else
            System.out.println("В тексте нет сдвоенных символов (например \"нн\", \"сс\", \"лл\").");
        System.out.println("___________________________________________________________________________");
        System.out.println();
    }
}
