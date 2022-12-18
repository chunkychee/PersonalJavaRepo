package pastProj.javaProjects;

public class recursion {
    int counter = 1;

    int BottleML;
    int waterlvl;
    recursion(int BottleML, int waterlvl){
        this.BottleML = BottleML;
        this.waterlvl = waterlvl;
    }

    public int addwater(){
        if (BottleML >= waterlvl){
            waterlvl = waterlvl + 100;
            System.out.println("added 100 ML" + counter);
            counter += 1;
            return addwater();

        }else{
            return BottleML;
        }
    }


    public static void main(String[] args) {
        recursion bottle = new recursion(1000,100);
        System.out.println(bottle.addwater());
    }

}
