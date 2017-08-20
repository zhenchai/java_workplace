package com.mtdp.GenericMethold;

/**
 * Created by zhenchai on 2017/7/26.
 * 泛型Test
 */
public class GenericMethodTest {

    public static <E> void printArray (E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf(" %s ", element);
        }
        System.out.println();
    }

    public static void main (String args[]){
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.printf("整型数组元素为：");
        printArray(intArray);

        System.out.printf("\n 双静度数组元素为：");
        printArray(doubleArray);

        System.out.printf("\n 字符型数组元素为：");
        printArray(charArray);
    }
}
