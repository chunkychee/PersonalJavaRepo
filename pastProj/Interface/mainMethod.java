package pastProj.Interface;



public class mainMethod {
    public static void main(String[] args) {
        samsungPhone samsung = new samsungPhone();
        samsung.ring();
        System.out.println(samsung.call(4));
        samsung.matteBlack(4 , "iphone");
        System.out.println(samsung.coloring());
    }

}
