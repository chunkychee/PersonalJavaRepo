import java.util.ArrayList;

class Proj {

    public static ArrayList<String> removePopo(ArrayList<String> desertIslandPlaylist) {
        for(int i = 0; i < desertIslandPlaylist.size(); i++){
            if(desertIslandPlaylist.get(i) == "popo"){
               desertIslandPlaylist.remove(desertIslandPlaylist.get(i));
               i--;
            }
        }
        return desertIslandPlaylist;
    }

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<>();
        desertIslandPlaylist.add("popo");
        desertIslandPlaylist.add("popo");
        desertIslandPlaylist.add("popo");
        desertIslandPlaylist.add("opo");
        desertIslandPlaylist.add("pppp");
        desertIslandPlaylist = removePopo(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist);


    }
}