package javaProjects;

public class factorialRecursion {
     int total;
     int temp;
    //5!= 5 * 4 * 3 * 2 * 1 = 120
    //7!= 7 * 6 * 5 * 4 * 3 * 2 * 1 = 5040

    public int recursive(int num) {
        if (num != 1) {
            temp = num * (num - 1);
            if(total != 0){
                total = temp * total;
            }else{
                total = temp;
            }
            recursive(num - 2);

        }
        return total;
    }


    public static void main(String[] args) {
        factorialRecursion sort = new factorialRecursion();
        System.out.println(sort.recursive(7));

    }


}
