//Task_6
//Вводится массив (сначала количество элементов, потом сами элементы). Найдите сумму его элементов с чётными индексами и выведите её. А потом выведите числа, которые суммировались.
//Sample Input:
//4
//1
//2
//3
//4
//Sample Output:
//4
//1
//3

import java.util.Scanner;

public class task06{
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = iScanner.nextInt();

        int[] array_numb = new int[n];
        for (int i = 0; i < n; i++){
            System.out.printf("Enter number[%d]: ", i);
            array_numb[i] = iScanner.nextInt();
        }

        int summa = 0;
        //even loop
        for (int i = 0; i < n; i += 2) {
            summa += array_numb[i];
        }


        System.out.printf("Sum of even elements is: %d\n", summa);
        for (int i = 0; i < n; i += 2) {
            System.out.printf("%d\n", array_numb[i]);
        }
        iScanner.close();
    }
}
