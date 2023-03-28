//Task_7
//Дан список. Выведите те его элементы, которые встречаются в списке только один раз. Элементы нужно выводить в том порядке, в котором они встречаются в списке.
//Вводится список чисел. Все числа списка находятся на одной строке.
//Sample Input:
//6 1 2 2 3 3 3
//Sample Output:
//1

import java.util.*;
import java.util.stream.Collectors;

public class task07 {
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);

        //Enter array to string by space
        System.out.print("Enter list of numbers divided by space: ");
        String numb_str  = iScanner.nextLine();
        String[] numb_arr_str = numb_str.trim().split("\\s+");
        int list_len = numb_arr_str.length;

        //array of integer
        int[] numb_arr_int = new int [list_len];

        //convert array of string to array of integer
        for (int i = 0; i < list_len; i++) {
            numb_arr_int[i] = Integer.parseInt(numb_arr_str[i]);
        }

        //counting how many parts each item repeat in the array of integer
        Map<Integer, Integer> arr_count = new TreeMap<>();
        for (int item : numb_arr_int) {
            int count = arr_count.getOrDefault(item, 0) + 1;
            arr_count.put(item, count);
        }

        System.out.println(arr_count);

        //filtering map, only value == 1
        arr_count = arr_count.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(arr_count);

        iScanner.close();
    }
}