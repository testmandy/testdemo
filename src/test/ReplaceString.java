package test;

import java.awt.event.ActionEvent;
import java.util.Scanner;

public class ReplaceString {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Please input the string: ");
//        String originStr = scan.nextLine();
//        System.out.print("Please input the word you want to replace: ");
//        String word1 = scan.nextLine();
//        System.out.print("Please input the replace word: ");
//        String word2 = scan.nextLine();
//        String result = originStr.replaceAll(word1,word2);
//        System.out.printf("The result is: %s",result);
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input the string: ");
        String originStr = scan.nextLine();
        System.out.print("Please input the start index you want to replace: ");
        int i = scan.nextInt();
        System.out.print("Please input the end index you want to replace: ");
        int j = scan.nextInt();
        System.out.print("Please input the replace word: ");
        String replaceWord = scan.nextLine();
        StringBuilder builder = new StringBuilder(originStr);
        String result= builder.replace(i,j,replaceWord).toString();
        System.out.printf("The result is: %s",result);
    }
}
