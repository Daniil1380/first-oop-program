package car;

import java.util.Comparator;

public class Cabriolet extends Car implements Refuelable, Comparable<Cabriolet> {

    public boolean isOpened;

    private EngineType engineType;

    public Cabriolet(int id, String model, String color, int currentSpeed, boolean isOpened) {
        super(id, model, color, currentSpeed);
        this.isOpened = isOpened;
    }

    @Override
    public void drift() {
        System.out.println("Кабриолет не для дрифта, грязь залетела через открытое окно...");
    }

    @Override
    public void refuel() {
        System.out.println("кабриолет зарпавили бензином с высоким октановым числом, 95+");
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public int compareTo(Cabriolet o) {
        String model = getModel();
        String anotherModel = o.getModel();

        if (model == null) {
            return -1;
        }

        if (anotherModel == null) {
            return 1;
        }

        if (model.length() > anotherModel.length()) {
            return 1;
        }

        if (model.length() < anotherModel.length()) {
            return -1;
        }

        return model.compareTo(anotherModel);
    }

}
