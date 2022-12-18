package Lesson2;

public class interfaceExample {

    public static void main(String[] args) {
        int myList[] = {3,23,2,3,1,12,-1,-2,-5,-10,-20};

        System.out.println(printSelected(myList, new SelectPositive()));

    }
    public static boolean printSelected(int[] list, MyPredicate select ){
        for (int i=0; i<list.length; i++){
            if(select.apply(list[i])){
                System.out.println(list[i] + " ");
            }
        }
        System.out.println();
        return false;
    }
}
