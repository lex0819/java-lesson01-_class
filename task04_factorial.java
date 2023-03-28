//Task_4
//Вводится натуральное число n. Вычислите n! ("эн-факториал") – произведение всех натуральных чисел от 1 до n
//n! = 1∙2∙3∙…∙ n.
//Sample Input:
//5
//Sample Output:
//120

import java.util.Scanner;
public class task04_factorial {
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = iScanner.nextInt();

        System.out.printf("factorial of %d is %d ", n, Factorial(n));

        iScanner.close();
    }

    public static int Factorial(int n){
        int fact = 1;

        for (int i = 1; i <= n ; i++) {
            fact = fact * i;
        }

        return fact;
    }
}