package pastProj.javaProjects;
import java.util.Arrays;
public class ArrayOfObjects {


        String foodItem;

    ArrayOfObjects(String foodItem){
        this.foodItem = foodItem;
    }

    public static void main(String[] args) {

        ArrayOfObjects Food1 = new ArrayOfObjects("burger");
        ArrayOfObjects Food2 = new ArrayOfObjects("fries");
        ArrayOfObjects Food3 = new ArrayOfObjects("coke");

        ArrayOfObjects[] TypesOfFood = {Food1, Food2, Food3};
        TypesOfFood[0] = Food1;
        TypesOfFood[1] = Food2;
        TypesOfFood[2] = Food3;

        int[] grades = {1,23,45,6,3,5,45,5,4};
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));

       // Double number1 = ;
        //double number2; = 0;
        //if(number1.equals(number2)){

        }
    }
