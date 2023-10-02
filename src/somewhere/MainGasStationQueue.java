package somewhere;

import car.Cabriolet;
import car.GasStation;

import java.util.ArrayDeque;
import java.util.Queue;

public class MainGasStationQueue {

    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        Cabriolet cabriolet = new Cabriolet(1, "bmw", "black", 0, true);
        Cabriolet cabriolet1 = new Cabriolet(2, "bmw", "black", 0, true);
        Cabriolet cabriolet2 = new Cabriolet(3, "bmw", "black", 0, true);
        Cabriolet cabriolet3 = new Cabriolet(4, "bmw", "black", 0, true);

        Queue<Cabriolet> cabriolets = new ArrayDeque<>();
        cabriolets.add(cabriolet3);
        cabriolets.add(cabriolet);
        cabriolets.add(cabriolet1);
        cabriolets.add(cabriolet2);

        gasStation.setCabrioletQueue(cabriolets);

        gasStation.refuelNext();
        gasStation.refuelNext();
    }
}
