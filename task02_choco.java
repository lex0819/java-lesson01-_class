//Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, если разрешается сделать один разлом по прямой между дольками (то есть разломить шоколадку на два прямоугольника).
//*Пример:*
// 3 2 4 -> yes
// 3 2 1 -> no

import java.util.Scanner;

public class task02_choco{
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Enter n-size of chocolate: ");
        int n = iScanner.nextInt();
        System.out.print("Enter m-size of chocolate: ");
        int m = iScanner.nextInt();
        System.out.print("How many pieces do you need?  ");
        int k = iScanner.nextInt();

        String flag = "No";
        if(((k % n == 0) | (k % m == 0)) & ((n * m) > k)){
            flag = "Yes";
        }

        System.out.print(flag);
        iScanner.close();
    }
}