package polymorphism.animals;

public class cat extends animal {

    cat(String hairy) {
        super(hairy);
    }

    public void poop(){
        System.out.println("catPoop");
    }
    public void pounce(){
        System.out.println("pounce");
    }

    public void sayMeow(){

        System.out.println("MEOW");
    }


}
