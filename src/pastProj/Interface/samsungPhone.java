package pastProj.Interface;

public class samsungPhone implements phoneManufacturer, phoneCasingManu, phoneScreenProtector, phoneColoring {


    @Override
    public void ring() {
        System.out.println("ringRing");
    }

    @Override
    public int call(int sum) {
        return sum;
    }

    @Override
    public int phoneCasing() {
        int sum = 5;
        return sum;

    }

    @Override
    public boolean phonedockel() {
        return true;
    }

    @Override
    public void matteBlack(int age, String name) {
        System.out.println("one glass");
    }

    @Override
    public void clearGlass() {
        System.out.println("can see the screen");
    }

    @Override
    public String coloring() {
        String colour1 = "pink";
        return colour1;
    }
}
