import java.util.ArrayList;

public class homeStuffArrayList {



    public static void main(String[] args) {
        ArrayList<String> home = new ArrayList<>();

        String stuff1 = "toothpaste";
        String stuff2 = "toilet paper";
        String stuff3 = "shampoo";
        String stuff4 = "toothbrush";

        home.add(stuff1);
        home.add(stuff2);
        home.add(stuff3);
        home.add(stuff4);
        home.add(0,"lamp");
        home.add(1,"soap");
        System.out.println(home);
        System.out.println(home.size());
        System.out.println(home.get(4));
        home.set(5,"shower");
        System.out.println(home);

        System.out.println(home.get(1));

    }
}
