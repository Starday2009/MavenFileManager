import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.lang.String;


public class Main {

    public static void main (String[] args) throws IOException {
        //String s;
        Integer inp;
        FileManager Manager=new FileManager();
        //Scanner sc = new Scanner(System.in);
        System.out.println("1. Create File");
        System.out.println("2. Delete File");
        System.out.println("3. Write xls File");
        System.out.println("4. Read xls File");
        System.out.println("0. Exit");
        System.out.print("Введите цифру с желаемым действием: ");

        do {
            Scanner sc = new Scanner(System.in);
            inp = sc.nextInt();
            switch (inp) {
                case 1:
                    Manager.createFile();
                    break;
                case 2:
                    Manager.deleteFile();
                    break;

                case 3:
                    Manager.WriteXls();
                    break;
                case 4:
                    Manager.readxls();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ошибка-неизвестная команда");
            }
        }
        while (inp != 0);
    }

}