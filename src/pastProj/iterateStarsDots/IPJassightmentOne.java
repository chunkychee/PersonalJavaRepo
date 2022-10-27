package pastProj.iterateStarsDots;

public class IPJassightmentOne {


    public static void main(String[] args) {
        int numberOfRowsNcolumns = Integer.parseInt(args[0]);
        int dots;
        int star;
        if(numberOfRowsNcolumns < 0){
            System.out.println("please enter a number more than 0");
        }else {
            for (int i = 0; i < numberOfRowsNcolumns; i++) {
                System.out.println();
                for (star = 0; star < numberOfRowsNcolumns; star++) {
                    if (star < i) {
                        System.out.print(".");
                    } else {
                        System.out.print("*");
                    }

                }
            }
        }


    }
 }

