import java.util.ArrayList;
import java.util.Arrays;

class forLoopsarray {

    static int i;
    static int j;
    static int temp;
    static int[] numbers;
    static Integer primeNum;

    static int primeNumOrNot (){
        Integer[] multiplicationTable = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        for(i = 0; i < numbers.length - 1; i++) {
            for (int a = 1; a < multiplicationTable.length - 1; a++) {
                if (numbers[i] / multiplicationTable[i] != 1 || numbers[i] /multiplicationTable[i] != numbers[i]) {
                    primeNum.add(numbers[i]);
                }
            }
        }
        return primeNum;
    }

    public static void main(String[] args) {


        ArrayList<Integer> primeNum = new ArrayList<>();
        forLoopsarray object = new forLoopsarray();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89}; // fix on 29
        for (i = 0; i < numbers.length - 1; i++) {
            for (j = i; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));



    }
}

