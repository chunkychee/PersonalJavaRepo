package pastProj.javaProjects;

public class TwoDArray {

    public static void main(String[] args) {
        int arrayNum;
        int indexInArray;
        int[][] carsNum = new int[3][3];

        carsNum[0][0] = 1;
        carsNum[0][1] = 10;
        carsNum[0][2] = 20;
        carsNum[1][0] = 6;
        carsNum[1][1] = 9;
        carsNum[1][2] = 2;
        carsNum[2][0] = 14;
        carsNum[2][1] = 51;
        carsNum[2][2] = 12;


        for (arrayNum = 0; arrayNum < carsNum.length; arrayNum++) {
            for(indexInArray = 0; indexInArray < carsNum.length; indexInArray++){
                System.out.print(carsNum[arrayNum][indexInArray] + "  ");
            }
            System.out.println();
        }



    }
}
