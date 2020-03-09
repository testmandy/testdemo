package test;

import java.util.Arrays;
import java.util.Scanner;

/***
 * 判断字符串中出现最多的字符并输出该字符和输出出现次数
 * toCharArray，重排序
 */
public class MaxWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input: ");
        String str = scan.nextLine();
        char[] list = str.toCharArray();
        Arrays.sort(list);
        System.out.println(list);
        int maxcount = 0;
        int count = 1;
        char maxChar = 'a';
        for (int i=0;i<list.length-1;i++){
            if (list[i]==list[i+1]){
                count++;
            }
            if(list[i]!=list[i+1]){
                if (maxcount<count){
                    maxcount = count;
                    maxChar = list[i];
                }
                count = 1;
            }
        }
        System.out.printf("最多的字符是：%s，次数是：%s \n",maxChar,maxcount);
    }
}
