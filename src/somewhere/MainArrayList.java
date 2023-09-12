package somewhere;

import car.Cabriolet;
import car.GasStation;

import java.util.ArrayList;

public class MainArrayList {

    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        ArrayList<Cabriolet> cabriolets = new ArrayList<>();

        Cabriolet firstCabriolet = new Cabriolet(1, "BMW", "black", 0, false);
        Cabriolet secondCabriolet = new Cabriolet(2, "Volvo", "yellow", 0, true);

        cabriolets.add(firstCabriolet);
        cabriolets.add(secondCabriolet);

        gasStation.setCabriolets(cabriolets);

        gasStation.printInfoAboutQueue();

    }
}
