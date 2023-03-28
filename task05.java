//Task_5
//Напишите программу, которая выводит в столбик целые числа от a до b (a >= b) с шагом c. Границы включаются.
//Входные данные
//Заданы три целых числа а, b, с, где a > b
//Sample Input:
//20
//1
//2
//Sample Output:
//20
//18
//16
//14
//12
//10
//8
//6
//4
//2

import java.util.Scanner;
public class task05 {
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Enter high border: ");
        int a = iScanner.nextInt();
        System.out.print("Enter low border: ");
        int b = iScanner.nextInt();
        System.out.print("Enter step: ");
        int c = iScanner.nextInt();

        for (int i = a; i >= b; i -= c ) {
            System.out.println(i);
        }

        iScanner.close();
    }
}