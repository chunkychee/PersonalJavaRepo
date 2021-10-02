package Inheritance;
public class chicks {

    String name;
    int age;
    int numOfFeather;

    chicks(){

    }


    chicks(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void chicksCalling(){
       System.out.println("chirp chirp");
   }
    public void chicksFood(){
        System.out.println("seeds,corns,and wheat");
    }
    public void chicksColour(){
        System.out.println("yellow");
    }


}
