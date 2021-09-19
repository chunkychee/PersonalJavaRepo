package javaProjects;

public class DNA {


    static int i;
    public static void main(String[] args) {

        String[] DNA = {"ATGCGATACGCTTGA","ATGCGATACGTGA","ATTAATATGTACTGA"};
        String lol = "ATGCGATACGCTTGA";
        System.out.println(lol.substring(0,3));


        for(i = 0; i <= DNA.length - 1; i++) {
         if (DNA[i].substring(0,3).equals("ATG") && DNA[i].substring(12).equals("TGA")){
             System.out.println("valid protien");
         }else if(DNA[i].length() % 3 == 0){
             System.out.println("valid protien");
         }else{
             System.out.println("no protien");
         }
     }


    }

}