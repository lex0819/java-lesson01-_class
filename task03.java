//Task_3
//В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от предыдущего значения. По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.
//Входные данные
//Программа получает на вход действительные числа x и y
//Выходные данные
//Программа должна вывести одно натуральное число.
//Sample Input:
//10
//20
//Sample Output:
//9

import java.util.Scanner;

public class task03{
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = iScanner.nextInt();
        System.out.print("Enter y: ");
        int y = iScanner.nextInt();

        System.out.print(over_speed(x, y));
        iScanner.close();
    }

    public static int over_speed(int x, int y){
        int days = 1;
        double temp = x;
        while(temp < y){
            temp = temp + 0.1 * temp;
            days++;
        }

        return days;
    }
}


