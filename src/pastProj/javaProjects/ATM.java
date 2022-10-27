package pastProj.javaProjects;

public class ATM{

    public static int variableA = 0;
    public int variableB;

    public ATM(){
        variableA += 1;
        variableB = 4;
    }

    public static void main(String[] args){

        ATM myObject = new ATM();
        System.out.println(ATM.variableA);
    }

}