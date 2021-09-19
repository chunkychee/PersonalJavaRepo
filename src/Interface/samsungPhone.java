package Interface;

public class samsungPhone implements phoneManufacturer, phoneCasingManu, phoneScreenProtector {



    @Override
    public void ring() {
        System.out.println("ringRing");
    }

    @Override
    public int call(int sum) {
        return sum;
    }

    @Override
    public void phoneCasing() {
        System.out.println("hard casing ");
    }

    @Override
    public void phonedockel() {
        System.out.println("keychain");
    }

    @Override
    public void matteBlack() {
        System.out.println("one glass");
    }

    @Override
    public void clearGlass() {
        System.out.println("can see the screen");
    }
}
