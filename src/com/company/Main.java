package com.company;

import javax.net.ssl.SSLEngineResult;
import java.util.Scanner;

public class Main {

    public static String Sentence;
    public static Integer repeat;


    public static String algorithm(String str, int repeat) {

        char [] strarray = str.toCharArray();

        for (int i = 0; i < strarray.length; i++) {
            int count = 1;

            for (int j = i+1; j < strarray.length; j++) {
                if (strarray[i] == strarray[j] && strarray[i] !=' ')
                    count++;
            }

            if (count >= repeat) {
                str = str.replace(String.valueOf(strarray[i]), " ");
            }
        }
        return str;
    }


    public static void main(String[] args) {

        Scanner intinput = new Scanner(System.in);
        System.out.println("please choose your number");
        int repeat = intinput.nextInt();

        Scanner input = new Scanner(System.in);
        System.out.println("Please give some sentences");
        Sentence = input.nextLine();

        System.out.println(algorithm(Sentence, repeat));


    }
}
