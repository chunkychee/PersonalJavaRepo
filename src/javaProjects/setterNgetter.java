package javaProjects;

public class setterNgetter {

   private int numOfDaysTravelling;
   private int numOfTimeTravelling;

    public void setDaysTravelling(int numOfDaysTravelling){
        this.numOfDaysTravelling = numOfDaysTravelling;
    }

    public void setTimeTravelling(int numOfTimeTravelling){
        this.numOfTimeTravelling = numOfTimeTravelling;
    }

    public int getDaysTravelling(){
        return numOfDaysTravelling;
    }

    public int getTimeTravelling(){
        return numOfTimeTravelling;
    }

}
