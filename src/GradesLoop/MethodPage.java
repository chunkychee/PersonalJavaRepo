package GradesLoop;

public class MethodPage {
   private int age;
   private String name;
   private boolean grades;
   static int marks;
   static int a;
   static int b;

   static int school(){
       marks = a + b;
       return marks;
   }

    MethodPage(int age, String name, boolean grades){
        this.setAge(age);
        this.setGrades(grades);
        this.setName(name);
    }

    public void setAge(int age) {
        if(age == 5){
            System.out.println("too young");
        }
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(boolean grades) {
        this.grades = grades;
    }

    public int getAge() {
        return this.age;

    }
    public String getName() {
        return this.name;

    }

    public boolean getGrades() {
        return this.grades;

    }

    public static int watermarks(){
       return a + b;
    }




}