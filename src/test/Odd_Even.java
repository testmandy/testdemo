package test;

import java.util.Scanner;
/***
 * 判断奇偶数
 */
public class Odd_Even {
    public static void main(String[] args){
        System.out.println("This is a DEMO test.");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input your number: ");
        try{
            long number = scan.nextLong();
            String result =  (number % 2 ==0)?"This is a EVEN number.":"This is an ODD number.";
            System.out.println(result);
        } catch (Exception e){
            System.out.println("Please input the right number!");
        }  finally {
            System.out.println("OVER!");
        }
    }
}