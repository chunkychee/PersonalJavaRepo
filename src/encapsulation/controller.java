package encapsulation;

public class controller {
    private int left;
    private int right;
    private int up;
    private int down;




    public void setControlLeft(int inputLeft){
        left = inputLeft;
    }
    public void setControlRight(int inputRight){
        right = inputRight;
    }
    public void setControlUp(int inputUp){
        up = inputUp;
    }
    public void setControlDown(int inputDown){
        down = inputDown;
    }


    public void getControlLeft(){
        System.out.println("turn "+ left +" degree to the left");
    }

    public void getControlRight(){
        System.out.println("turn "+ right +" degree to the right");

    }

    public void getControlUp(){
        System.out.println("turn "+ up +" degree upwards");

    }

    public void getControlDown(){
        System.out.println("turn "+ down +" degree downwards");

    }


}
