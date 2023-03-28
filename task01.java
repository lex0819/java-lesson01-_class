//Task_1
//Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров, а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?
//Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
//Программа должна вывести одно натуральное число.
//Sample Input 1:
//10
//3
//2
//Sample Output 1:
//8
import java.util.Scanner;
public class task01{
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Enter h: ");
        int h = iScanner.nextInt();
        System.out.print("Enter a: ");
        int a = iScanner.nextInt();
        System.out.print("Enter b: ");
        int b = iScanner.nextInt();

        int days = (h - a - 1) / (a - b) + 2;
        System.out.printf("%d days", days);

        iScanner.close();
    }
}