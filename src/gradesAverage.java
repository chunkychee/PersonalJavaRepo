import java.util.Scanner;


public class gradesAverage {


    public static void main(String[] args) {
        int i;
        int num = 1;
        int inputGrades;
        int numStudent;
        float totalMarks = 0;
        float avgMarks;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter the number of students.");
            numStudent = input.nextInt();

        } while (numStudent <= 0);

        int[] grades = new int[numStudent];
        for (i = 0; i < grades.length; i++) {
            do {
                System.out.println("Enter the grade between 0 to 100 for student: " + num);
                inputGrades = input.nextInt();
            }
            while (inputGrades < 0 || inputGrades > 100);
            grades[i] = inputGrades;
            num++;
        }

        if (i == grades.length) {
            for (i = 0; i < grades.length; i++) {
                totalMarks = totalMarks + grades[i];
            }
            avgMarks = totalMarks / grades.length;
            System.out.println("The average is " + avgMarks);
        }
    }
}

