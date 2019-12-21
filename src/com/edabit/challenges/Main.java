package com.edabit.challenges;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text here:");
        System.out.println(Switcharoo(sc.nextLine()));
    }

    public static String Switcharoo(String str){
        char[] strArray = str.toCharArray();
        if (strArray.length<=2) return "Incompatible";
        else if (strArray[0] == strArray[strArray.length-1]) return "Two's a pair";
        else {
            StringBuilder switcharoo = new StringBuilder();
            switcharoo.append(strArray[strArray.length-1]);
            for (int i = 1 ; i<(strArray.length-1); i++){
                switcharoo.append(strArray[i]);
            }
            switcharoo.append(strArray[0]);
            return switcharoo.toString();
        }
    }
}
