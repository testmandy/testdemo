package test;

import java.util.Scanner;

/***
 * 根据月份判断季节
 * switch语句
 */

public class Season {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input the month number: ");
        int month;
        try{
            month = scan.nextInt();
            if (month<1 || month>12){
                System.out.println("Please input the right number!");
            }
            switch (month) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Spring");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Summer");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Autumn");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Winter");
                    break;
            }
        } catch (Exception e){
            System.out.println("Please input the right number!");
        }


    }

}
