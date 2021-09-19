package javaProjects.passingOfObj;


public class scaling {

    void scalingOfFishes(fishes fish){                              //yes bloop bloop bloop
        System.out.println("tima had scaled " + fish.numberOfFishes + " fishes today");
    }

    public static void main(String[] args) {
        scaling scale = new scaling();
        fishes fish = new fishes(13);

        scale.scalingOfFishes(fish);
    }
}


