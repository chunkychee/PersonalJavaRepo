package Inheritance;
public class chicks {

    String name;
    int age;
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
    public final void cowCalling(){
        System.out.println("mozz mozz");
    }

    public void changeCowwCalling(){
        cowCalling();
    }


}
