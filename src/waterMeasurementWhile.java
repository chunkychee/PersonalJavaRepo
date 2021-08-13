public class waterMeasurementWhile {
    int bottleML = 6000;

    public static void main(String[] args) {
        waterMeasurementWhile bottle = new waterMeasurementWhile();
        while (bottle.bottleML <= 5000) {
            System.out.println("put more water in");
            bottle.bottleML += 500;
            System.out.println("the amount of water in the bottle is "+bottle.bottleML);
        }

        }

    }

