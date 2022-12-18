package pastProj.javaProjects;

import java.util.ArrayList;
import java.util.Arrays;

class forLoopsarray {
static int a;
    static int i;
    static int j;
    static int temp;
    static int[] numbers;
    static Integer primeNum;

    public static void main(String[] args) {


        ArrayList<Integer> primeNum = new ArrayList<>();
        forLoopsarray object = new forLoopsarray();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        for (i = 0; i < numbers.length; i++) {
            for (j = 0; j < numbers.length -1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        Integer[] multiplicationTable = {1,2,3,4,5,6,7,8,9,10,11,12,13}; //11,29,43,89,101
        for(i = 0; i <= numbers.length - 1; i++) {
            for (a = 1; a <= multiplicationTable.length - 1; a++) {
                if (numbers[i] % multiplicationTable[a] == 0) {
                    break;
                }else {
                    primeNum.add(numbers[i]);
                }

            }
        }
        System.out.println(primeNum);


    }
}
