package test;

import java.util.Scanner;

/***
 * 将输入的字符串翻转
 * StringBuffer
 */
public class Reverse_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input: ");
        String str = scan.nextLine();
        StringBuffer buffer = new StringBuffer(str).reverse();
        String[] list = buffer.toString().split(" ");
        StringBuilder result = new StringBuilder();
        for (String s:list){
            StringBuffer b = new StringBuffer(s).reverse();
            System.out.println(b);
            result.append(b);
            result.append(" ");
        }
        System.out.println("The Reverse Result is: " + result.toString().trim());
    }

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Please input: ");
//        String str = scan.nextLine();
//        String[] list = str.split(" ");
//        String result = "";
//        for (int i=list.length-1;i>=0;i--){
//            String s = list[i];
//            result = result + s+" ";
//        }
//        System.out.println("The Reverse Result is: " + result.trim());
//    }

}
