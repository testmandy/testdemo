package test;

import java.io.*;

public class FileRWD {
    public static void main(String[] args){
        /*读取文件*/
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\test\\test.txt"));
            String str = reader.readLine();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*新建并操作文件*/
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\test\\111.txt"));
            writer.write("1111111111111");
            writer.close();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*删除文件*/
        File tempFile = new File("C:\\Users\\user\\Desktop\\test\\111.txt");
        if (tempFile.delete()){
            System.out.println("文件删除成功！");
        }else {
            System.out.println("Nothing");
        }


    }
}
