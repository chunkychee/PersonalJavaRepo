package GradesLoop;

import java.util.ArrayList;
public class iterator {


    public static void main(String[] args) {
        int total = 0;
        int totalMarks;

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(92);
        marks.add(32);
        marks.add(45);
        marks.add(68);

        for (totalMarks = 0; totalMarks < marks.size(); totalMarks++) {
             total = total + marks.get(totalMarks);
             System.out.println(total);               // every loop's total mark

        }
        System.out.println(total); // final total marks of all 4 index
    }
}
