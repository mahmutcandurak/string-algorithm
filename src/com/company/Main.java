package com.company;

import javax.net.ssl.SSLEngineResult;
import java.util.Scanner;

public class Main {

    public static String Sentence;


    public static String algorithm(String str, int repeat) {

        char [] strArray = str.toCharArray();

        for (int i = 0; i < strArray.length; i++) {
            int count = 1;

            for (int j = i+1; j < strArray.length; j++) {
                if (strArray[i] == strArray[j] && strArray[i] !=' ')
                    count++;
            }

            if (count >= repeat) {
                str = str.replace(String.valueOf(strArray[i]), " ");
            }
        }
        return str;
    }


    public static void main(String[] args) {

        Scanner intinput = new Scanner(System.in);
        System.out.println("please enter your number");
        int repeat = intinput.nextInt();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter sentences");
        Sentence = input.nextLine();

        System.out.println(algorithm(Sentence, repeat));
    }
}
