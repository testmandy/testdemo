package test;

import java.util.Scanner;
/***
 * 判断子字符串的出现次数
 * str.indexOf(substr,start)
 */
public class MaxSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入要测试的字符串：");
        String str = scan.nextLine();
        System.out.print("请输入要查找的字符串：");
        String substr = scan.nextLine();
        int count = 0;
        int start = 0;
        while (str.indexOf(substr,start)>=0 && start<str.length()){
            count++;
            start = str.indexOf(substr,start) + substr.length();
        }
        System.out.printf("字符串 %s 在 %s 中出现的次数为：%s",substr,str,count);
    }
}
