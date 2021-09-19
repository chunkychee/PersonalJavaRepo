package javaProjects.passingOfObj;

public class main {

    public static void howStinkIsTheStudentIs(stinkiness mystink) {
        mystink.setStinkinessLevel(mystink.getStinkinessLevel()+1);

    }

    public static void main(String[] args) {
        stinkiness stink1 = new stinkiness();
        stinkiness stink = new stinkiness();
        stinkiness stink2 = new stinkiness();

        stink.setStinkinessLevel(10);
        stink1.setStinkinessLevel(9);
        stink2.setStinkinessLevel(8);
        howStinkIsTheStudentIs(stink2);
        System.out.println(stink2.getStinkinessLevel());




    }
}