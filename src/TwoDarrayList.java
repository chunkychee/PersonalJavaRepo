import java.util.ArrayList;

public class TwoDarrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> foodList= new ArrayList<>();

        ArrayList<String> friedFood = new ArrayList<>();
        friedFood.add("banana fritter");
        friedFood.add("chicken wing");
        friedFood.add("fries");

        ArrayList<String> StirFriedFood = new ArrayList<>();
        StirFriedFood.add("hokkien");
        StirFriedFood.add("fried noodle");
        StirFriedFood.add("pasta");

        ArrayList<String> SteamFood = new ArrayList<>();
        SteamFood.add("dumplings");
        SteamFood.add("pau");
        SteamFood.add("siew mai");

        foodList.add(friedFood);
        foodList.add(SteamFood);
        foodList.add(StirFriedFood);

        System.out.println(foodList.get(1).get(2));
     }
}
