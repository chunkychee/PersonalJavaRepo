package Interface;


public interface phoneManufacturer {


    public void ring();
    public int call(int sum);

    public static void main(String[] args) {
        samsungPhone samsung = new samsungPhone();
        samsung.ring();
        samsung.call(4);
        samsung.matteBlack(3,"12");
    }

}
